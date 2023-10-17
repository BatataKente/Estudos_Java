package cursos.alura._3_polimorfismo.bytebank.herdado.contas.testes;

import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.ContaCorrente;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.conta.SeguroDeVida;
import cursos.alura._3_polimorfismo.bytebank.herdado.contas.utils.taxCalculator.TaxCalculator;

public class TesteTributaveis {
	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(222, 333);
		contaCorrente.depositar(100);
		
		SeguroDeVida seguroDeVida = new SeguroDeVida();
		
		TaxCalculator taxCalculator = new TaxCalculator();
		taxCalculator.registra(contaCorrente);
		taxCalculator.registra(seguroDeVida);
		System.out.println(taxCalculator.getTotalImposto());
	}
}
