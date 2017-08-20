package poo;

import java.util.Scanner;

public class Ex4 {

	/*
	 *  Escreva um aplicativo que lê dois inteiros, determina se o primeiro é um múltiplo do
	 *	segundo.
	 * 
	 */
	
	public static void main(String[] args) {
	
		int n1,n2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite dois numeros");
		System.out.print("N1: ");
		n1 = scanner.nextInt();
		System.out.print("N2: ");
		n2 = scanner.nextInt();
		
		if (n1%n2==0)
			System.out.println(n1+" é múltiplo de "+n2);
		else
			System.out.println(n1+" não é múltiplo de "+n2);
	}

}
