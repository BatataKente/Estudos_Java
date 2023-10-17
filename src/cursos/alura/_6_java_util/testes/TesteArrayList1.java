package cursos.alura._6_java_util.testes;

import java.util.ArrayList;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.Conta;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.ContaCorrente;

public class TesteArrayList1 {
	public static void main(String[] args) {
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		Conta contaCorrente_1 = new ContaCorrente(22, 11);
		contas.add(contaCorrente_1);
		
		Conta contaCorrente_2 = new ContaCorrente(22, 22);
		contas.add(contaCorrente_2);

//		System.out.println(contas.size());
//		
//		int tamanho = contas.size();
//		contas.remove(0);
		
		Conta contaCorrente_3 = new ContaCorrente(33, 311);
		contas.add(contaCorrente_3);
		
		Conta contaCorrente_4 = new ContaCorrente(33, 322);
		contas.add(contaCorrente_4);

		System.out.println("size: " + contas.size());
//		for (int i = 0; i < contas.size(); i++) {
//			System.out.println("- " + contas.get(i).getNumero());
//		}
		
		for(Conta conta : contas) {
			System.out.println("- " + conta);
		}
	}
}
