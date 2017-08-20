package poo;

import java.util.Scanner;
import java.util.Spliterator;

public class Ex8Encrypt {
	/*
	 * 
	 * Uma empresa de grande porte quer transmitir dados via internet, mas está
	 * preocupada com a possibilidade de seus telefones estarem grampeados. Ela
	 * pediu para você escrever um programa que criptografe os dados de modo que
	 * estes possam ser transmitidos mais seguramente. Todos os dados são
	 * transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um
	 * inteiro de quatro dígitos inserido pelo usuário e criptográfa-lo desta
	 * maneira: Substitua cada dígito pelo resultado da adição de 7 ao dígito e
	 * obtendo o resto depois da divisão do novo valor por 10. Troque então o
	 * primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então imprima o
	 * inteiro criptográfado. Escreva um outro aplicativo separado que receba como
	 * entrada um inteiro de quatro dígitos criptografado e o descriptografe para
	 * forma o número original.
	 * 
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int num, resto, out = 0, mult = 1000;
		String a;

		System.out.print("Digite um número para ser criptografado: ");
		num = scan.nextInt();
		for (int i = 0; i < 4; i++) {
			// pegando primeiro número a esquerda
			resto = num / mult;
			// removendo casa adicionada em "resto" de "num"
			num -= resto * mult;
			// adiciona 7
			resto += 7;
			resto %= 10;
			// multiplica pela casa equivalente (1000,100,10,1)
			resto *= mult;
			// tira 0 do 1000, a cada loop um 0 é removido
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
