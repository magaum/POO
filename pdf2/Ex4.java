package poo;

import java.util.Scanner;

public class Ex4 {

	/*
	 *  Escreva um aplicativo que l� dois inteiros, determina se o primeiro � um m�ltiplo do
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
			System.out.println(n1+" � m�ltiplo de "+n2);
		else
			System.out.println(n1+" n�o � m�ltiplo de "+n2);
	}

}
