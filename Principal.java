import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		Ex2 ex = new Ex2();
		System.out.print("Digite o caminho do arquivo: ");
		String entrada = scanner.nextLine();
		System.out.println("Processando...");
		FileReader fr = new FileReader(ex.pegaArquivoMarketin(entrada));
		BufferedReader br = new BufferedReader(fr);
		String linha = br.readLine();
		System.out.print("Digite o caminho de saida do arquivo: ");
		String saida = scanner.nextLine();
		System.out.print("Processando ...");
		FileWriter write = new FileWriter(saida);
		while (linha != null) {
			String[] palavras = linha.split(" ");
			for (String palavra : palavras) {
				System.out.print(".");
				if (palavra.contains("@") && palavra.contains(".com")) {
					write.write(palavra + "\r\n");
				}
			}
			linha = br.readLine();
		}
		System.out.println();
		System.out.println("Arquivo salvo no caminho: " + saida);
		write.close();
		fr.close();
		br.close();
	}

}
