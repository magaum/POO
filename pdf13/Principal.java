package agenda;

public class Principal {

	public static void main(String[] args) {
		try {
			Janela frame = new Janela();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
