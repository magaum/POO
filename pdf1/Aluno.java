package poo;

public class Aluno extends Pessoa {
	public int numMatricula;
	public String turma;
	
	public Aluno(String nome, int numMatricula, String turma) {
		super(nome);
		this.numMatricula = numMatricula;
		this.turma = turma;
	}
}
