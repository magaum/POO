import java.io.File;

public class Ex2 {
	public File pegaArquivoMarketin(String nome) {
		File txtMarketin = new File(nome);
		if (!txtMarketin.exists()) {
			System.out.println("Arquivo n�o existe");
		} else if (txtMarketin.isDirectory()) {
			System.out.println(nome + " � um caminho de diret�rio");
		}
		return txtMarketin;
	}
}
