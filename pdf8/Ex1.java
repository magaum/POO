import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Ex1 implements FileVisitor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o diretório a ser verificado: ");
		String path = scan.nextLine();
		Ex1 ex1 = new Ex1();
		try {
			Files.walkFileTree(Paths.get(path), ex1);
		} catch (IOException e) {
			System.out.println("Erro ao realizar operação: " + e.getMessage());
		}
		System.out.println("Fim da verificação");
	}

	@Override
	public FileVisitResult postVisitDirectory(Object dir, IOException exc) throws IOException {
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult preVisitDirectory(Object dir, BasicFileAttributes attrs) throws IOException {
		if (attrs.isDirectory()) {
			System.out.println("Diretorio: " + dir);
			return FileVisitResult.CONTINUE;
		} else if (attrs.isOther()) {
			System.out.println("Diretorio: " + dir);
			return FileVisitResult.CONTINUE;
		} else
			System.out.println("Erro: Diretório corrompido");
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
		if (attrs.isSymbolicLink()) {
			System.out.println("\t\tLink: " + file);
			return FileVisitResult.SKIP_SUBTREE;
		} else if (attrs.isRegularFile()) {
			System.out.println("\tArquivo: " + file);
			return FileVisitResult.SKIP_SUBTREE;
		} else if (attrs.isOther()) {
			System.out.println("\tArquivo desconhecido: " + file);
			return FileVisitResult.SKIP_SUBTREE;
		} else
			System.out.println("Erro: arquivo corrompido");
		return FileVisitResult.CONTINUE;

	}

	@Override
	public FileVisitResult visitFileFailed(Object file, IOException exc) throws IOException {
		System.out.println("Erro ao abrir arquivo");
		return FileVisitResult.CONTINUE;
	}
}
