package br.com.fatec.modelo;

public class Aluno extends Pessoa{

	private String numeroDaMatricula;

	@Override
	public String dadosFormatados(){
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados+"\nMatricula: "+this.getNumeroDaMatricula();
		return dadosFormatados;
	}
	
	public String getNumeroDaMatricula() {
		return numeroDaMatricula;
	}

	public void setNumeroDaMatricula(String numeroDaMatricula) {
		this.numeroDaMatricula = numeroDaMatricula;
	}
	
}
