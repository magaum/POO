package ex1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedSet;

public class Main {
	static Agenda agenda = new Agenda();

	public static void main(String[] args) {
		String init;
		do {
			init = menu();
		} while (init.equals("0"));
	}

	public static void limpa() {
		for (int i = 0; i < 100; ++i)
			System.out.println();
	}

	public static String menu() {
		Scanner scan = new Scanner(System.in);
		String menu;
		System.out.println("Escolha uma opcao: ");
		System.out.println("1 - Listar contatos");
		System.out.println("2 - Adicionar contato");
		System.out.println("3 - Editar contato");
		System.out.println("4 - Excluir contato");
		System.out.println("5 - Backup dos contatos");
		System.out.println("6 - Restore");
		System.out.println("0 - Sair");
		menu = scan.next();
		switch (menu) {
		case "0": {
			return "1";
		}

		case "1": {
			agenda.listarTodos();
			return "0";
		}
		case "2": {
			agenda.inserir.run();
			return "0";
		}
		case "3": {
			agenda.editar();
			return "0";
		}
		case "4": {
			agenda.remover.run();
			return "0";
		}

		case "5": {
			Runnable backup = new Runnable() {
				public void run() {
					try {
						FileOutputStream escreveDir = new FileOutputStream("C:\\Users\\wesle\\temp\\agenda.ser");
						ObjectOutputStream escreveBin = new ObjectOutputStream(escreveDir);
						escreveBin.writeObject(agenda.getContatos());
						escreveBin.close();
						System.out.println("Contatos gravados");
					} catch (Exception error) {
						System.out.println(error);
					}
				}
			};
			Thread t = new Thread(backup);
			t.start();
			return "0";
		}

		case "6": {
			Runnable restore = new Runnable() {
				public void run() {
					try {
						FileInputStream leDir = new FileInputStream("C:\\Users\\wesle\\temp\\agenda.ser");
						ObjectInputStream leBin = new ObjectInputStream(leDir);
						SortedSet<Pessoa> restore = (SortedSet<Pessoa>) leBin.readObject();
						leBin.close();
						agenda.setContatos(restore);
						System.out.println("Contatos restaurados");
					} catch (Exception notFound) {
						System.out.println(notFound);
					}
				}
			};
			Thread t = new Thread(restore);
			t.start();
			return "0";
		}
		default: {
			return "0";
		}

		}
	}

}
