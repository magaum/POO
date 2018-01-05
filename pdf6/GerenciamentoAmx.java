package br.com.fatec;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class GerenciamentoAmx implements Serializable {

	private static final long serialVersionUID = 1L;
	Scanner scan = new Scanner(System.in);
	Arquivo arq = new Arquivo();
	private List<Produto> produtos = new ArrayList<>();
	private int index;
	private String opcao;
	Produto novoP;

	public void cadastrar() {
		novoP = new Produto();
		System.out.print("Digite o nome do produto: ");
		novoP.setNome(scan.next());
		System.out.print("Digite a quantidade em estoque disponivel: ");
		novoP.setQuantidade(scan.next());
		produtos.add(novoP);
		System.out.println("Produto " + novoP.getNome() + " foi adicionado");
	}

	public void editar() {
		relatorio();
		System.out.print("Qual produto sera editado: ");
		index = validaIndex(scan.nextLine());
		if (index != -1) {
			System.out.println("Qual campo do produto " + produtos.get(index).getNome() + " sera editado:");
			System.out.println("1 - Nome\n2 - Quantidade");
			opcao = scan.next();
			switch (opcao) {
			case "1": {
				System.out.print("Digite o novo nome do produto: ");
				produtos.get(index).setNome(scan.next());
				System.out.println("Nome do produto foi alterado");
				break;
			}
			case "2": {
				System.out.print("Digite a nova quantidade do produto: ");
				produtos.get(index).setQuantidade(scan.next());
				System.out.println("Quantidade do produto foi alterada");
				break;
			}
			}
		}
	}

	public void removerProd() {
		relatorio();
		System.out.print("Qual produto sera removido: ");
		index = validaIndex(scan.nextLine());
		if (index != -1) {
			System.out.println("Produto " + produtos.get(index).getNome() + " foi removido");
			produtos.remove(index);
		}
	}

	public void removerUnidade() {
		relatorio();
		System.out.print("Qual produto sera editado: ");
		index = validaIndex(scan.nextLine());
		if (index != -1) {
			int quantidade = Integer.valueOf(produtos.get(index).getQuantidade());
			System.out.println("Digite a quantidade de produtos retirados do almoxarifado: ");
			int removeUni = scan.nextInt();
			quantidade -= removeUni;
			produtos.get(index).setQuantidade(String.valueOf(quantidade));
			System.out.println("Dados salvos");
		}
	}

	public void relatorio() {
		System.out.println("Produto\t\t|\t\tQuantidade\t\tTotal: " + produtos.size());
		for (Produto produto : produtos) {
			System.out.print(produto.getNome() + "\t\t");
			System.out.print("|\t\t" + produto.getQuantidade());
			System.out.println();
		}
	}

	public void salvar() {
		arq.backup(produtos);
	}

	@SuppressWarnings("unchecked")
	public void recuperar(boolean flag) {
		produtos = arq.restore();
		if (flag == true) {
			if (produtos == null) {
				System.out.println("Algum problema ocorreu");
			} else
				System.out.println("Dados restaurados");
		}
	}

	public int validaIndex(String nome) {
		for (int i = 0; i < produtos.size(); i++) {
			if (produtos.get(i).getNome().equals(nome))
				return i;
		}
		System.out.println("Produto inesistente");
		return -1;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

}
