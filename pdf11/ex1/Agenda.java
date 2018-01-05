package ex1;

import java.io.Serializable;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class Agenda extends Thread implements Serializable{

	private static final long serialVersionUID = 123L;
	Scanner scan = new Scanner(System.in);
	Pessoa p;
	private SortedSet<Pessoa> contatos = new TreeSet();
	String nome;
	String opcao;
	int index;
	Contato pessoa;

	public SortedSet<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(SortedSet<Pessoa> contatos) {
		this.contatos = contatos;
	}

	Runnable inserir = new Runnable() {
		@Override
		public void run() {
			System.out.println("Digite as informações do contato: ");
			p = new Pessoa();
			contatos.add(p);
		}
	};

	public void editar() {
		System.out.println("Qual campo sera editado: ");
		System.out.println("1 - Nome\n2 - Telefone\n3 - Email: ");
		opcao = scan.next();
		switch (opcao) {
		case "1": {
			listarTodos();
			System.out.print("Qual contato sera editado: ");
			pessoa = getObj(scan.next());
			if (pessoa == null) {
				System.out.print("Contato nao existe");
			} else {
				System.out.print("Digite o novo nome: ");
				pessoa.setNome(scan.nextLine() + ": ");
				System.out.println("Nome alterado com sucesso");
			}
			break;
		}
		case "2": {
			listarTodos();
			System.out.print("Qual telefone sera editado: ");
			pessoa = getObj(scan.next());
			if (pessoa == null) {
				System.out.print("Telefone nao existe");
			} else {
				System.out.println("Digite o novo telefone para o contato " + pessoa.getNome() + ": ");
				pessoa.setTelefone(scan.next());
				System.out.println("Telefone alterado com sucesso");
			}
			break;
		}
		case "3": {
			listarTodos();
			System.out.print("Qual email sera editado: ");
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.println("Email nao existe");
			} else {
				System.out.print("Digite o novo email para o contato " + pessoa.getNome() + ": ");
				pessoa.setEmail(scan.next());
				System.out.println("email alterado com sucesso");
			}
			break;
		}
		default:
			break;
		}
	}

	Runnable remover = new Runnable() {

		@Override
		public void run() {
			listarTodos();
			System.out.print("Qual contato sera removido: ");
			nome = scan.next();
			index = getIndex(nome);
			if (index == -1) {
				System.out.println("Contato " + nome + " nao existe");
			} else {
				System.out.println("Contato " + nome + " foi removido");
				contatos.remove(index);
			}
		}
	};

	public Contato getObj(String verifica) {
		for (Pessoa pessoa : contatos) {
			if(pessoa.getNome() == verifica || pessoa.getTelefone() == verifica || pessoa.getEmail() == verifica)
				return (Contato) pessoa;
		}
		return null;
	}
	
	public int getIndex(String verifica) {
		index = 0;
		boolean flag = false;
		for (Pessoa pessoa : contatos) {
			if(pessoa.getNome() == verifica)
				flag = true;
			index++;
		}
		if(!flag)
			index = -1;
		return index;
	}

	public void listarTodos() {
		for (Pessoa pessoa : contatos) {
			System.out.println("Nome: " + pessoa.getNome());
			System.out.println("Telefone: " + pessoa.getTelefone());
			System.out.println("Email: " + pessoa.getEmail());
		}
	}

}