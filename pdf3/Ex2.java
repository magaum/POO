package poo;

import java.util.Scanner;

public class Ex2 {

	/*
	 * Uma empresa que faz negócios por reembolso postal vende cinco produtos cujos
	 * preços de varejo são como segue: P1 R$1,00 – P2 R$2,98 – P3 R$9,98 – P4
	 * R$4,49 e P5 R$6,87. Escreva um aplicativo que leia uma série de pares de
	 * números como segue: código do produto, quantidade vendida. Seu programa deve
	 * determinar o valor total de produtos vendidos, discriminando a porcentagem
	 * vendida em dinheiro de cada produto.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Ex2Produtos p1 = new Ex2Produtos("P1", (float) 1.00);
		Ex2Produtos p2 = new Ex2Produtos("P2", (float) 2.98);
		Ex2Produtos p3 = new Ex2Produtos("P3", (float) 9.98);
		Ex2Produtos p4 = new Ex2Produtos("P4", (float) 4.49);
		Ex2Produtos p5 = new Ex2Produtos("P5", (float) 6.87);

		int produto = 0;
		float total = 0, quant, preco = 0;

		System.out.println("Produtos\ndisponíveis\tPreço:");
		System.out.println("P1\t\tR$1,00");
		System.out.println("P2\t\tR$2,98");
		System.out.println("P3\t\tR$9,98");
		System.out.println("P4\t\tR$4,49");
		System.out.println("P5\t\tR$6,87");
		System.out.print("Quantos tipos de produto foram vendidos: ");
		int lote = scan.nextInt();
		while (lote != 0) {
			System.out.print("Digite a quantidade comprada e código o produto: ");
			quant = scan.nextFloat();
			String cod = scan.next();
			cod = cod.toUpperCase();

			switch (cod) {
			case "P1": {

				preco = p1.calculaPreco(cod, quant);
				total += preco;
				break;
			}
			case "P2": {
				preco += p2.calculaPreco(cod, quant);
				total += preco;
				break;
			}
			case "P3": {
				preco += p3.calculaPreco(cod, quant);
				total += preco;
				break;
			}
			case "P4": {
				preco += p4.calculaPreco(cod, quant);
				total += preco;
				break;
			}
			case "P5": {
				preco += p5.calculaPreco(cod, quant);
				total += preco;
				break;
			}
			default:
				System.out.println("Código invalido");
				continue;
			}
			produto += quant;
			lote--;
		}

		System.out.println("Produtos vendidos: " + produto);
		System.out.printf("Valor: R$ %.2f\n", total);
		p1.imprimePreco(p1);
		p2.imprimePreco(p2);
		p3.imprimePreco(p3);
		p4.imprimePreco(p4);
		p5.imprimePreco(p5);
	}

}
