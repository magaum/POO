package poo;

import java.util.Scanner;

public class Ex6Raspagem extends Ex6Clientes {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void clienteGastaMaisAnual() {
		int mes = 0, indice = 0;
		float total = 0, gasto = 0;
		for (int i = 0; i < clientes.size(); i++) {
			float gastoAno[] = clientes.get(i).getMeses();
			while (mes < 12) {
				total += gastoAno[mes];
				mes++;
			}
			if (total > gasto) {
				gasto = total;
				indice = i;
				System.out.println(i);
			}
			mes = 0;
			total = 0;
		}
		System.out.printf("Maior gasto anual R$ %.2f",gasto);
		System.out.println("\nCliente: " + clientes.get(indice).getNome());
	}

	public static void clienteGastaMaisMensal() {
		System.out.print("Digite o mes para ser analisado:");
		int mes = scan.nextInt();
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
		System.out.printf("Maior gasto mensal: R$ %.2f",gasto);
		System.out.println("\nCliente: " + clientes.get(indice).getNome());
	}

	public static void gastoAnual() {
		int mes = 0;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			while (mes < 12) {
				total += clientes.get(i).meses[mes];
				mes++;
			}
			mes = 0;
		}
		System.out.printf("Total gasto no ano: R$ %.2f\n",total);
	}

	public static void gastolMensal() {
		System.out.print("Digite o mes para ser analisado:");
		int mes = scan.nextInt();
		mes--;
		float total = 0;
		for (int i = 0; i < clientes.size(); i++) {
			total += clientes.get(i).meses[mes];
		}
		System.out.print("Total gasto no mes "+(mes+1));
		System.out.printf(" R$ %.2f\n",total);
	}
}
