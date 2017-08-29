package br.com.fatec.modelo;

public abstract class Pessoa implements Contato {
	private String nome;
	private String telefone;
	private String email;
	@Override
	public String dadosFormatados() {
		String dadosFormatados;
		dadosFormatados = "\nNome: "+this.getNome();
		dadosFormatados = dadosFormatados+"\nTelefone: "+this.getTelefone();
		dadosFormatados = dadosFormatados+"\nEmail: "+this.getEmail();
		
		return dadosFormatados;
	}

}
