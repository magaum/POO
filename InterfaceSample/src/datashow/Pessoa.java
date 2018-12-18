package datashow;

public abstract class Pessoa implements Informador {

	private final String nome;

	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}
}