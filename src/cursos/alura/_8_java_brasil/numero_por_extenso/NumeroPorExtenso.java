package cursos.alura._8_java_brasil.numero_por_extenso;

import java.math.BigDecimal;

import br.com.caelum.stella.inwords.FormatoDeReal;
import br.com.caelum.stella.inwords.NumericToWordsConverter;

public class NumeroPorExtenso {
	public static void main(String[] args) {
		NumericToWordsConverter converter = new NumericToWordsConverter(new FormatoDeReal());
//		final double valor = 75.00;
		final BigDecimal valor = new BigDecimal("900.01");
		String valorPorExtensoString = converter.toWords(valor.doubleValue());
		System.out.println(valorPorExtensoString);
	}
}
