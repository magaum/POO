

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Digite o tamanho do array: ");
		int n = scan.nextInt();
		int[] array = new int[n];
		for (int i = 0; i < n; i++) {
			array[i] = scan.nextInt();
		}

		int p = equilibrio(array, n);
		if (p == -1) {
			System.out.println("Indice de equilibrio não encontrado");
		} else {
			System.out.println(p + " é o indice de equilibrio");
		}
	}

	public static int equilibrio(int[] array, int n) {
		int aux = 0;
		int soma1 = 0, soma2 = 0;
		for (int i = 0; i < n; i++) {
			soma1 += array[i];
			for (aux = n-1; aux >= 0; aux--) {
				soma2 += array[aux];
				if (soma1 == soma2) {
					return i+1;
				}
			}
			soma2 = 0;
		}
		return -1;
	}
}
