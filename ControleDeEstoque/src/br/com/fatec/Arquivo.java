package br.com.fatec;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Arquivo implements Serializable{

	public boolean backup(List list, String caminho) {
		try {
			FileOutputStream out = new FileOutputStream(caminho);
			ObjectOutputStream file = new ObjectOutputStream(out);
			file.writeObject(list);
			file.close();
			return true;
		} catch (Exception error) {
			System.out.println(error);
			return false;
		}
	}

	public List restore(List list, String caminho) {
		List out;
		try {
			FileInputStream in = new FileInputStream(caminho);
			ObjectInputStream read = new ObjectInputStream(in);
			out = (List) (read.readObject());
			return out;
		} catch (Exception error) {
			out = new ArrayList<>();
			return out;
		}
	}

}
