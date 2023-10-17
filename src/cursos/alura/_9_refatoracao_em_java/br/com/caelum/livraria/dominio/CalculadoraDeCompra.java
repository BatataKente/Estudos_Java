package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

import org.javamoney.moneta.Money;

public class CalculadoraDeCompra {
	
	public Money calcularValorTotal(
			final Money subtotal, 
			final Money valorDoFrete, 
			final Desconto desconto
	) {
		if(subtotal.isZero()) return subtotal;
		Money result = subtotal;
		result = subtotal.subtract(desconto.getValor());
		result = subtotal.add(valorDoFrete);
		return result;
	}
}
