package poo;

import java.util.Scanner;

public class Ex1 {

	/*
	 * 
	 * Escreva um aplicativo que solicita ao usuário inserir dois números inteiros e imprima a
	 *	soma, subtração, divisão e produto desses dois números.
	 * 
	 */
	public static void main(String args[]) {
		
		int n1,n2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite dois números inteiros: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		System.out.printf("\nN1:\t%d\nN2:\t%d\n\n", n1,n2);
		System.out.println("Soma: "+(n1+n2));
		System.out.println("Subtração: "+(n1-n2));
		System.out.println("Divisão: "+n1/n2);
		System.out.println("Produto: "+n1*n2);
	}
}
