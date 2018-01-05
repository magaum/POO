package br.com.fatec;

public class Pessoa implements Comparable<Pessoa> {
	private String nome;

	private Telefone tel;

	public Pessoa(String nome, Telefone tel) {
		this.nome = nome;
		this.tel = tel;

	}
	
	@Override
	public int compareTo(Pessoa o) {
		return nome.compareTo(o.getNome());
	}

	@Override
	public boolean equals(Object obj) {
		Pessoa outra = (Pessoa) obj;
		return (tel.getNumero() + nome).equals((outra.getTel().getNumero() 
				+ outra.getNome()));
	}

	public Telefone getTel() {
		return tel;
	}

	public void setTel(Telefone tel) {
		this.tel = tel;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
}