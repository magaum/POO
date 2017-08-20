package vectorAgenda;

import java.util.Scanner;
import java.util.Vector;

import poo.Ex1Pessoa;

public class Agenda {

	private Vector<Ex1Pessoa> pessoas = new Vector();

	private Scanner scan = new Scanner(System.in);
	private static int indice = 0;
	private String remove;
	private String nome;
	private String telefone;
	private String email;
	private boolean flag;

	public void adicionaContato() {
		flag = true;
		System.out.print("Nome: ");
		nome = scan.next();
		System.out.print("Telefone: ");
		telefone = scan.next();
		System.out.print("Email: ");
		email = scan.next();
		/*
		 * if (pessoas().isEmpty()) return; else { for (int i = 0; i < pessoas().size()
		 * ; i++) { Ex1Pessoa contato = pessoas().get(i); if (contato.getNome()==nome) {
		 * System.out.println("Contato já existe!"); flag = false; } }
		 */

		if (flag) {
			Ex1Pessoa contato = new Ex1Pessoa(nome, telefone, email);
			pessoas.add(contato);
			indice++;

		}
	}

	public void excluiContato() {
		exibeContatos();
		System.out.println("Qual contato será removido?");
		remove = scan.next();
		System.out.println("Realmente deseja continuar? [S/n]");
		String escolha = scan.next();
		if (escolha.equals("S") || escolha.equals("s")) {
			for (int i = 0; i < pessoas.size(); i++) {
				if (nome.equals(pessoas.get(i).getNome())) {
					pessoas.remove(i);
					System.out.println("Contato " + remove + " removido");
				}
			}
		}
	}

	public void exibeContatos() {
		for (int i = 0; i < pessoas.size(); i++) {
			if (pessoas.size() == 0) {
				continue;
			} else {
				System.out.println("Nome: " + pessoas.get(i).getNome());
				System.out.println("Telefone: " + pessoas.get(i).getTelefone());
				System.out.println("Email: " + pessoas.get(i).getEmail());
				System.out.println();
			}
		}
	}

	public void exibeOpcoes() {
		System.out.println("Vector\n1 - Visualizar contatos");
		System.out.println("2 - Adicionar contato");
		System.out.println("3 - Excluir contato");
		System.out.println("4 - Sair");
	}
}