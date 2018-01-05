package br.com.fatec.engine;

import java.util.Scanner;

public class Main {
	static Agenda agenda = new Agenda();
	public static void main(String[] args) {
		
		String init;
		do {
			init = menu();
		} while (init.equals("0"));
		

	}

	public static String menu() {
		Scanner scan = new Scanner(System.in);
		String menu;
		System.out.println("Escolha uma opcao: ");
		System.out.println("1 - Listar alunos");
		System.out.println("2 - Listar professores");
		System.out.println("3 - Listar todos os contatos");
		System.out.println("4 - Adicionar contato");
		System.out.println("5 - Editar contato");
		System.out.println("6 - Excluir contato");
		System.out.println("0 - Sair");
		menu = scan.next();
		switch (menu) {
		case "0": {
			return "1";
		}
		case "1": {
			agenda.listarAlunos();
			return "0";

		}
		case "2": {
			agenda.listarProf();
			return "0";
		}
		case "3": {
			agenda.listarTodos();
			return "0";
		}
		case "4": {
			agenda.inserir();
			return "0";
		}
		case "5": {
			agenda.editar();
			return "0";
		}
		case "6": {
			agenda.remover();
			return "0";
		}
		default: {
			return "0";
		}

		}
	}

}
