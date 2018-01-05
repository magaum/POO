package ex3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda extends Thread implements Serializable {

	private static final long serialVersionUID = 123L;
	Scanner scan = new Scanner(System.in);
	// Arquivo arq = new Arquivo();
	Pessoa p;
	private List<Pessoa> contatos = new ArrayList<>();
	String nome;
	String opcao;
	int index;

	public List<Pessoa> getContatos() {
		return contatos;
	}

	public void setContatos(List<Pessoa> contatos) {
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
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.print("Contato nao existe");
			} else {
				System.out.print("Digite o novo nome: ");
				contatos.get(index).setNome(scan.nextLine() + ": ");
				System.out.println("Nome alterado com sucesso");
			}
			break;
		}
		case "2": {
			listarTodos();
			System.out.print("Qual telefone sera editado: ");
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.print("Telefone nao existe");
			} else {
				System.out.println("Digite o novo telefone para o contato " + contatos.get(index).getNome() + ": ");
				contatos.get(index).setTelefone(scan.next());
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
				System.out.print("Digite o novo email para o contato " + contatos.get(index).getNome() + ": ");
				contatos.get(index).setEmail(scan.next());
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

	public int getIndex(String verifica) {
		index = -1;
		for (int i = 0; i < contatos.size(); i++) {
			if (contatos.get(i).getEmail().equals(verifica) || contatos.get(i).getNome().equals(verifica)
					|| contatos.get(i).getTelefone().equals(verifica)) {
				index = i;
				return index;
			}
		}
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