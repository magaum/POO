package br.com.fatec.engine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.fatec.modelo.Aluno;
import br.com.fatec.modelo.Professor;

public class Agenda {
	Scanner scan = new Scanner(System.in);
	private List<Aluno> alunos = new ArrayList<>();
	private List<Professor> professores = new ArrayList<>();
	String opcao;
	String nome;
	int index;

	public void inserir() {

		opcao = selecionarConta();
		if (opcao.equals("1")) {
			System.out.println("Digite as informações do aluno");
			Aluno aluno = new Aluno();
			System.out.println("Nome: ");
			aluno.setNome(scan.next());
			System.out.println("Telefone ");
			aluno.setTelefone(scan.next());
			System.out.println("Email: ");
			aluno.setEmail(scan.next());
			aluno.setNumeroDaMatricula(String.valueOf(alunos.size()));
			alunos.add(aluno);

		} else {
			System.out.println("Digite as informações do professor");
			Professor prof = new Professor();
			System.out.println("Nome: ");
			prof.setNome(scan.next());
			System.out.println("Telefone ");
			prof.setTelefone(scan.next());
			System.out.println("Email: ");
			prof.setEmail(scan.next());
			prof.setNumeroRegistro(String.valueOf(professores.size()));
			System.out.println("Digite a quantidade de horas/aulas: ");
			prof.setQuantidadeHoraAula(scan.next());
			professores.add(prof);
		}
	}

	public void editar() {
		opcao = selecionarConta();
		System.out.println("Qual campo sera editado: ");
		System.out.println("1 - Nome\n2 - Telefone\n3 - Email: ");
		if (opcao.equals("1")) {
			String escolha = scan.next();
			switch (escolha) {

			case "1": {
				listarAlunos();
				System.out.println("Qual aluno sera editado: ");
				index = indexNomeAluno(scan.next());
				if (index == -1) {
					System.out.println("Aluno nao existe");
				} else {
					System.out.println("Digite o novo nome para o aluno");
					alunos.get(index).setNome(scan.next());
					System.out.println("Nome alterado com sucesso");
				}
				break;
			}
			case "2": {
				listarAlunos();
				System.out.println("Qual telefone sera editado: ");
				index = indexTelefoneAluno(scan.next());
				if (index == -1) {
					System.out.println("Telefone nao existe");
				} else {
					System.out.println("Digite o novo telefone para o aluno " + alunos.get(index).getNome());
					alunos.get(index).setTelefone(scan.next());
					System.out.println("Telefone alterado com sucesso");
				}
				break;
			}
			case "3": {
				listarAlunos();
				System.out.println("Qual email sera editado: ");
				index = indexEmailAluno(scan.next());
				if (index == -1) {
					System.out.println("Email nao existe");
				} else {
					System.out.println("Digite o novo email para o aluno " + alunos.get(index).getNome());
					alunos.get(index).setEmail(scan.next());
					System.out.println("email alterado com sucesso");
				}
				break;
			}
			default:
				break;
			}

		} else {
			if (opcao.equals("1")) {
				String escolha = scan.next();
				switch (escolha) {

				case "1": {
					listarProf();
					System.out.println("Qual professor sera editado: ");
					index = indexNomeProf(scan.next());
					if (index == -1) {
						System.out.println("Professor nao existe");
					} else {
						System.out.println("Digite o novo nome para o professor " + nome);
						professores.get(index).setNome(scan.next());
						System.out.println("Nome alterado com sucesso");
					}
					break;
				}
				case "2": {
					listarAlunos();
					System.out.println("Qual telefone sera editado: ");
					index = indexTelefoneProf(scan.next());
					if (index == -1) {
						System.out.println("Telefone nao existe");
					} else {
						System.out
								.println("Digite o novo telefone para o professor " + professores.get(index).getNome());
						professores.get(index).setTelefone(scan.next());
						System.out.println("Telefone alterado com sucesso");
					}
					break;
				}
				case "3": {
					listarAlunos();
					System.out.println("Qual email sera editado: ");
					index = indexEmailProf(scan.next());
					if (index == -1) {
						System.out.println("Email nao existe");
					} else {
						System.out.println("Digite o novo email para o professor " + professores.get(index).getNome());
						professores.get(index).setEmail(scan.next());
						System.out.println("email alterado com sucesso");
					}
					break;
				}
				default:
					break;
				}

			}
		}
	}

	public void remover() {
		opcao = selecionarConta();
		if (opcao.equals("1")) {
			listarAlunos();
			System.out.println("Qual aluno sera removido: ");
			nome = scan.next();
			index = indexNomeAluno(nome);
			if (index == -1) {
				System.out.println("Aluno " + nome + " nao existe");
			} else {
				alunos.remove(index);
			}

		} else {
			listarProf();
			System.out.println("Qual professor sera removido: ");
			nome = scan.next();
			index = indexNomeProf(nome);
			if (index == -1) {
				System.out.println("Professor " + nome + " nao existe");
			} else {
				professores.remove(index);
			}
		}

	}

	public int indexNomeAluno(String nome) {
		index = -1;
		for (int i = 0; i < alunos.size(); i++) {
			if (nome.equals(alunos.get(i).getNome()))
				index = i;
		}
		return index;
	}

	public int indexTelefoneAluno(String telefone) {
		index = -1;
		for (int i = 0; i < alunos.size(); i++) {
			if (telefone.equals(alunos.get(i).getTelefone()))
				index = i;
		}
		return index;
	}

	public int indexEmailAluno(String email) {
		index = -1;
		for (int i = 0; i < alunos.size(); i++) {
			if (email.equals(alunos.get(i).getEmail()))
				index = i;
		}
		return index;
	}

	public int indexNomeProf(String nome) {
		index = -1;
		for (int i = 0; i < professores.size(); i++) {
			if (nome.equals(professores.get(i).getNome()))
				index = i;
		}
		return index;
	}

	public int indexTelefoneProf(String telefone) {
		index = -1;
		for (int i = 0; i < professores.size(); i++) {
			if (telefone.equals(professores.get(i).getTelefone()))
				index = i;
		}
		return index;
	}

	public int indexEmailProf(String email) {
		index = -1;
		for (int i = 0; i < professores.size(); i++) {
			if (email.equals(professores.get(i).getEmail()))
				index = i;
		}
		return index;
	}

	public String selecionarConta() {
		do {
			System.out.println("Selecione o tipo de conta\n1 - Aluno\n2 - Professor");
			opcao = scan.next();
		} while (Integer.valueOf(opcao) < 1 || Integer.valueOf(opcao) > 2);
		return opcao;
	}

	public void listarProf() {
		System.out.println("Professores");
		for (Professor prof : professores) {
			System.out.println(prof.dadosFormatados());
			System.out.println();
		}
	}

	public void listarAlunos() {
		System.out.println("Alunos");
		for (Aluno aluno : alunos) {
			System.out.println(aluno.dadosFormatados());
			System.out.println();
		}
	}

	public void listarTodos() {
		listarProf();
		listarAlunos();
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}
}
