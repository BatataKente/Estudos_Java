package cursos.alura._9_refatoracao_em_java.br.com.caelum.livraria.dominio;

import javax.money.CurrencyUnit;
import javax.money.Monetary;

public class Livraria {
	
	private Livraria() {}
	
	public static final CurrencyUnit reais = Monetary.getCurrency("BRL");
}
