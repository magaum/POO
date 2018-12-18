package modificadores;

public class DefaultPessoa {

	String nome;
	int idade;
	int cfp;
	int rg;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCfp() {
		return cfp;
	}

	public void setCfp(int cfp) {
		this.cfp = cfp;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", cfp=" + cfp + ", rg=" + rg +"]";
	}
	
	
}
