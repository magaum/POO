package poo;

import java.util.ArrayList;

public class Ex6Clientes extends Ex6Pessoa{
	
	static ArrayList<Ex6Pessoa> clientes = new ArrayList<>();
	
	public void cadastro() {

		System.out.print("Digite o nome do cliente: ");
		this.nome = scan.next();
		System.out.print("Digite o email do cliente: ");
		this.email = scan.next();
		System.out.print("Digite o celular do cliente: ");
		this.telefone = scan.nextInt();
		System.out.print("Digite o endereço do cliente: ");
		this.endereco = scan.next();
		meses = new float[tam];
		for (int i = 0; i < tam; i++) {
			System.out.print("Digite o gasto do cliente no mes " + (i + 1) + ": ");
			meses[i] = scan.nextFloat();
		}
		Ex6Pessoa cliente = new Ex6Pessoa(telefone, nome, email, endereco,meses);
		clientes.add(cliente);
		System.out.println((this.nome) + " foi adicionado");
	}
	public void exclusão() {
		System.out.println("Digite o nome do cliente: ");
		String nome = scan.next();
		int i = setIndice(nome);
		if (i >= 0) {
			clientes.remove(i);
			System.out.println(nome + " foi removido");
		} else
			System.out.println("Cliente " + nome + " não existe");
	}

	public void editarDados() {
		int indice = -1;
		do {
			listaClientes();
			System.out.println("\nDigite um cliente para editar");
			nome = scan.next();
			indice = setIndice(nome);
			if (indice < 0) {
				System.out.println("Cliente " + nome + " não existe");
			}
		} while (indice < 0);
		System.out.println("Qual campo será editado: \n");
		System.out.println("Telefone\nNome\nEmail\nEndereco\n");
		String campo = scan.next();
		campo = campo.toLowerCase();
		switch (campo) {
		case "telefone": {
			System.out.println("Qual será o novo número: ");
			int novo = scan.nextInt();
			clientes.get(indice).setTelefone(novo);
			break;
		}
		case "nome": {
			System.out.println("Digite o nome nome: ");
			String novo = scan.next();
			clientes.get(indice).setNome(novo);
			break;
		}
		case "email": {
			System.out.println("Qual será o email: ");
			String novo = scan.next();
			clientes.get(indice).setEmail(novo);
			break;
		}
		case "endereco": {
			System.out.println("Qual será o novo número: ");
			String novo = scan.next();
			clientes.get(indice).setEndereco(novo);
			break;
		}

		}
	}
	public void listaClientes() {
		for (int i = 0; i < clientes.size(); i++) {
			System.out.println();
			System.out.println("Cliente " + (i + 1) + ":");
			System.out.println("Nome: " + clientes.get(i).getNome());
			System.out.println("Email: " + clientes.get(i).getEmail());
			System.out.println("Endereço: " + clientes.get(i).getEndereco());
			System.out.println("Telefone: " + clientes.get(i).getTelefone());
		}
	}	
	private int setIndice(String nome) {
		for (int i = 0; i < clientes.size(); i++) {
			if (nome.equals(clientes.get(i).getNome())) {
				return i;
			}
		}
		return -1;
	}

}
