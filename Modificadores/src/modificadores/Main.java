package modificadores;

public class Main {

	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		p.nome = "Mago";
		p.idade = 20;
		p.rg = 789;
		p.setCfp(908);
		System.out.println(p);
	}

}
