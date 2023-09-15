package cursos.alura.java_util.testes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.Conta;
import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.ContaCorrente;

public class TesteArrayList {
	public static void main(String[] args) {
		
//		Conta contaCorrente_1 = new ContaCorrente(22, 22);
//		Conta contaCorrente_2 = new ContaCorrente(22, 22);
//		System.out.println(contaCorrente_2.equals(contaCorrente_1));

		List<Conta> contas = new LinkedList<Conta>();
		
		Conta contaCorrente_1 = new ContaCorrente(22, 11);
		contas.add(contaCorrente_1);
		
		Conta contaCorrente_2 = new ContaCorrente(22, 22);
		contas.add(contaCorrente_2);

		Conta contaCorrente_3 = new ContaCorrente(22, 22);
//		Conta contaCorrente_3 = contaCorrente_2;
		
		final boolean existe = contas.contains(contaCorrente_3);
		
		System.out.println("Já existe? " + existe);
		
		for(Conta conta : contas) {
			System.out.println("- " + conta);
		}
	}
}
