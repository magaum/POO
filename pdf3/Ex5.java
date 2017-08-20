package poo;

public class Ex5 {
	/*
	 * Escreva um aplicativo que utiliza um objeto do tipo Array de 1000 elementos
	 * para exibir os números primos entre 2 a 999
	 */
	public static void main(String[] args) {
		int i,j = 0;
		int[] array = new int[1000];
		for (i = 1; i < 999; i++) {
			if (i == 2 || i == 3 || i == 5 || i == 7) {
				array[j]=i;
				j++;
			} else	if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
					continue;
				}else {
					array[j]=i;
					j++;
				}
		}

		for (i = 0; i < array.length; i++)
			System.out.println(array[i]);

	}

}
