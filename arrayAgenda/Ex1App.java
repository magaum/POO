package arrayAgenda;

import java.util.Scanner;

public class Ex1App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]) {
		Agenda agenda = new Agenda();
		int sair = 0;
		int opcao = 0;
		while (sair == 0) {
			switch (opcao) {
				case 0: {
					agenda.exibeOpcoes();
					opcao = scanner.nextInt();
					break;
				}
				case 1: {
					agenda.exibeContatos();
					opcao = 0;
					break;
				}
				case 2:{
					agenda.adicionaContato();
					opcao = 0;
					break;
				}
				case 3: {
					agenda.excluiContato();
					opcao = 0;
					break;
				}
				case 4:{
					sair = 1;
					break;
				}
				default:{
					agenda.exibeOpcoes();
					opcao=scanner.nextInt();
					break;
				}
			}
		}
	}
}