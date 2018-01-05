package ex1;
import java.net.Socket;
import java.util.Scanner;

public class Cliente {
	Socket cliente;
	static Scanner scan;
	
	public Cliente() throws Exception {
		 cliente = new Socket("127.0.0.1",1234);
		 }
	
	public static void main(String args[]) throws Exception {
		Cliente c = new Cliente();
		String msg;
		while(true) {
			scan = new Scanner(c.cliente.getInputStream());
			while((msg = scan.nextLine()) != null) {
				System.out.println(msg);
			}
			
		}
	}
}