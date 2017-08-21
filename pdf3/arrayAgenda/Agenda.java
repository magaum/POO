package arrayAgenda;

import java.util.Scanner;

import poo.Ex1Pessoa;

public class Agenda {

	private Ex1Pessoa[] pessoas = new Ex1Pessoa[3];
	private Scanner scan = new Scanner(System.in);
	private static int indice = 0;
	private String remove;
	private String nome;
	private String telefone;
	private String email;
	private boolean flag;

	public void adicionaContato() {
		flag = true;
		if (pessoas[indice] == null || pessoas[indice].getNome() == null) {
			System.out.print("Nome: ");
			nome = scan.next();
			System.out.print("Telefone: ");
			telefone = scan.next();
			System.out.print("Email: ");
			email = scan.next();
			for (int i = 0; i < indice; i++) {
				if (nome.equals(pessoas[i].getNome()) || telefone.equals(pessoas[i].getTelefone())
						|| email.equals(pessoas[i].getEmail())) {
					System.out.println("Contato já existe!");
					flag = false;
				}
			}
			if (flag) {
				Ex1Pessoa contato = new Ex1Pessoa(nome, telefone, email);
				pessoas[indice] = contato;
				indice++;
				if (indice > pessoas.length - 1)
					indice = 0;
			}
		} else {
			System.out.println("Agenda lotada!");
		}
	}

	public void excluiContato() {
		exibeContatos();
		System.out.println("Qual contato será removido?");
		remove = scan.next();
		System.out.println("Realmente deseja continuar? [S/n]");
		String escolha = scan.next();
		if (escolha.equals("S") || escolha.equals("s")) {
			for (int i = 0; i < pessoas.length; i++) {
				if (pessoas[i] == null || pessoas[i].getNome() == null)
					continue;
				if (remove.equals(pessoas[i].getNome())) {
					System.out.println("Contato " + remove + " removido");
					Ex1Pessoa contato = new Ex1Pessoa(null, null, null);
					pessoas[i] = contato;
					indice = i;
				}
			}
		}
	}

	public void exibeContatos() {
		for (int i = 0; i < pessoas.length; i++) {
			if (pessoas[i] == null || pessoas[i].getNome() == null) {
				continue;
			} else {
				System.out.println("Nome: " + pessoas[i].getNome());
				System.out.println("Telefone: " + pessoas[i].getTelefone());
				System.out.println("Email: " + pessoas[i].getEmail());
				System.out.println();
			}
		}
	}

	public void exibeOpcoes() {
		System.out.println("Array\n1 - Visualizar contatos");
		System.out.println("2 - Adicionar contato");
		System.out.println("3 - Excluir contato");
		System.out.println("4 - Sair");
	}
}