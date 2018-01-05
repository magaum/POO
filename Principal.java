package br.com.fatec;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Login login = new Login();
		Caixa caixa = new Caixa();
		String opcao;
		caixa.carregar();
		login.carregar();
		do {
			System.out.println("1 - Sign in\n" + "0 - sair");
			opcao = scan.next();
			switch (opcao) {
			case "1": {
				if (login.autenticacao()) {
					opcao = "1";
				} else {
					opcao = "0";
				}
				break;
			}
			
			default:
				opcao = "0";
				break;
			}
		} while (opcao == "0");
		login.salvar();

		if (opcao != "0") {
			do {
				System.out.println("Controle de caixa:\n");
				System.out.println("1 - Registrar despesa\n"
								 + "2 - Registrar pagamento\n"
								 + "3 - Registar recebimento\n"
								 + "4 - Registrar venda\n"
								 + "5 - Salvar alteracoes\n"
								 + "6 - Extrair balanco\n"
								 + "0 - sair");
				opcao = scan.next();
				switch (opcao) {
				case "1": {
					System.out.print("Digite o valor da despesa: ");
					float valor = scan.nextFloat();
					caixa.despesas(valor);
					opcao = "0";
					break;
				}
				case "2": {
					System.out.print("Digite o valor da pagamento: ");
					float valor = scan.nextFloat();
					caixa.pagamento(valor);
					opcao = "0";
					break;
				}

				case "3": {
					System.out.print("Digite o valor do recebimento: ");
					float valor = scan.nextFloat();
					caixa.recebimento(valor);
					opcao = "0";
					break;
				}

				case "4": {
					System.out.print("Digite o valor da venda: ");
					float valor = scan.nextFloat();
					caixa.venda(valor);
					opcao = "0";
					break;
				}

				case "5": {
					caixa.salvar();
					opcao = "0";
					break;
				}
				
				case "6" : {
					caixa.relatorio();
					opcao = "0";
					break;
				}

				default:
					caixa.salvar();
					login.salvar();
					opcao = "1";
				}
			} while (opcao == "0");
		}
	}
}
