package ex2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor implements Runnable {
	ServerSocket server;
	String msg;
	Socket conexao;

	public Servidor() throws Exception {
		server = new ServerSocket(1234);
		while (true) {
			conexao = server.accept();
			new Thread(new Servidor(conexao)).start();
		}
	}

	public Servidor(Socket conexao) throws Exception {
		this.conexao = conexao;
	}

	@Override
	public void run() {
		try {
			while (true) {
				Scanner scan = new Scanner(this.conexao.getInputStream());
				while ((msg = scan.nextLine()) != null) {
					System.out.println(msg);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) throws Exception {

		Servidor s = new Servidor();
	}
}