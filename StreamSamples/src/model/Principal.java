package model;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Principal {
	public static void main(String args[]) {
		List<Pessoa> listaPessoas = Arrays.asList(new Pessoa("Joao", 32), new Pessoa("Antonio", 20),
				new Pessoa("Maria", 18), new Pessoa("Angela", 30));

		somaIdade("A", listaPessoas);
		somaIdadeThread("A", listaPessoas);
		idadeMax("A", listaPessoas);
		idadeMin("A", listaPessoas);
		somaMinMax("A", listaPessoas);
	}

	public static void somaIdade(String inicioDoNome, List<Pessoa> listaPessoas) {

		Stream<Pessoa> streamPessoas = listaPessoas.stream();

		Integer somaIdade = streamPessoas.filter(p -> p.getNome().startsWith(inicioDoNome)).mapToInt(p -> p.getIdade())
				.sum();
		System.out.println("somaIdade: " + somaIdade);
	}

	public static void somaIdadeThread(String inicioDoNome, List<Pessoa> listaPessoas) {
		Stream<Pessoa> streamPessoas = listaPessoas.parallelStream();
		Integer somaIdade = streamPessoas.filter(p -> p.getNome().startsWith(inicioDoNome)).mapToInt(p -> p.getIdade())
				.sum();
		System.out.println("somaIdadeThread: " + somaIdade);
	}

	public static void idadeMin(String inicioDoNome, List<Pessoa> listaPessoas) {
		Stream<Pessoa> streamPessoas = listaPessoas.stream();
		Integer menorIdade = streamPessoas.mapToInt(p -> p.getIdade()).min().getAsInt();
		System.out.println(menorIdade);
	}

	public static void idadeMax(String inicioDoNome, List<Pessoa> listaPessoas) {
		Stream<Pessoa> streamPessoas = listaPessoas.stream();
		Integer maiorIdade = streamPessoas.mapToInt(p -> p.getIdade()).max().getAsInt();
		System.out.println(maiorIdade);
	}

	public static void somaMinMax(String inicioDoNome, List<Pessoa> listaPessoas) {
		Stream<Pessoa> streamPessoas = listaPessoas.stream();

		IntSummaryStatistics intSummStat = streamPessoas.filter(p -> p.getNome().startsWith(inicioDoNome))
				.mapToInt(p -> p.getIdade()).summaryStatistics();

		System.out.println(intSummStat.getSum());
		System.out.println(intSummStat.getMax());
		System.out.println(intSummStat.getMin());
	}

	public static void idadeAverage(String inicioDoNome, List<Pessoa> listaPessoas) {
		IntStream intStream = listaPessoas.stream().mapToInt(p -> p.getIdade());
		Double mediaIdades = intStream.average().getAsDouble();
		System.out.println(mediaIdades);
	}

	public static void encontrandoNomePorIdade(String inicioDoNome, List<Pessoa> listaPessoas) {
		Stream<Pessoa> streamPessoas = listaPessoas.stream();
		List<Pessoa> listPessoas = streamPessoas.filter(p -> p.getNome().startsWith(inicioDoNome)).collect(Collectors.toList());
		listaPessoas.forEach(System.out::println);

		Stream<Pessoa> streamPessoas2 = listaPessoas.stream();
		Set<Pessoa> setPessoas = streamPessoas2.filter(p -> p.getNome().startsWith(inicioDoNome)).collect(Collectors.toSet());
		setPessoas.forEach(System.out::println);
	}

	public static void encontrandoPessoasComIdadeMaior(String inicioDoNome, List<Pessoa> listaPessoas) {
		Optional<Pessoa> optPessoa = listaPessoas.stream().filter(p -> p.getIdade() > 20).findFirst();

		if (optPessoa.isPresent()) {
			Pessoa p = optPessoa.get();
			System.out.println(p.getIdade());
		}

		optPessoa.ifPresent(p -> System.out.println(p.getIdade()));
		optPessoa.orElseThrow(null);
		optPessoa.orElse(new Pessoa("Joao", 28));
	}
}
