package poo;

import java.util.ArrayList;

public class Ex6 {
	/*
	 * Uma loja o contratou para desenvolver um aplicativo para gerenciamento de
	 * relacionamento com clientes e mineração de dados. O objetivo do é armazenar
	 * informações sobre cada cliente e o total de gasto por cada cliente ao longo
	 * de 12 meses. Dessa forma escreva um aplicativo que armazene informações de
	 * clientes como: Nome, Email, Telefone e Endereço e de dinheiro gasto para cada
	 * uns dos últimos 12 meses. O Aplicativo deve informar o montante gasto por
	 * todos os clientes para cada mês e para o total do período de 12 meses, além
	 * de informar qual foi o cliente que mais gastou dinheiro por mês e no período
	 * total de 12 meses. O aplicativo também deve permitir cadastro e exclusão de
	 * clientes e também a possibilidade editar dados de clientes como telefone ou
	 * endereço.
	 */
	public static void main(String[] args) {
		ArrayList<Ex6Cliente> clientes = new ArrayList<>();
		
		Ex6Cliente c1 = new Ex6Cliente("teste","teste@testes.com",1234,"rua birl", null);
		Ex6Cliente c2 = new Ex6Cliente("teste","teste@testes.com",1234,"rua birl", null);

		c1.listaClientes();
	/*	c1.cadastro("nome", "email", 1234, "endereço", null);
		c1.clienteGastaMaisAnual();
		c1.clienteGastaMaisMensal(1);
		c1.editarDados();
		c1.exclusão("teste");	*/
		
	}

}
