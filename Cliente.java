package EP3;

import java.util.Scanner;

public class Cliente {
	
	private static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args){
		Cliente cliente = new Cliente();
		
		System.out.print("Digite o nome do Cliente Comum: ");
		String clienteComum = teclado.nextLine();
		
		System.out.print("Digite o nome do Cliente Especial: ");
		String clienteEspecial = teclado.nextLine();
		
		cliente.teste1(clienteComum);
		cliente.teste2(clienteEspecial);
	}
	
	public void teste1(String nome){
		ClienteComum clienteComum = new ClienteComum();
		
		try {
			clienteComum.cadastro(nome);
			System.out.println("Cliente: " + nome + ". Adicionado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro em cliente comum!");
		}
	}
	
	public void teste2(String nome){
		ClienteEspecial clienteEspecial = new ClienteEspecial();
		
		try {
			clienteEspecial.cadastro(nome);
			System.out.println("Cliente: " + nome + ". Adicionado com sucesso!");
		} catch (IllegalArgumentException e) {
			System.out.println("Erro em cliente especial!");
		}
	}
}

class ClienteComum extends Cliente{
	
	public void cadastro(String nome){
		if (nome.equalsIgnoreCase("falha")) {
			throw new IllegalArgumentException();
		}
	}
}

class ClienteEspecial extends Cliente{
	
	public void cadastro(String nome){
		if (nome.equalsIgnoreCase("falha")) {
			throw new IllegalArgumentException();
		}
	}
}