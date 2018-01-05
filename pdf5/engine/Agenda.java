package br.com.fatec.engine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Pessoa;
import br.com.fatec.modelo.Professor;

public class Agenda implements Serializable {

	private static final long serialVersionUID = 123L;
	Scanner scan = new Scanner(System.in);
	Arquivo arq = new Arquivo();
	private List<Pessoa> contatos = new ArrayList<>();
	String opcao;
	String nome;
	int index;
	Aluno aluno;
	Professor prof;

	public void inserir() {
		do {
			System.out.println("Selecione o tipo de conta\n1 - Aluno\n2 - Professor");
			opcao = scan.next();
		} while (Integer.valueOf(opcao) < 1 || Integer.valueOf(opcao) > 2);
		if (opcao.equals("1")) {
			System.out.println("Digite as informações do aluno");
			aluno = new Aluno(String.valueOf(contatos.size()));
			contatos.add(aluno);

		} else {
			System.out.println("Digite as informações do professor");
			prof = new Professor(String.valueOf(contatos.size()));
			System.out.println("Digite a quantidade de horas/aulas: ");
			prof.setQuantidadeHoraAula(scan.next());
			contatos.add(prof);
		}
	}

	public void editar() {
		System.out.println("Qual campo sera editado: ");
		System.out.println("1 - Nome\n2 - Telefone\n3 - Email: ");
		opcao = scan.next();
		switch (opcao) {
		case "1": {
			listarTodos();
			System.out.println("Qual contato sera editado: ");
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.println("Contato nao existe");
			} else {
				System.out.print("Digite o novo nome: ");
				contatos.get(index).setNome(scan.next());
				System.out.println("Nome alterado com sucesso");
			}
			break;
		}
		case "2": {
			listarTodos();
			System.out.println("Qual telefone sera editado: ");
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.println("Telefone nao existe");
			} else {
				System.out.println("Digite o novo telefone para o contato " + contatos.get(index).getNome());
				contatos.get(index).setTelefone(scan.next());
				System.out.println("Telefone alterado com sucesso");
			}
			break;
		}
		case "3": {
			listarTodos();
			System.out.println("Qual email sera editado: ");
			index = getIndex(scan.next());
			if (index == -1) {
				System.out.println("Email nao existe");
			} else {
				System.out.println("Digite o novo email para o contato " + contatos.get(index).getNome());
				contatos.get(index).setEmail(scan.next());
				System.out.println("email alterado com sucesso");
			}
			break;
		}
		default:
			break;
		}
	}

	public void remover() {
		listarTodos();
		System.out.println("Qual contato sera removido: ");
		nome = scan.next();
		index = getIndex(nome);
		if (index == -1) {
			System.out.println("Contato " + nome + " nao existe");
		} else {
			contatos.remove(index);
		}
	}

	public void salvarAgenda() {
		if (arq.backup(contatos))
			System.out.println("Backup realizado com sucesso");
		else
			System.out.println("Algum problema ocorreu");
	}

	public void recuperarAgenda() {
		if (arq.restore() != null) {
			contatos = arq.restore();
			System.out.println("Contatos restaurados");
		} else
			System.out.println("Algum problema ocorreu");
	}

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
			System.out.println(pessoa.dadosFormatados());
		}
	}
}