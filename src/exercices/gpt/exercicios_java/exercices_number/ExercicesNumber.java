package exercices.gpt.exercicios_java.exercices_number;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class ExercicesNumber {
//	### Exercícios de Formatação de Número

	public static void main(String[] args) {
		_10();
	}
	
//	1. **Formatar Número Decimal:**
//	   - Escreva um programa que formate um número decimal para mostrar duas casas decimais.
	public static void _1() {
		NumberFormat numberFormat = NumberFormat.getInstance();
	    numberFormat.setMinimumFractionDigits(2);
	    numberFormat.setMaximumFractionDigits(2);
		System.out.println(numberFormat.format(2322.123));
	}
//
//	2. **Formatar Número com Separador de Milhares:**
//	   - Dado um número inteiro, formate-o para incluir separadores de milhares.
	public static void _2() {
		int number = 1000000;
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
		System.out.println(numberFormat.format(number));
		
		numberFormat = NumberFormat.getInstance(new Locale("pt", "BR"));
		System.out.println(numberFormat.format(number));
	}
//
//	3. **Converter String para Double:**
//	   - Converta uma string representando um número decimal em um tipo `double` e formate-o com duas casas decimais.
	public static void _3() {
		String numberText = "100";
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMaximumFractionDigits(2);
		numberFormat.setMinimumFractionDigits(2);
		try {
			Number number = numberFormat.parse(numberText);
			System.out.println(number.doubleValue());
			System.out.println(numberFormat.format(number.doubleValue()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	public static void _3Alt() {
		String numberText = "100";
		double number = Double.parseDouble(numberText);
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setMinimumFractionDigits(2);
		numberFormat.setMaximumFractionDigits(2);
		System.out.println(numberFormat.format(number));
	}
//
//	4. **Formatar Percentual:**
//	   - Dado um número decimal, formate-o como um percentual (e.g., 0.75 como "75%").
	public static void _4() {
		double number = 0.75;
		NumberFormat numberFormat = NumberFormat.getPercentInstance();
		System.out.println(numberFormat.format(number));
	}
//
//	5. **Formatar Moeda (getCurrencyInstance):**
//	   - Escreva um programa que formate um número como uma moeda padrão para os EUA.
	public static String formatNumberBy(int number, Locale locale) {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);
		return (numberFormat.format(number));
	}
	public static void _5() {
		int number = 1;
		System.out.println(formatNumberBy(number, Locale.US));
	}
//
//	6. **Formatar Moeda para Outra Localidade:**
//	   - Formate um número como moeda para um `Locale` específico, como Reino Unido ou Japão.
	public static void _6() {
		int number = 1;
		System.out.println(formatNumberBy(number, Locale.UK));
		System.out.println(formatNumberBy(number, Locale.JAPAN));
	}
//
//	7. **Converter Número para String:**
//	   - Converta um número inteiro em uma string e formate-o como uma moeda.
	public static void _7() {
		int number = 1;
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
		System.out.println(numberFormat.format(number));
	}
//
//	8. **Formatação Personalizada de Moeda:**
//	   - Use `NumberFormat` para criar uma formatação de moeda personalizada, como adicionar um prefixo ou sufixo.
	public static void _8() {
		int number = 1;
		DecimalFormat numberFormat = (DecimalFormat) NumberFormat.getCurrencyInstance();
		numberFormat.setPositivePrefix("Lero ");
		numberFormat.setNegativePrefix("DeadLero ");
		System.out.println(numberFormat.format(number));
		System.out.println(numberFormat.format(-1));
	}
//
//	9. **Calcular e Formatar Juros Simples:**
//	   - Calcule os juros simples sobre um valor principal e formate o resultado como moeda.
	public static void _9() {
	    double principal = 1000.0; // Valor principal
	    double taxaDeJuros = 0.05; // Taxa de juros (5%)
	    int tempo = 2; // Tempo em anos
	    
//	    [ \text{Juros Simples} = \text{Principal} \times \text{Taxa de Juros} \times \text{Tempo} ]
	    
	    double result = principal*taxaDeJuros*tempo;
	    System.out.println(NumberFormat.getCurrencyInstance().format(result));
	}
//
//	10. **Formatar Número em Notação Científica:**
//	    - Dado um número, formate-o em notação científica.
	public static void _10() {
	    double number = 12345.6789;
	    DecimalFormat decimalFormat = new DecimalFormat("0.###E0");
	    
	    System.out.println(decimalFormat.format(number));
	}
}
