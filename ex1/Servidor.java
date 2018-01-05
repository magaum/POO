package ex1;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {
	ServerSocket server;
	String msg;
	PrintWriter p;

	public Servidor() throws Exception {
		Scanner s = new Scanner(System.in);
		server = new ServerSocket(1234);
		Socket conexao = server.accept();
		while (true) {
			p = new PrintWriter(conexao.getOutputStream());
			if (s.hasNextLine()) {
				msg = s.nextLine();
				enviar(msg, conexao, p);
			}
		}
	}

	public static void main(String args[]) throws Exception {

		Servidor s = new Servidor();
	}

	public static void enviar(String msg, Socket cliente, PrintWriter p) throws Exception {
		p.write(msg);
		p.println();
		p.flush();
	}
}