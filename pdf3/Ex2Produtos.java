package poo;

public class Ex2Produtos {

	private String codigo;
	private float preco;
	private float total;

	public Ex2Produtos(String codigo, float preco) {
		this.codigo = codigo;
		this.preco = preco;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public float calculaPreco(String codigo, float quant) {
		setCodigo(codigo);
		float preco = getPreco();
		float total = preco * quant;
		this.total = total;
		return total;
	}
	public void imprimePreco(Ex2Produtos p) {
		if(p.getTotal()>0)
			System.out.printf("R$ %.2f em %s\n",p.getTotal(),p.getCodigo());
	}
}
