package poo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
	 * Uma loja o contratou para desenvolver um aplicativo para gerenciamento de
	 * relacionamento com clientes e minera��o de dados. O objetivo do � armazenar
	 * informa��es sobre cada cliente e o total de gasto por cada cliente ao longo
	 * de 12 meses. Dessa forma escreva um aplicativo que armazene informa��es de
	 * clientes como: Nome, Email, Telefone e Endere�o e de dinheiro gasto para cada
	 * uns dos �ltimos 12 meses. O Aplicativo deve informar o montante gasto por
	 * todos os clientes para cada m�s e para o total do per�odo de 12 meses, al�m
	 * de informar qual foi o cliente que mais gastou dinheiro por m�s e no per�odo
	 * total de 12 meses. O aplicativo tamb�m deve permitir cadastro e exclus�o de
	 * clientes e tamb�m a possibilidade editar dados de clientes como telefone ou
	 * endere�o.
	 */

public class Ex6Cliente {

	Scanner scan = new Scanner(System.in);

	int tam = 2;
	private int telefone;
	private float[] meses = new float[tam];
	private String nome;
	private String email;
	private String endere�o;

	ArrayList<Ex6Cliente> clientes = new ArrayList<>();

	public Ex6Cliente() {
		super();
	}

	public Ex6Cliente(String nome, String email, int telefone, String endere�o, float[] meses) {
		super();
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.meses = meses;
	}

	public float gastolMensal(int mes) {
		mes--;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			total += clientes.get(i).meses[mes];
		}
		return total;
	}

	public float gastoAnual() {
		int mes = 0;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			while (mes < tam) {
				total += clientes.get(i).meses[mes];
				mes++;
			}
		}
		return total;
	}

	public void clienteGastaMaisMensal(int mes) {
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
		System.out.println("Maior gasto mensal\nCliente: " + clientes.get(indice));
	}

	public void clienteGastaMaisAnual() {
		int mes = 0;
		float total = 0, gasto = 0;
		int indice = 0;
		for (int i = 0; i < clientes.size(); i++) {
			while (mes < tam) {
				total += clientes.get(i).meses[mes];
			}
			if (total > gasto) {
				gasto = total;
				indice = i;
			}
			total = 0;
		}
		System.out.println("Maior gasto anual\nCliente: " + clientes.get(indice));
	}

	public void cadastro(String nome, String email, int telefone, String endere�o, float[] meses) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endere�o = endere�o;
		this.meses = meses;
		clientes.add(this);
		System.out.println((this) + "foi adicionado");
	}

	public void exclus�o(String nome) {
		setNome(nome);
		clientes.remove(getNome());
		System.out.println(nome + " foi removido");
	}

	public void editarDados() {
		listaClientes();
		System.out.println("Digite um cliente para editar");
		String nome = scan.next();
		setNome(nome);
		System.out.println("Qual campo ser� editado: \n");
		System.out.println("telefone\nnome\nemail\nemail\nendere�o\nendere�o");
		String campo = scan.next();
		switch (campo) {
		case "telefone": {
			System.out.println("Qual ser� o novo n�mero: ");
			int novo = scan.nextInt();
			setTelefone(novo);
		}
		case "nome": {
			System.out.println("Digite o nome nome: ");
			String novo = scan.next();
			setNome(novo);
		}
		case "email": {
			System.out.println("Qual ser� o email: ");
			String novo = scan.next();
			setEmail(novo);
		}
		case "endere�o": {
			System.out.println("Qual ser� o novo n�mero: ");
			String novo = scan.next();
			setEndere�o(novo);
		}

		}

	}

	public void listaClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println(clientes.toString());
		}

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

	public String getEndere�o() {
		return endere�o;
	}

	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
	}

	@Override
	public String toString() {
		return "[telefone=" + telefone + ", meses=" + Arrays.toString(meses) + ", nome=" + nome + ", email=" + email
				+ ", endere�o=" + endere�o + ", clientes=" + clientes + "]";
	}

}