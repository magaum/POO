package ex3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
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
				System.out.print("Digite o caminho de destino: ");
				Scanner scan = new Scanner(System.in);
				String caminho = scan.next();				InputStream in = this.conexao.getInputStream();
				File f = new File(caminho);
				FileOutputStream f1 = new FileOutputStream(f);
				int bytes;
				while ((bytes = in.read()) != -1) {
					f1.write(bytes);
				}
				f1.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static void main(String args[]) throws Exception {

		Servidor s = new Servidor();
	}
}