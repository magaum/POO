package poo;

public class Ex5 {

	/*
	 * 
	 * 	Desenvolva um aplicativo que determinará se um cliente de uma loja de
	 *	departamentos excedeu o limite de crédito em uma conta-corrente. Para cada cliente,
	 *	os seguintes fatos estão disponíveis: número da conta, saldo no início do mês, total
	 *	de todos os itens cobrados desse cliente no mês, total de créditos aplicados ao cliente
	 *	no mês e limite de crédito autorizado. O programa deve inserir todos esses fatos com
	 *	ponteiros, calcular o novo saldo (= saldo inicial + despesas - créditos), exibir o novo
	 *	saldo e determinar se o novo saldo excede o limite de crédito do cliente. Avisar se o
	 *	crédito do cliente está excedido ou não.
	 * 
	 */
	public static void main(String[] args) {
	
		ClienteEx5 cliente1 = new ClienteEx5(1,1000,50,500,1000);
		ClienteEx5 cliente2 = cliente1;
		
		cliente2.setSaldoIniMes(3000);
		cliente2.setDespesas(577);
		cliente2.setLimiteAut(1500);
		cliente2.setNumConta(2);
		cliente2.setTotalCredito(652);	

		cliente1.calcularNovoSaldo(cliente1.getSaldoIniMes(),cliente1.getDespesas(),cliente1.getTotalCredito());
		System.out.println(cliente1);
		cliente2.calcularNovoSaldo(cliente2.getSaldoIniMes(),cliente2.getDespesas(),cliente2.getTotalCredito());
		System.out.println(cliente2);
	}

}
