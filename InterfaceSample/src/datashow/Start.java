package datashow;

import java.util.Arrays;
import java.util.List;

public class Start {
	public static void main(String[] args) {

		Professor p = new Professor("Juliana");

		Aluno a = new Aluno("Voce");

		Calendario c = new Calendario(30, 8, 2017);

		SemanaAcademica sm = new SemanaAcademica("Primeira semana de 2017", c);

		SemanaProva sp = new SemanaProva();

		Impressora imp = new Impressora();

		List<Informador> impressoras = Arrays.asList(p, a, c, sm, sp);

		impressoras.forEach(impressora -> {
			System.out.println("Class do objeto atual: "+impressora.getClass().getName());
			imp.imprimir(impressora);
			System.out.println();
		});
	}
}