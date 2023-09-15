package cursos.alura.java_util.testes.utils;

import java.util.Comparator;

import cursos.alura.polimorfismo.bytebank.herdado.contas.conta.Conta;

public class NumeroDaContaComparator implements Comparator<Conta> {
	
	public int compare(Conta o1, Conta o2) {
//		return Integer.compare(o1.getNumero(), o2.getNumero());
		return o1.getNumero() - o2.getNumero();
//		if(o1.getNumero() < o2.getNumero()) return -1;
//		if(o1.getNumero() < o2.getNumero()) return 1;
//		return 0;
	}
}
