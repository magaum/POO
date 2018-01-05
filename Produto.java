package br.com.fatec;

import java.io.Serializable;

public class Produto implements Serializable , Comparable<Produto>{

	private static final long serialVersionUID = 1L;
	private String nome;
	private String quantidade;	
	
	public int compareTo(Produto p) {
		return nome.compareTo(p.getNome());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

}
