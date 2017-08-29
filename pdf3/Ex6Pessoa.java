package poo;

import java.util.Scanner;

import javax.swing.JOptionPane;

/*
	 * Uma loja o contratou para desenvolver um aplicativo para gerenciamento de
	 * relacionamento com clientes e mineração de dados. O objetivo do é armazenar
	 * informações sobre cada cliente e o total de gasto por cada cliente ao longo
	 * de 12 meses. Dessa forma escreva um aplicativo que armazene informações de
	 * clientes como: Nome, Email, Telefone e endereco e de dinheiro gasto para cada
	 * uns dos últimos 12 meses. O Aplicativo deve informar o montante gasto por
	 * todos os clientes para cada mês e para o total do período de 12 meses, além
	 * de informar qual foi o cliente que mais gastou dinheiro por mês e no período
	 * total de 12 meses. O aplicativo também deve permitir cadastro e exclusão de
	 * clientes e também a possibilidade editar dados de clientes como telefone ou
	 * endereco.
	 */

public class Ex6Pessoa {

	Scanner scan = new Scanner(System.in);

	int tam = 12;
	protected int telefone;
	protected float[] meses;
	protected String nome;
	protected String email;
	protected String endereco;

	public Ex6Pessoa() {
	}

	public Ex6Pessoa(int telefone, String nome, String email, String endereco, float meses[]) {
		super();
		this.meses = meses;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public float[] getMeses() {
		return meses;
	}

	public void setMeses(float[] meses) {
		this.meses = meses;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public static String menu() {
		String opcao = JOptionPane.showInputDialog("1 - Listar clientes\n" + "2 - Adicionar cliente\n"
				+ "3 - Editar dados de clientes\n" + "4 - Excluir clientes\n" + "5 - Cliente com maior gasto anual\n"
				+ "6 - Cliente com maior gasto mensal\n" + "7 - Total gasto anual\n" + "8 - Total gasto mensal\n");
		return opcao;
	}
}
