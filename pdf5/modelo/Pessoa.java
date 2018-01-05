package br.com.fatec.modelo;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public abstract class Pessoa implements Contato, Serializable{
	transient Scanner scan = new Scanner(System.in);
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa() {
		System.out.println("Nome: ");
		this.nome = scan.next();
		System.out.println("Telefone: ");
		this.telefone = scan.next();
		System.out.println("Email: ");
		this.email = scan.next();
	}
	
	@Override
	public String dadosFormatados() {
		String dadosFormatados;
		dadosFormatados = "\nNome: "+this.getNome();
		dadosFormatados = dadosFormatados+"\nTelefone: "+this.getTelefone();
		dadosFormatados = dadosFormatados+"\nEmail: "+this.getEmail();
		
		return dadosFormatados;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}