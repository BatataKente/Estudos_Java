package curso.I;

import java.util.Scanner;

public class Aula_4_B {
	private static Scanner input = new Scanner(System.in);
	private static Aula_4_Cliente[] clientes = new Aula_4_Cliente[3];
	public static void main(String[] args) {
		exercice();
		input.close();
	}
	private static void exercice() {
		char option;
		do {
			System.out.print(
				"\n1. Cadastrar\n" + 
				"2. Pesquisar\n"
			);
			option = input.next().charAt(0);
			if (option == '1') {
				register();
			} else if (option == '2') {
				search();
			}
		} while (option != '3');
	}
	private static void register() {
		for (int counter = 0; counter < clientes.length; counter++) {
			if (clientes[counter] == null) {
				clientes[counter] = new Aula_4_Cliente();
				System.out.print("Digite o nome do cliente: ");
				clientes[counter].nome = input.next();
				System.out.print("Digite o rg do cliente: ");
				clientes[counter].rg = input.next();
				System.out.print("Digite a idade do cliente: ");
				clientes[counter].idade = input.nextInt();
				break;
			}
		}
	}
	private static void search() {
		System.out.print("Digite o nome do cliente(TODOS para ver todos os clientes)\nCliente: ");
		var nome = input.next();
		if (nome.equalsIgnoreCase("TODOS")) {
			for (int counter = 0; counter < clientes.length; counter++) {
				if (clientes[counter] != null) {
					System.out.print(counter + ". " + clientes[counter].status.get() + "\n");
				}
			}
			return;
		} else if (nome.equalsIgnoreCase("TODES")) {
			while (true) {
				System.out.println("Fatal Error Forbidden: PRONOME NEUTRE");
			}
		} else {
			for (Aula_4_Cliente cliente : clientes) {
				if (cliente == null) continue;
				if (cliente.nome.equalsIgnoreCase(nome)) {
					System.out.print(
							"Cliente encontrado.\n" + 
							cliente.status.get()
					);
				}
			}
		}
	}
}
