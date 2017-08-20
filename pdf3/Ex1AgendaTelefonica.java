package poo;

import java.util.Scanner;

public class Ex1AgendaTelefonica {
	private Ex1Pessoa[] pessoas;
	private Scanner scanner;

	public Ex1AgendaTelefonica() {
		pessoas = new Ex1Pessoa[5];
		scanner = new Scanner(System.in);
	}

	public void cadastrarPessoa() {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null) {
				System.out.println("\nInsira um nome para a pessoa: ");
				String nome = scanner.next();
				System.out.println("\nInsira um telefone para a pessoa: ");
				String telefone = scanner.next();
				System.out.println("\nInsira um email para a pessoa: ");
				String email = scanner.next();
				Ex1Pessoa nova = new Ex1Pessoa(nome, telefone, email);
				pessoas[i] = nova;
				System.out.println("\nNovo contato adicionado com sucesso\n");
				break;
			}
		}
	}

	public void imprimeOpcoes() {
		System.out.println("\nEscolha uma das op��es: \n");
		System.out.println("1 - Listar contatos. \n");
		System.out.println("2 - Incluir contatos. \n");
		System.out.println("3 - Sair");
	}

	public void imprimirPessoas() {
		for (Ex1Pessoa pessoa : pessoas) {
			if(pessoa != null) {
				System.out.println("\nNome: "+pessoa.getNome()+"\nTelefone: "
						+pessoa.getTelefone()+"\nEmail: "+pessoa.getEmail());
			}
		}
	}

	public Ex1Pessoa [] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Ex1Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}
}
