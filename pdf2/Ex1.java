package poo;

import java.util.Scanner;

public class Ex1 {

	/*
	 * 
	 * Escreva um aplicativo que solicita ao usu�rio inserir dois n�meros inteiros e imprima a
	 *	soma, subtra��o, divis�o e produto desses dois n�meros.
	 * 
	 */
	public static void main(String args[]) {
		
		int n1,n2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite dois n�meros inteiros: ");
		n1 = scan.nextInt();
		n2 = scan.nextInt();
		System.out.printf("\nN1:\t%d\nN2:\t%d\n\n", n1,n2);
		System.out.println("Soma: "+(n1+n2));
		System.out.println("Subtra��o: "+(n1-n2));
		System.out.println("Divis�o: "+n1/n2);
		System.out.println("Produto: "+n1*n2);
	}
}
