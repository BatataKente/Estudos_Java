package cursos.alura._6_java_util.testes;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.*;
import cursos.alura._6_java_util.models.Objects;

public class TesteObjects {
	public static void main(String[] args) {
		Objects<Conta> contas = new Objects<Conta>();
		
		Conta contaCorrente_1 = new ContaCorrente(22, 11);
		contas.add(contaCorrente_1);
		
		Conta contaCorrente_2 = new ContaCorrente(22, 22);
		contas.add(contaCorrente_2);
		
		int tamanho = contas.length();
//		System.out.println(tamanho);
//		System.out.println(contas);
		
		for (int i = 0; i < contas.length(); i++) {
			System.out.println(contas.get(i).getNumero());
		}
	}
}
