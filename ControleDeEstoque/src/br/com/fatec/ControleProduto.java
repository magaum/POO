
package br.com.fatec;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ControleProduto implements Serializable {
	private List<Produto> produtos = new ArrayList();
	private List<Produto> vendidos = new ArrayList();
	private List<Produto> topVendidos = new ArrayList();
	Arquivo arq = new Arquivo();
	transient Scanner scan = new Scanner(System.in);

	public void relatorio() {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Relatorio extraido em:  " + data.format(System.currentTimeMillis()));
		System.out.println();
		System.out.println("Produtos disponiveis");
		System.out.println();
		for (int i = 0; i < produtos.size(); i++) {
			System.out.println("Nome do produto: " + produtos.get(i).getNome());
			System.out.println("Preco: " + produtos.get(i).getPreco());
			System.out.println("Quantidade disponivel: " + produtos.get(i).getQuantidade());
		}
		System.out.println();
		System.out.println("Produtos vendidos");
		System.out.println();
		for (Produto vendidos : vendidos) {
			System.out.println("Nome do produto: " + vendidos.getNome());
			System.out.println("Preco: " + vendidos.getPreco());
			System.out.println("Produtos vendidos: " + vendidos.getQuantidade());
		}

	}

	public void cadastrarProduto() {
		Produto produto = new Produto();
		String nome;
		int quantidade;
		float preco;
		System.out.print("Digite o nome do produto: ");
		nome = scan.next();
		produto.setNome(nome);
		System.out.print("Digite a quantidade disponivel do produto: ");
		quantidade = scan.nextInt();
		produto.setQuantidade(quantidade);
		System.out.print("Digite o preco do produto: ");
		preco = scan.nextFloat();
		produto.setPreco(preco);
		produtos.add(produto);
	}

	public void cadastrarVenda() {
		Produto p = new Produto();
		String nome;
		int quantidade;
		System.out.print("Digite o nome do produto: ");
		nome = scan.next();
		System.out.print("Digite a quantidade vendida: ");
		quantidade = scan.nextInt();
		for (Produto produto : produtos) {
			if (nome.equals(produto.getNome())) {
				int aux = produto.getQuantidade();
				quantidade = produto.getQuantidade() - quantidade;
				if (quantidade < 0)
					System.out.println("Saldo negativo");
				else {
					produto.setQuantidade(quantidade);
					boolean flag = false;
					for (int i = 0; i < vendidos.size(); i++) {
						if (nome.equals(vendidos.get(i).getNome())) {
							flag = true;
							quantidade = aux - quantidade;
							vendidos.get(i).setQuantidade(quantidade+=vendidos.get(i).getQuantidade());
						}
					}
					if (!flag) {
						p.setNome(produto.getNome());
						p.setPreco(produto.getPreco());
						quantidade = aux - quantidade;
						p.setQuantidade(quantidade);
						vendidos.add(p);
						alteraRanking(p,quantidade);
					}
				}
			}
		}
	}

	public void alteraRanking(Produto produto, int quantidade) {
		for (Produto topVendidos : topVendidos) {
			if(produto.getNome().equals(topVendidos.getNome())) {
				topVendidos.setQuantidade(0);
				topVendidos.setQuantidade(quantidade+=topVendidos.getQuantidade());
			}
		}		
		topVendidos.add(produto);
	}

	public void ranking() {
		Collections.sort(topVendidos);
		System.out.println("Produtos mais vendidos");
		int a = topVendidos.size();
		a--;
		for (int i = a; i >= 0; i--) {
			System.out.println("Nome: " + topVendidos.get(i).getNome());
			System.out.println("Quantidade: " + topVendidos.get(i).getQuantidade());
		}
	}

	public void salvar() {
		arq.backup(vendidos, "C:\\Users\\wesle\\temp\\vendidos.bkp");
		arq.backup(produtos, "C:\\Users\\wesle\\temp\\produtos.bkp");
		arq.backup(topVendidos, "C:\\Users\\wesle\\temp\\topVendidos.bkp");
	}

	public void carregar() {
		vendidos = arq.restore(vendidos, "C:\\Users\\wesle\\temp\\vendidos.bkp");
		produtos = arq.restore(produtos, "C:\\Users\\wesle\\temp\\produtos.bkp");
		topVendidos = arq.restore(topVendidos, "C:\\Users\\wesle\\temp\\topVendidos.bkp");
	}
}