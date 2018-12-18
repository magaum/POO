package modificadores2;

import modificadores.*;

public class Principal extends ProtectedPessoa{

	public static void main(String[] args) {
		modificadores.ProtectedPessoa p1 = new modificadores.ProtectedPessoa();
		DefaultPessoa p2 = new DefaultPessoa();
		p1.setIdade(10);
		p2.setCfp(0);

	}

}
