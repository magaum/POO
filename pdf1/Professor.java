package poo;

public class Professor extends Pessoa{
	
	public int numMatricula;
	public String[] turmas;
	
	public Professor (String nome, int numMatricula) {
		super (nome);
		this.numMatricula = numMatricula;
	}
	
	public void setDisciplinas(String[] turmas) {
		this.turmas = turmas;
	}
}
