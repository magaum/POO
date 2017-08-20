package poo;

import java.util.Scanner;

public class Ex4 {
	/*
	 * Escreva um método múltiplo() que determina um par de inteiros se segundo é
	 * múltiplo do primeiro. O método deve retorna o valor boleano true se o segundo
	 * número for múltiplo do primeiro
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
			System.out.println(n2 + " é múltiplo de " + n1);
		else
			System.out.println(n2 + " não é múltiplo de " + n1);
	}
}
