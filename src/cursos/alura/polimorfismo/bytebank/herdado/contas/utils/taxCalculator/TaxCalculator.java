package cursos.alura.polimorfismo.bytebank.herdado.contas.utils.taxCalculator;

public class TaxCalculator {
	private double totalImposto;
	public void registra(final Tributavel tributavel) {
		double imposto = tributavel.getImposto();
		this.totalImposto += imposto;
	}
	public double getTotalImposto() {
		return totalImposto;
	}
}
