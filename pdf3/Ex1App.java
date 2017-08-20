package poo;

import java.util.Scanner;

public class Ex1App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Ex1AgendaTelefonica agenda = new Ex1AgendaTelefonica();
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
			case 0: {
				agenda.imprimeOpcoes();
				opcao = scanner.nextInt();
				break;
			}
			case 1: {
				agenda.imprimirPessoas();
				opcao = 0;
				break;
			}
			case 2:{
				agenda.cadastrarPessoa();
				opcao=0;
				break;
			}
			case 3:{
				sair =1;
				System.out.println("\nAté mais");
				break;
			}
			default:{
				agenda.imprimeOpcoes();
				opcao=scanner.nextInt();
				break;
			}
			}
		}
	}
}