package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

import java.math.BigDecimal;

import javax.money.MonetaryAmount;
import javax.money.MonetaryOperator;

import org.javamoney.moneta.Money;

public enum TipoDeDesconto {
	CUPOM_DE_DESCONTO {
		@Override
		public Money getValor(Money subtotal) {
			return subtotal.subtract(
					subtotal.with(
							new MonetaryOperator() {
								public MonetaryAmount apply(MonetaryAmount quantia) {
									return quantia.subtract(Money.of(5, Livraria.reais));
								}
							}
					)
			);
		}
	}, 
	FIDELIDADE {
		@Override
		public Money getValor(Money subtotal) {
			return subtotal.subtract(
					subtotal.with(
							new MonetaryOperator() {
								public MonetaryAmount apply(MonetaryAmount quantia) {
									return quantia.multiply(BigDecimal.ONE.subtract(porcentagem(new BigDecimal(10))));
								}
							}
					)
			);
		}
		
		private BigDecimal porcentagem(BigDecimal fatorDeCalculo) {
			return fatorDeCalculo.divide(BigDecimal.valueOf(100));
		}
	}, 
	NENHUM {
		@Override
		public Money getValor(Money subtotal) {
			return Money.of(0, Livraria.reais);
		}
	}
	;
	public abstract Money getValor(Money subtotal); 
}