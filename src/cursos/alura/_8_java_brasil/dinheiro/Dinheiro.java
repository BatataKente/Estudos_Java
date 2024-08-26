package cursos.alura._8_java_brasil.dinheiro;

//import javax.money.CurrencyUnit;
//import javax.money.MonetaryAmount;
//
//import org.javamoney.moneta.Money;
//import org.javamoney.moneta.function.MonetaryOperators;
//
//import br.com.caelum.stella.inwords.FormatoDeReal;
//import br.com.caelum.stella.inwords.NumericToWordsConverter;
//
//public class Dinheiro {
//	
//	public static void main(String[] args) {
//        CurrencyUnit real = Monetary.getCurrency("USD");
//        MonetaryAmount valorDaParcela = Money.of(100, real);
//        System.out.println(valorDaParcela);
//        MonetaryAmount valorTotal = valorDaParcela.multiply(12);
//        System.out.println(valorTotal);
//        MonetaryAmount desconto = valorTotal.with(MonetaryOperators.percent(10));
//        System.out.println(desconto);
//        
//        NumericToWordsConverter conversor = new NumericToWordsConverter(new FormatoDeReal());
//        conversor.toWords(
//        		desconto
//	        		.getNumber()
//	        		.doubleValue()
//        );
//	}
//}
