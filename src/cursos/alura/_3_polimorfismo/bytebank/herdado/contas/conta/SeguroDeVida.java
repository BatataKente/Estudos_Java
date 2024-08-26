package cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.utils.taxCalculator.Tributavel;

public class SeguroDeVida implements Tributavel {
	public double getImposto() {
		return 42;
	}
}
