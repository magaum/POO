package br.com.fatec.modelo;

@SuppressWarnings("serial")
public class Aluno extends Pessoa {
	
	private String numeroDaMatricula;

	public Aluno(String numeroDaMatricula) {
		super();
		this.numeroDaMatricula = numeroDaMatricula;
	}

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nMatricula: " + this.getNumeroDaMatricula();
		return dadosFormatados;
	}

	public String getNumeroDaMatricula() {
		return numeroDaMatricula;
	}

	public void setNumeroDaMatricula(String numeroDaMatricula) {
		this.numeroDaMatricula = numeroDaMatricula;
	}

}
