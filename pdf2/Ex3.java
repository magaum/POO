package poo;

import java.util.Scanner;

public class Ex3 {

	/*
	 * Escreva um aplicativo que solicita ao usuário inserir cinco números inteiros
	 * e imprima o maior, o menor número do grupo.
	 * 
	 */
	public static void main(String[] args) {

		int num, maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;

		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 5 numeros\n");

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d° número: ", i+1);
			num = read.nextInt();
			if (num > maior) {
				maior = num;
			}
			if (num < menor) {
				menor = num;
			}
		}
		
		System.out.println("Maior: "+maior);
		System.out.println("Menor: "+menor);
	}

}
