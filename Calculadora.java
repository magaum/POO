package lab1;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Calculadora {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int opcao;
		System.out.println("Calculadora simples");
		System.out.println("0 - Sair");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtrai");
		System.out.println("3 - Divide");
		System.out.println("4 - Multiplica");
		do{
			System.out.print("Digite uma opção valida:");
			opcao = read.nextInt();
		}while(opcao>4 || opcao<0);
		
		int n1, n2;
				
		switch (opcao){
		
		case 1 :
		
			System.out.print("Digite o primeiro numero: ");
			n1 = read.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = read.nextInt();
			System.out.println("A soma dos numeros é: "+(n2+n1));
			break;
			
		case 2 :
			
			System.out.print("Digite o primeiro numero: ");
			n1 = read.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = read.nextInt();
			System.out.println("A subtracao dos numeros é: "+(n1-n2));
			break;
			
		case 3 :
			
			System.out.print("Digite o primeiro numero: ");
			n1 = read.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = read.nextInt();
			System.out.println("A divisao dos numeros é: "+((double)n1/(double)n2));
			break;
			
		case 4 :
			
			System.out.print("Digite o primeiro numero: ");
			n1 = read.nextInt();
			System.out.print("Digite o segundo numero: ");
			n2 = read.nextInt();
			System.out.println("A multiplicacao dos numeros é: "+(n1*n2));
			break;
			
		default :
			//shutdown /h /t 0;
		}
	}
}
