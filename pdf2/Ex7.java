package poo;

import java.util.Scanner;

public class Ex7 {
	/*
	 * Desenvolva um aplicativo que determine o salário de um empregado que recebe
	 * por hora trabalhada. A empresa paga “hora normal” para as primeiras 40 horas
	 * trabalhadas e 50% a mais para todas as horas trabalhadas além das 40 horas. O
	 * aplicativo deve receber a quantidade de horas trabalhadas e o valor da hora
	 * normal e calcular o salário bruto do empregado.
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float valorHora;
		float aux = 40;
		int horas;

		System.out.print("Digite o valor da hora trabalhada: R$ ");
		valorHora = scan.nextFloat();
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		horas = scan.nextInt();
		if (horas <= 40)
			System.out.printf("Salario bruto: R$ %.2f\n", horas * valorHora);
		else {
			horas -= aux;
			System.out.printf("Salario bruto: R$ %.2f\n",(aux + horas) * valorHora + horas * valorHora / 2);
		}
	}
}
