package poo;

import java.util.ArrayList;
import java.util.Arrays;
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

public class Ex6Cliente {

	Scanner scan = new Scanner(System.in);

	int tam = 2;
	private int telefone;
	private float[] meses;
	private String nome;
	private String email;
	private String endereco;

	ArrayList<Ex6Cliente> clientes = new ArrayList<>();

	public Ex6Cliente() {
	}

	public Ex6Cliente(int telefone, String nome, String email, String endereco, float meses[]) {
		super();
		this.meses = meses;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
		this.endereco = endereco;
	}

	public void cadastro() {

		System.out.print("Digite o nome do cliente: ");
		this.nome = scan.next();
		System.out.print("Digite o email do cliente: ");
		this.email = scan.next();
		System.out.print("Digite o celular do cliente: ");
		this.telefone = scan.nextInt();
		System.out.print("Digite o endereço do cliente: ");
		this.endereco = scan.next();
		meses = new float[tam];
		for (int i = 0; i < tam; i++) {
			System.out.print("Digite o gasto do cliente no mes " + (i + 1) + ": ");
			meses[i] = scan.nextFloat();
		}
		Ex6Cliente cliente = new Ex6Cliente(telefone, nome, email, endereco,meses);
		clientes.add(cliente);
		System.out.println((this.nome) + " foi adicionado");
	}

	public void clienteGastaMaisAnual() {
		int mes = 0, indice = 0;
		float total = 0, gasto = 0;
		for (int i = 0; i < clientes.size(); i++) {
			float gastoAno[] = clientes.get(i).getMeses();
			while (mes < tam) {
				total += gastoAno[mes];
				mes++;
			}
			if (total > gasto) {
				gasto = total;
				indice = i;
				System.out.println(i);
			}
			mes = 0;
			total = 0;
		}
		System.out.printf("Maior gasto anual R$ %.2f",gasto);
		System.out.println("\nCliente: " + clientes.get(indice).getNome());
	}

	public void clienteGastaMaisMensal() {
		System.out.print("Digite o mes para ser analisado:");
		int mes = scan.nextInt();
		mes--;
		float total = 0, gasto = 0;
		int indice = 0;
		for (int i = 0; i < clientes.size(); i++) {
			total = clientes.get(i).meses[mes];
			if (total > gasto) {
				gasto = total;
				indice = i;
			}
		}
		System.out.printf("Maior gasto mensal: R$ %.2f",gasto);
		System.out.println("\nCliente: " + clientes.get(indice).getNome());
	}

	public void gastoAnual() {
		int mes = 0;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			while (mes < tam) {
				total += clientes.get(i).meses[mes];
				mes++;
			}
			mes = 0;
		}
		System.out.printf("Total gasto no ano: R$ %.2f\n",total);
	}

	public void gastolMensal() {
		System.out.print("Digite o mes para ser analisado:");
		int mes = scan.nextInt();
		mes--;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			total += clientes.get(i).meses[mes];
		}
		System.out.print("Total gasto no mes "+(mes+1));
		System.out.printf(" R$ %.2f\n",total);
	}

	public void exclusão() {
		System.out.println("Digite o nome do cliente: ");
		String nome = scan.next();
		int i = setIndice(nome);
		if (i >= 0) {
			clientes.remove(i);
			System.out.println(nome + " foi removido");
		} else
			System.out.println("Cliente " + nome + " não existe");
	}

	public void editarDados() {
		int indice = -1;
		do {
			listaClientes();
			System.out.println("\nDigite um cliente para editar");
			nome = scan.next();
			indice = setIndice(nome);
			if (indice < 0) {
				System.out.println("Cliente " + nome + " não existe");
			}
		} while (indice < 0);
		System.out.println("Qual campo será editado: \n");
		System.out.println("Telefone\nNome\nEmail\nEndereco\n");
		String campo = scan.next();
		campo = campo.toLowerCase();
		switch (campo) {
		case "telefone": {
			System.out.println("Qual será o novo número: ");
			int novo = scan.nextInt();
			clientes.get(indice).setTelefone(novo);
			break;
		}
		case "nome": {
			System.out.println("Digite o nome nome: ");
			String novo = scan.next();
			clientes.get(indice).setNome(novo);
			break;
		}
		case "email": {
			System.out.println("Qual será o email: ");
			String novo = scan.next();
			clientes.get(indice).setEmail(novo);
			break;
		}
		case "endereco": {
			System.out.println("Qual será o novo número: ");
			String novo = scan.next();
			clientes.get(indice).setEndereco(novo);
			break;
		}

		}

	}

	public void listaClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println();
			System.out.println("Cliente " + (i + 1) + ":");
			System.out.println("Nome: " + clientes.get(i).getNome());
			System.out.println("Email: " + clientes.get(i).getEmail());
			System.out.println("Endereço: " + clientes.get(i).getEndereco());
			System.out.println("Telefone: " + clientes.get(i).getTelefone());
		}
	}

	private int setIndice(String nome) {
		for (int i = 0; i < clientes.size(); i++) {
			if (nome.equals(clientes.get(i).getNome())) {
				return i;
			}
		}
		return -1;
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
