import java.io.File;

public class Ex2 {
	public File pegaArquivoMarketin(String nome) {
		File txtMarketin = new File(nome);
		if (!txtMarketin.exists()) {
			System.out.println("Arquivo não existe");
		} else if (txtMarketin.isDirectory()) {
			System.out.println(nome + " é um caminho de diretório");
		}
		return txtMarketin;
	}
}
