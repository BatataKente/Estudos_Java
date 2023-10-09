package cursos.alura._1_0_.oo.banco.models;

import java.text.NumberFormat;
import java.util.Locale;

public class RelatorioDeDivida {
	
	private final Divida divida;
	
	public RelatorioDeDivida(final Divida divida) {
		this.divida = divida;
	}
	
	public String get() {
		return String.format("Credor: %s\nValor Total: R$ %.2f\nValor Pago: R$ %.2f", divida.getCredor(), divida.getTotal(), divida.getValorPago());
	}
	
	public String get(NumberFormat numberFormater) {
		NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
		return String.format(
				"Credor: %s\nValor Total: %f\nValor Pago: %f", 
				divida.getCredor(), numberFormater.format(divida.getTotal()), numberFormater.format(divida.getValorPago())
		);
	}
	
	public String toJSON() {
		return String.format("{\"credor\": %s, \"valor_total\": %f, \"valor_pago\": %f}", divida.getCredor(), divida.getTotal(), divida.getValorPago());
	}
}
