package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		/*int [] inteiros = new int[5];
		inteiros[0] = 18;
		//esta linha da erro de index
		inteiros[5] = 19;*/
		/*
		Vector <Integer> inteirosV = new Vector<>();
		inteirosV.add(13);
		inteirosV.add(14);
		inteirosV.add(15);
		System.out.println(inteirosV.size());
		System.out.println(inteirosV.get(2));*/
		
	/*	Vector <Pessoa> pessoas = new Vector<>();
		pessoas.add(new Pessoa("teste"));
		pessoas.add(new Pessoa("Birl"));
		Pessoa p = new Pessoa("OHHHH");
		pessoas.add(p);
		pessoas.remove(0);
		pessoas.remove(p);
		
		for(int i = 0; i < pessoas.size();i++){
			System.out.println(pessoas.get(i).getNome());
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}*/
		/*
		ArrayList <Pessoa> pessoas = new ArrayList<>();
		pessoas.add(new Pessoa("teste"));
		pessoas.add(new Pessoa("Birl"));
		Pessoa p = new Pessoa("OHHHH");
		Pessoa p1 = new Pessoa("OHHHH");
		if(p == p1){
			System.out.println("Iguais");
		}else{
			System.out.println("diferente");
		}
		pessoas.add(p);
		pessoas.remove(0);
		pessoas.remove(p);
		
		for(int i = 0; i < pessoas.size();i++){
			System.out.println(pessoas.get(i).getNome());
		}
		
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa.getNome());
		}*/
		
		ArrayList <Pessoa> pessoas = new ArrayList<>();
		Pessoa p = new Pessoa("OHHHH", new Telefone(132));
		Pessoa p1 = new Pessoa("AHHHH",new Telefone(564));
		Pessoa p2 = new Pessoa("teste", new Telefone(465));
		Pessoa p3 = new Pessoa("Birl", new Telefone(321));
	
		pessoas.add(p);
		pessoas.add(p1);
		pessoas.add(p2);
		pessoas.add(p3);
		
		Collections.sort(pessoas);
		
		for(int i = 0; i < pessoas.size();i++){
			System.out.println(pessoas.get(i).getNome());
		}
		
		
	}

}
