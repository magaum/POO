package poo;

import java.util.Scanner;

public class Ex3 {
	/*
	 * Um estacionamento cobra uma taxa mínima de R$2,00 para estacionar por até
	 * três horas. Um adicional de R$0,50 por hora não necessariamente inteira é
	 * cobrado após as três primeiras horas. Escreva um aplicativo que calcule e
	 * exiba as taxas de estacionamento para um cliente que estacionou. O aplicativo
	 * deve receber o intervalo de tempo que o veículo ficou estacionado e exibir a
	 * cobrança para o cliente.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int horas;
		int minutos;
		int count = 0;
		System.out.println("Tarifas\nR$ 2,00 até 3 horas\nAdicional de R$ 0,50 após 3 horas");
		System.out.print("Intervalo de tempo em 'horas:minutos' ");
		String tempo = scan.next();
		horas = Integer.parseInt(tempo.substring(0, 2));
		minutos = Integer.parseInt(tempo.substring(3, 5));
		minutos += horas * 60;
		if (minutos <= 180) {
			System.out.println("###Nota fiscal###\n\nTotal de horas: " + tempo);
			if (minutos % 60 == 0)
				System.out.printf("Valor total R$ %.2f", (float) minutos / 60 * 2.0);
			else {
				System.out.printf("Valor total R$ %.2f", (int) minutos / 60 * 2.0 + 2);
			}
		} else {
			int adicional = minutos - 180;

			minutos -= adicional;
			if (adicional > 60) {
				if (adicional % 60 != 0) {
					count = adicional % 60;
				}
				adicional /= 60;
			}
			System.out.println("###Nota fiscal###\n\nTotal de horas: " + tempo);
			if (count == 0)
				System.out.printf("Valor total R$ %.2f", (float) minutos / 60 * adicional * 2.0);
			else {
				System.out.printf("Valor total R$ %.2f", (int) minutos / 60 * 2.0 * adicional + 0.50);
			}
		}

	}

}
