package poo;

import java.util.Scanner;

public class Ex6 {
	/*
	 * 
	 * Considere uma grande empresa que paga seu pessoal de vendas com base em
	 * comissões. O pessoal de vendas recebe R$ 200 por semana mais 9% de suas
	 * vendas brutas durante a semana. Desenvolva um aplicativo que receba a entrada
	 * de itens vendidos por um vendedor durante a última semana e calcule e exibe
	 * os rendimentos do vendedor.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		float salario = 200 * 4;
		float itens;
		float total = 0;
		int vendas;

		System.out.print("Digite a quantidade de itens vendidos: ");
		vendas = scan.nextInt();

		for (int i = 0; i < vendas; i++) {
			System.out.printf("Digite o valor do item %d: ", i + 1);
			itens = scan.nextFloat();
			total += itens;
		}
		float comissao = (float) total / 100 * 9;
		System.out.printf("Rendimento: R$ %.2f\n", comissao);
		System.out.printf("Salario mensal: R$ %.2f\n", salario);
		System.out.printf("Salario bruto: R$ %.2f\n", (salario + comissao));

	}

}
