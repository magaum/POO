package br.com.fatec;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int l1 = 0, l2 = 0, l3 = 0;
		while (l1 == 0) {
			System.out.print("Digite o 1 valor: ");
			l1 = scan.nextInt();
		}
		while (l2 == 0) {
			System.out.print("Digite o 2 valor: ");
			l2 = scan.nextInt();
		}
		while (l3 == 0) {
			System.out.print("Digite o 3 valor: ");
			l3 = scan.nextInt();
		}

		if (l1 < l3 && l2 < l3) {
			if(l1*l1+l2*l2==l3*l3) {
				retangulo();
			}else
				naoRetangulo();
		}
		else if (l1 < l2 && l3 < l2) {
			if(l1*l1+l3*l3==l2*l2) {
				retangulo();
			}else
				naoRetangulo();
		}else if (l3 < l1 && l2 < l1) {
			if(l3*l3+l2*l2==l1*l1) {
				retangulo();
			}else
				naoRetangulo();
		}else {
			naoRetangulo();
		}
	}

	public static void retangulo() {
		System.out.println("Triangulo retangulo");
	}
	
	public static void naoRetangulo()	{
		System.out.println("Não é triangulo retangulo");
	}
}
