package poo;

import java.util.ArrayList;

public class Ex6 {
	/*
	 * Uma loja o contratou para desenvolver um aplicativo para gerenciamento de
	 * relacionamento com clientes e minera��o de dados. O objetivo do � armazenar
	 * informa��es sobre cada cliente e o total de gasto por cada cliente ao longo
	 * de 12 meses. Dessa forma escreva um aplicativo que armazene informa��es de
	 * clientes como: Nome, Email, Telefone e Endere�o e de dinheiro gasto para cada
	 * uns dos �ltimos 12 meses. O Aplicativo deve informar o montante gasto por
	 * todos os clientes para cada m�s e para o total do per�odo de 12 meses, al�m
	 * de informar qual foi o cliente que mais gastou dinheiro por m�s e no per�odo
	 * total de 12 meses. O aplicativo tamb�m deve permitir cadastro e exclus�o de
	 * clientes e tamb�m a possibilidade editar dados de clientes como telefone ou
	 * endere�o.
	 */
	public static void main(String[] args) {
		ArrayList<Ex6Cliente> clientes = new ArrayList<>();
		
		Ex6Cliente c1 = new Ex6Cliente("teste","teste@testes.com",1234,"rua birl", null);
		Ex6Cliente c2 = new Ex6Cliente("teste","teste@testes.com",1234,"rua birl", null);

		c1.listaClientes();
	/*	c1.cadastro("nome", "email", 1234, "endere�o", null);
		c1.clienteGastaMaisAnual();
		c1.clienteGastaMaisMensal(1);
		c1.editarDados();
		c1.exclus�o("teste");	*/
		
	}

}
