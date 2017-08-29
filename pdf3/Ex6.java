package poo;

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
		
		boolean flag = true;
		String inicio;
		Ex6Clientes clientes = new Ex6Clientes();
		do {
		inicio = Ex6Pessoa.menu();
		if(inicio == null) {
			flag = false;
		}
		else {
		switch (inicio) {
		case "1" : {
			clientes.listaClientes();
			break;
		}
		case "2" : {
			clientes.cadastro();
			break;
		}
		case "3" : {
			clientes.editarDados();
			break;
		}
		case "4" : {
			clientes.exclusão();
			break;
		}
		case "5" : {
			Ex6Raspagem.clienteGastaMaisAnual();
			break;
		}
		case "6" : {
			Ex6Raspagem.clienteGastaMaisMensal();
			break;
		}
		case "7" : {
			Ex6Raspagem.gastoAnual();
			break;
		}
		case "8" : {
			Ex6Raspagem.gastolMensal();
			break;
		}
		default : { 
			break;
		}
		}
		}
		}while (flag != false);
	}

}
