package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	Socket cliente;
	Scanner scan;
	String caminho;
	static File f;

	public Cliente(String caminho) throws Exception {
		 cliente = new Socket("127.0.0.1",1234);
		 this.caminho = caminho;
	}
	
	public static void main(String args[]) throws Exception {
		System.out.print("Digite o caminho do arquivo: ");
		
		Scanner scan = new Scanner(System.in);
		String caminho = scan.nextLine();
		Cliente c = new Cliente(caminho);
		f = new File(c.caminho);
		OutputStream out = c.cliente.getOutputStream();
		FileInputStream fout = new FileInputStream(f);
		while(true) {
			if (fout.read() != -1) {
				enviar(c.caminho, c.cliente, fout, out);
			}
		}
	}
	public static void enviar(String caminho, Socket cliente, FileInputStream f, OutputStream out) throws Exception {
		int bytes;
		while((bytes = f.read()) != -1) {
			out.write(bytes);
			out.flush();
		}
		f.close();
	}
}