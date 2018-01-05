package br.com.fatec.engine;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

import br.com.fatec.modelo.Pessoa;

public class Arquivo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 123L;

	public boolean backup(List list) {
		try {
		FileOutputStream escreveDir = new FileOutputStream("C:\\Users\\wesle\\temp\\agenda.ser");
		ObjectOutputStream escreveBin = new ObjectOutputStream(escreveDir);
		escreveBin.writeObject(list);
		escreveBin.close();
		return true;
		}catch (Exception error) {
			System.out.println(error);
			return false;
		}
	}
	
	public List restore() {
		try {
		FileInputStream leDir = new FileInputStream("C:\\Users\\wesle\\temp\\agenda.ser");
		ObjectInputStream leBin = new ObjectInputStream(leDir);
		List<Pessoa> restore = (List<Pessoa>) leBin.readObject();
		leBin.close();
		return restore;
		}catch (Exception notFound) {
			System.out.println(notFound);
			return null;
		}
	}
}
