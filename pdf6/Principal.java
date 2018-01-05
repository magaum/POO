package br.com.fatec;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		String init;
		GerenciamentoAmx g = new GerenciamentoAmx();
		g.recuperar(false);
		do {
			init = menu(g);
		} while (init.equals("0"));
	}

	
	public static String menu(GerenciamentoAmx g) {
		Scanner scan = new Scanner(System.in);
		String opcao;
		System.out.println("Sistema de gerenciamento");
		System.out.println("1 - Cadastro de produto\n"
				+ "2 - Editar produto\n" 
				+ "3 - Remover produto\n"
				+ "4 - Remover unidade\n" + "5 - Listar produtos\n" 
				+ "6 - Backup\n" 
				+ "7 - Restore\n"
				+ "0 - Sair"
		);
		opcao = scan.next();
		switch (opcao) {
		case "1": {
			g.cadastrar();
			return "0";
		}
		case "2": {
			g.editar();
			return "0";
		}

		case "3": {
			g.removerProd();
			return "0";
		}

		case "4": {
			g.removerUnidade();
			return "0";
		}

		case "5": {
			List prod = g.getProdutos();
			Collections.sort(prod);
			g.relatorio();
			return "0";
		}

		case "6": {
			g.salvar();
			return "0";
		}

		case "7": {
			g.recuperar(true);
			return "0";
		}

		case "0": {
			System.out.print("Deseja salvar as alterações antes de sair? [S/n]");
			opcao = scan.next();
			opcao = opcao.toLowerCase();
			if (opcao.equals("s")) {
				g.salvar();
			}
			return "";
		}

		default:
			return "0";
		}
	}
}
