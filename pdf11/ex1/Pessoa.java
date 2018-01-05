package ex1;

import java.io.Serializable;
import java.util.Scanner;

@SuppressWarnings("serial")
public class Pessoa implements Serializable, Comparable<Pessoa> {
	transient Scanner scan = new Scanner(System.in);
	private String nome;
	private String telefone;
	private String email;
	
	public Pessoa() {
		System.out.print("Nome: ");
		this.nome = scan.nextLine();
		System.out.print("Telefone: ");
		this.telefone = scan.next();
		System.out.print("Email: ");
		this.email = scan.next();
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

	@Override
	public int compareTo(Pessoa p) {
		return nome.compareTo(p.getNome());
	}

}