package br.com.fatec.modelo;

@SuppressWarnings("serial")
public class Professor extends Pessoa {
	private String numeroRegistro;
	private String quantidadeHoraAula;

	public Professor(String numeroRegistro) {
		super();
		this.numeroRegistro = numeroRegistro;
	}

	@Override
	public String dadosFormatados() {
		String dadosFormatados = super.dadosFormatados();
		dadosFormatados = dadosFormatados + "\nRegistro: " + this.getNumeroRegistro();
		dadosFormatados = dadosFormatados + "\nHora/Aula: " + this.getQuantidadeHoraAula();
		return dadosFormatados;
	}

	public String getNumeroRegistro() {
		return numeroRegistro;
	}

	public void setNumeroRegistro(String numeroRegistro) {
		this.numeroRegistro = numeroRegistro;
	}

	public String getQuantidadeHoraAula() {
		return quantidadeHoraAula;
	}

	public void setQuantidadeHoraAula(String quantidadeHoraAula) {
		this.quantidadeHoraAula = quantidadeHoraAula;
	}
}
