package br.com.fatec;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ControleProduto controleProduto = new ControleProduto();
		String opcao;
		controleProduto.carregar();
			do {
				System.out.println();
				System.out.println("1 - Cadastrar produtos\n"
								 + "2 - Cadastrar venda\n"
								 + "3 - Relatorios\n"
								 + "4 - Ranking\n"
								 + "0 - sair\n");
				opcao = scan.next();
				switch (opcao) {
				case "1": {
					controleProduto.cadastrarProduto();
					opcao = "0";
					break;
				}
				case "2": {
					controleProduto.cadastrarVenda();
					opcao = "0";
					break;
				}

				case "3": {
					controleProduto.relatorio();
					opcao = "0";
					break;
				}
				
				case "4": {
					controleProduto.ranking();
					opcao = "0";
					break;
				}
				default : {
					break;
				}
			} 
			}while (opcao == "0");
			controleProduto.salvar();
	}
}
