package br.com.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Login implements Serializable {

	private static final long serialVersionUID = 1L;
	private String usuario;
	private String senha;
	private List<Login> usuarios = new ArrayList<>();
	Arquivo arq = new Arquivo();
	transient Scanner scan = new Scanner(System.in);

	public void novoLogin() {
		Login novo = new Login();
		String login;
		String senha;
		do {
			System.out.print("Login: ");
			login = scan.next();
			novo.setUsuario(login);
		} while (login.isEmpty());
		do {
			System.out.print("Senha: ");
			senha = scan.next();
			novo.setSenha(senha);
		} while (senha.isEmpty());
		usuarios.add(novo);
		System.out.println("Usuario cadastrado");
	}

	public void salvar() {
		arq.backup(usuarios, "C:\\Users\\wesle\\temp\\login.bkp");
	}

	public void carregar() {
		usuarios = arq.restore(usuarios, "C:\\Users\\wesle\\temp\\login.bkp");
	}

	public boolean autenticacao() {
		System.out.print("Login: ");
		String login = scan.next();
		System.out.print("Senha: ");
		String senha = scan.next();

		if (validaUsuario(login, senha)) {
			System.out.println("Bem vindo");
			return true;
		} else {
			System.out.print("Login ou senha invalido, deseja tentar novamente? S/n");
			String escolha = scan.next();
			if (escolha.toLowerCase().equals("s")) {
				autenticacao();
			}
		}
		return false;
	}

	private boolean validaUsuario(String login, String senha) {
		if (login.equals("admin") && senha.equals("admin")) {
			novoLogin();
			return true;
		}
		else {
			for (int i = 0; i < usuarios.size(); i++) {
				if (login.equals(usuarios.get(i).getUsuario()) && senha.equals(usuarios.get(i).getSenha())) {
					return true;
				}
			}
		}
		return false;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public List getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List usuarios) {
		this.usuarios = usuarios;
	}
}
