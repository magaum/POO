package poo;

import java.util.Scanner;

public class Ex4 {
	/*
	 * Escreva um m�todo m�ltiplo() que determina um par de inteiros se segundo �
	 * m�ltiplo do primeiro. O m�todo deve retorna o valor boleano true se o segundo
	 * n�mero for m�ltiplo do primeiro
	 */
	public static void main(String[] args) {

		int n1, n2;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite dois numeros");
		System.out.print("N1: ");
		n1 = scanner.nextInt();
		System.out.print("N2: ");
		n2 = scanner.nextInt();

		Ex4Multiplo mult = new Ex4Multiplo();
		if (mult.multiplo(n1, n2) == true)
			System.out.println(n2 + " � m�ltiplo de " + n1);
		else
			System.out.println(n2 + " n�o � m�ltiplo de " + n1);
	}
}
