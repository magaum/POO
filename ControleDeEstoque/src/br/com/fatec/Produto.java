package br.com.fatec;

import java.io.Serializable;

public class Produto implements Serializable, Comparable<Produto> {

	private static final long serialVersionUID = 1L;
	private String nome;
	private Integer quantidade;
	private float preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	@Override
	public int compareTo(Produto produto) {
		return quantidade.compareTo(produto.quantidade);
	}
}