package poo;

public abstract class Pessoa {
	private String nome;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public String getNome(String nome) {
		return this.nome;
	}
}
