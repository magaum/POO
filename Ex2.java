package br.com.fatec;

import java.util.Scanner;

public class Ex2 {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int tam = 0;
		System.out.println("Apenas os numeros entre 1 e 20 são validos");
		do {
			System.out.print("Digite o tamanho do lado do quadradado: ");
			tam = scan.nextInt();
		}while  (tam < 1 || tam > 20);
		int meio = tam / 2;
		tam += 2;
		for (int y = 0; y != tam; y++) {
			for (int x = 0; x != tam; x++) {
				// imprime linhas
				if (y == 0 || y == tam - 1)
					System.out.print("*");
				// imprime colunas
				else if (x == 0 || x == tam - 1)
					System.out.print("*");
				else
					System.out.print(" ");
				// System.out.print("y["+y+"]x["+x+"] ");
			}
			if (y == meio / 2)
				meio /= 2;
			System.out.println();
		}
	}
}
