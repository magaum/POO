package poo;

import java.util.Scanner;

public class Ex3 {

	/*
	 * Escreva um aplicativo que solicita ao usu�rio inserir cinco n�meros inteiros
	 * e imprima o maior, o menor n�mero do grupo.
	 * 
	 */
	public static void main(String[] args) {

		int num, maior=Integer.MIN_VALUE, menor=Integer.MAX_VALUE;

		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite 5 numeros\n");

		for (int i = 0; i < 5; i++) {
			System.out.printf("Digite o %d� n�mero: ", i+1);
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
