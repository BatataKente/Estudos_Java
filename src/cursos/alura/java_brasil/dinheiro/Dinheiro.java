package cursos.alura.java_brasil.dinheiro;

import javax.money.CurrencyUnit;
import javax.money.Monetary;
import javax.money.MonetaryAmount;

import org.javamoney.moneta.Money;

public class Dinheiro {
	
	public static void main(String[] args) {
        CurrencyUnit real = Monetary.getCurrency("USD");
        MonetaryAmount valorDaParcela = Money.of(100, real);
        System.out.println(valorDaParcela);
        MonetaryAmount valorTotal = valorDaParcela.multiply(12);
        System.out.println(valorTotal);
	}
}
