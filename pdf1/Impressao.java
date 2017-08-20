package poo;

import java.util.Scanner;

public class Impressao {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = 5;
		int n1,n2;
		System.out.println("Primeiro programa");
		System.out.printf("%d \n",a);
		System.out.print("Digite o número 1: ");
		n1 = scan.nextInt();
		System.out.print("Digite o número 2: ");
		n2 = scan.nextInt();
		
		if(n1>n2)
			System.out.println(n1+" é maior");
		if(n1<n2)
			System.out.println(n2+" é maior");
		if (n1==n2)
			System.out.println("Os números são iguais");
	}

}
