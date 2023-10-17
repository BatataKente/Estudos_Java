package cursos.alura._6_java_util.testes.utils;

import java.util.Comparator;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.Conta;

public class TitularDaContaComparator implements Comparator<Conta> {

	public int compare(Conta o1, Conta o2) {
		String nome1 = o1.getTitular().getNome();
		String nome2 = o2.getTitular().getNome();
		nome1.compareTo(nome2);
		return 0;
	}
}