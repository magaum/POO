package poo;

import java.util.Scanner;

public class Ex2 {
	/*
	 * Escreva um aplicativo que solicita ao usu�rio inserir dois n�meros inteiros e
	 * imprima a soma, a m�dia e imprima os n�meros em ordem crescente
	 * 
	 */
	public static void main(String[] args) {

		int n1, n2, media, soma;

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite dois n�meros inteiros: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		media = (n1 + n2) / 2;
		soma = n1 + n2;
		
		System.out.println("Soma: "+soma);
		System.out.println("Media: "+media);

		if (n1 > n2) {
			System.out.printf("\nN1:\t%d\nN2:\t%d\n\n", n1, n2);
			}
		else {
			System.out.printf("\nN2:\t%d\nN1:\t%d\n\n", n2, n1);
		}
	}

}
