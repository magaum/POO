package ex2;

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	Socket cliente;
	Scanner scan;
	String nome;
	static PrintWriter p;

	public Cliente(String nome) throws Exception {
		 cliente = new Socket("127.0.0.1",1234);
		 this.nome = nome;
	}
	
	public static void main(String args[]) throws Exception {
		System.out.print("Digite seu nome: ");
		Scanner scan = new Scanner(System.in);
		Cliente c = new Cliente(scan.nextLine());
		p = new PrintWriter(c.cliente.getOutputStream());
		String msg;
		while(true) {
			if (scan.hasNextLine()) {
				msg = scan.nextLine();
				enviar(msg,c.nome, c.cliente, p);
			}

			
		}
	}
	public static void enviar(String msg,String nome, Socket cliente, PrintWriter p) throws Exception {
		p.write(nome+" > "+msg);
		p.println();
		p.flush();
	}
}