package estudos.poo.I;

import java.util.Scanner;

public class Aula_4_A {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		var cliente_1 = new Aula_4_Cliente();
		System.out.print("Digite o nome do cliente: ");
		cliente_1.nome = input.next();
		System.out.print("Digite o rg do cliente: ");
		cliente_1.rg = input.next();
		System.out.print("Digite a idade do cliente: ");
		cliente_1.idade = input.nextInt();
		System.out.print("\n" + cliente_1.status.get());
		input.close();
	}
}
