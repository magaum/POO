import java.util.Scanner;

public class Ex3 {

	private static Scanner scan;

	public static void main(String[] args) {
		// A 65
		// Z 90
		String diamante;
		int num;
		scan = new Scanner(System.in);
		do {
			System.out.print("Digite a profundidade do diamante: ");
			diamante = scan.next();
			num = diamante.charAt(0) + 0;
		} while (num < 65 && num > 90);
		diamante = diamante.toUpperCase();
		aberto(num);
	}

	public static void aberto(int num) {
		int espacoDireita = 25; // Espa�os da direita
		int espacoMeio = 0; // Espa�os do meio
		int auxEspacoMeio = 0; // Variavel para manter valor do espa�o do meio
		int auxEspaco = espacoDireita - 1; // Variavel para manter valor do espa�o da direita
		int inicio = 65; // Valor de "A" em ascii
		for (int i = 65; i <= num; i++) { //Itera��es de "A" at� o valor digitado na linha 14
			for (int j = 64; j < i; j++) { //Vari�vel j sempre fica atr�s de i para ser incrementada duas vezes
				while (espacoDireita > 0) {//imprime espa�os da direita
					System.out.print(" ");
					espacoDireita--;
				}
				if (j < 66) //A vale 65 em Ascii, todas as outras letras ser�o impressas duas vezes, menos A
					System.out.printf("%c", inicio);
				while (espacoMeio > 0) {//Imprime espa�os do meio
					System.out.print(" ");
					espacoMeio--;
				}
			}
			auxEspacoMeio += 2; //Incrementa espa�os do meio
			espacoMeio = auxEspacoMeio; //Retorna valor do espa�o do meio
			espacoDireita = auxEspaco--;//decrementa espa�os da direita
			inicio++;//Passa para a proxima letra do alfabeto
			System.out.println();
		}
		fechado(num, espacoDireita, inicio, espacoMeio, auxEspaco, auxEspacoMeio); //Chama outra fun��o
	}

	public static void fechado(int num, int espacoDireita, int inicio, int espacoMeio, int auxEspaco,
			int auxEspacoMeio) {
		if (inicio > num) {
			inicio -= 2;
			espacoMeio -= 4;
			auxEspacoMeio = espacoMeio;
			espacoDireita += 2;
			auxEspaco = espacoDireita;
		}
		for (int i = num; i > 65; i--) {
			for (int j = i - 1; j <= i; j++) {
				while (espacoDireita > 0) {
					System.out.print(" ");
					espacoDireita--;
				}
				if (j > 65)
					System.out.printf("%c", inicio);
				while (espacoMeio > 0) {
					System.out.print(" ");
					espacoMeio--;
				}
			}
			auxEspacoMeio -= 2;
			espacoMeio = auxEspacoMeio;
			espacoDireita = auxEspaco += 1;
			inicio--;
			System.out.println();
		}
	}

}
