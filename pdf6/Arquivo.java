package br.com.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Arquivo {

	@SuppressWarnings("rawtypes")
	public boolean backup(List list) {
		try {
			FileOutputStream arq = new FileOutputStream("C:\\Users\\wesle\\temp\\produtos.bkp");
			ObjectOutputStream out = new ObjectOutputStream(arq);
			out.writeObject(list);
			out.close();
			System.out.println("Backup concluido");
			return true;
		} catch (Exception a) {
			System.out.println("Algum erro ocorreu" + a);
			return false;
		}
	}

	@SuppressWarnings({ "rawtypes", "unchecked","resource" })
	public List restore() {
		try {
		FileInputStream arq = new FileInputStream ("C:\\Users\\wesle\\temp\\produtos.bkp");
		ObjectInputStream in = new ObjectInputStream (arq);
		return (List <Produto>)(in.readObject());
		}
		catch (Exception erro) {
			List prod = new ArrayList<Produto>();
			return prod;
		}
		}
}
