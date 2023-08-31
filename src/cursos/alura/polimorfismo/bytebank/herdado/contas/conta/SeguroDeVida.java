package cursos.alura.polimorfismo.bytebank.herdado.contas.conta;

import cursos.alura.polimorfismo.bytebank.herdado.contas.utils.taxCalculator.Tributavel;

public class SeguroDeVida implements Tributavel {
	public double getImposto() {
		return 42;
	}
}
