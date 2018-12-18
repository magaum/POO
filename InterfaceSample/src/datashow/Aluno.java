package datashow;

public class Aluno extends Pessoa {

	public Aluno(String nome) {
		super(nome);
	}

	@Override
	public void informar() {
		System.out.println("Nome do aluno: " + getNome());
	}

}