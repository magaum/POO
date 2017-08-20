package poo;

public class Ex5 {

	/*
	 * 
	 * 	Desenvolva um aplicativo que determinar� se um cliente de uma loja de
	 *	departamentos excedeu o limite de cr�dito em uma conta-corrente. Para cada cliente,
	 *	os seguintes fatos est�o dispon�veis: n�mero da conta, saldo no in�cio do m�s, total
	 *	de todos os itens cobrados desse cliente no m�s, total de cr�ditos aplicados ao cliente
	 *	no m�s e limite de cr�dito autorizado. O programa deve inserir todos esses fatos com
	 *	ponteiros, calcular o novo saldo (= saldo inicial + despesas - cr�ditos), exibir o novo
	 *	saldo e determinar se o novo saldo excede o limite de cr�dito do cliente. Avisar se o
	 *	cr�dito do cliente est� excedido ou n�o.
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
