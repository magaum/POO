package poo;

import java.util.Scanner;
import java.util.Spliterator;

public class Ex8Encrypt {
	/*
	 * 
	 * Uma empresa de grande porte quer transmitir dados via internet, mas est�
	 * preocupada com a possibilidade de seus telefones estarem grampeados. Ela
	 * pediu para voc� escrever um programa que criptografe os dados de modo que
	 * estes possam ser transmitidos mais seguramente. Todos os dados s�o
	 * transmitidos como inteiros de quatro d�gitos. Seu aplicativo deve ler um
	 * inteiro de quatro d�gitos inserido pelo usu�rio e criptogr�fa-lo desta
	 * maneira: Substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito e
	 * obtendo o resto depois da divis�o do novo valor por 10. Troque ent�o o
	 * primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o imprima o
	 * inteiro criptogr�fado. Escreva um outro aplicativo separado que receba como
	 * entrada um inteiro de quatro d�gitos criptografado e o descriptografe para
	 * forma o n�mero original.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, resto, out = 0, mult = 1000;
		String a;

		System.out.print("Digite um n�mero para ser criptografado: ");
		num = scan.nextInt();
		for (int i = 0; i < 4; i++) {
			// pegando primeiro n�mero a esquerda
			resto = num / mult;
			// removendo casa adicionada em "resto" de "num"
			num -= resto * mult;
			// adiciona 7
			resto += 7;
			resto %= 10;
			// multiplica pela casa equivalente (1000,100,10,1)
			resto *= mult;
			// tira 0 do 1000, a cada loop um 0 � removido
			mult /= 10;
			out += resto;
		}

		// armazenando os dois primeiros digitos de "out"
		resto = out / 100;
		// removendo os dois primeiros digitos de "out"
		out %= 100;
		// adicionando 2 zeros em "out" para somar com os valores que ficaram em "resto"
		// e inverte-los
		out *= 100;
		// somando os valores para retornar
		out += resto;
		System.out.println(out);
	}
}
