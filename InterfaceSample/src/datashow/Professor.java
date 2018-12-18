package datashow;

public class Professor extends Pessoa {

	public Professor(String nome) {
		super(nome);
	}

	@Override
	public void informar() {
		System.out.println("Nome do professor: " + getNome());
	}

}
