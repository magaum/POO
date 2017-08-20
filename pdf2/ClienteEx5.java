package poo;

public class ClienteEx5 {

	private int numConta;
	private int saldoIniMes;
	private int despesas;
	private int totalCredito;
	private int limiteAut;
	
	
	public ClienteEx5(int numConta, int saldoIniMes, int despesas, int totalCredito, int limiteAut) {
		this.numConta = numConta;
		this.saldoIniMes = saldoIniMes;
		this.despesas = despesas;
		this.totalCredito = totalCredito;
		this.limiteAut = limiteAut;
	}

	public int getNumConta() {
		return numConta;
	}


	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}


	public int getSaldoIniMes() {
		return saldoIniMes;
	}


	public void setSaldoIniMes(int saldoIniMes) {
		this.saldoIniMes = saldoIniMes;
	}


	public int getDespesas() {
		return despesas;
	}


	public void setDespesas(int despesas) {
		this.despesas = despesas;
	}


	public int getTotalCredito() {
		return totalCredito;
	}


	public void setTotalCredito(int totalCredito) {
		this.totalCredito = totalCredito;
	}


	public int getLimiteAut() {
		return limiteAut;
	}


	public void setLimiteAut(int limiteAut) {
		this.limiteAut = limiteAut;
	}


	public void calcularNovoSaldo(int saldoIniMes, int depesas, int totalCredito) {
		
		int novoSaldo = saldoIniMes+despesas-totalCredito;
		
		System.out.println(novoSaldo);
		
		if (novoSaldo>this.limiteAut)
			System.out.println("Limite excedido!!!");
		else
			System.out.println("Limite ok!");
	}

	@Override
	public String toString() {
		return "ClienteEx5 [numConta=" + numConta + ", saldoIniMes=" + saldoIniMes + ", despesas=" + despesas
				+ ", totalCredito=" + totalCredito + ", limiteAut=" + limiteAut + "]";
	}
	
}
