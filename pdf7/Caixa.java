
package br.com.fatec;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Caixa implements Serializable {
	private int entradas=0;
	private int saidas=0;
	private float totalEntrada = 0;
	private float totalSaida = 0;
	private List despesa = new ArrayList();
	private List pagamento = new ArrayList();
	private List recebimento = new ArrayList();
	private List venda = new ArrayList();
	private List<Caixa> caixa = new ArrayList<>();
	Arquivo arq = new Arquivo();

	public void relatorio() {
		SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Balanco Patrimonial extraido em " + data.format(System.currentTimeMillis()));
		System.out.println();
		System.out.println("Entrada");
		System.out.println();
		System.out.println("despesa: ");
		saidaFormatada(despesa);
		System.out.println();
		System.out.println("pagamento: ");
		saidaFormatada(pagamento);
		System.out.println();
		System.out.println("recebimento: ");
		saidaFormatada(recebimento);
		System.out.println();
		System.out.println("venda: ");
		saidaFormatada(venda);
		System.out.println();
		totalEntrada();
		totalSaida();
		System.out.println("Total entradas: "+entradas);
		System.out.println("Total saidas: "+saidas);
		System.out.println("Capital: R$"+(totalEntrada-totalSaida));
		System.out.println();

	}

	public void totalEntrada() {
		for (int i = 0; i < venda.size(); i++) {
			totalEntrada += (float) venda.get(i);
			entradas++;
		}
		for (int i = 0; i < recebimento.size(); i++) {
			totalEntrada += (float) recebimento.get(i);
			entradas++;
			}
	}

	public void totalSaida() {
		for (int i = 0; i < pagamento.size(); i++) {
			totalSaida += (float) pagamento.get(i);
			saidas++;
		}
		for (int i = 0; i < despesa.size(); i++) {
			totalSaida += (float) despesa.get(i);
			saidas++;
		}
	}
	public void saidaFormatada(List lista) {
		for (int i = 0; i < lista.size(); i++) {
			System.out.println("R$ " + lista.get(i));
		}
	}

	public void salvar() {
		arq.backup(despesa, "C:\\Users\\wesle\\temp\\despesa.bkp");
		arq.backup(pagamento, "C:\\Users\\wesle\\temp\\pagamento.bkp");
		arq.backup(recebimento, "C:\\Users\\wesle\\temp\\recebimento.bkp");
		arq.backup(venda, "C:\\Users\\wesle\\temp\\venda.bkp");
	}

	public void carregar() {
		despesa = arq.restore(despesa, "C:\\Users\\wesle\\temp\\despesa.bkp");
		pagamento = arq.restore(pagamento, "C:\\Users\\wesle\\temp\\pagamento.bkp");
		recebimento = arq.restore(recebimento, "C:\\Users\\wesle\\temp\\recebimento.bkp");
		venda = arq.restore(venda, "C:\\Users\\wesle\\temp\\venda.bkp");
	}

	public void despesas(float valor) {
		despesa.add(valor);
	}

	public void pagamento(float valor) {
		pagamento.add(valor);
	}

	public void recebimento(float valor) {
		recebimento.add(valor);
	}

	public void venda(float valor) {
		venda.add(valor);
	}
}