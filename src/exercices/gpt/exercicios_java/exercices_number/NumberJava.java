package exercices.gpt.exercicios_java.exercices_number;

import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;

public class NumberJava {
	public static void main(String[] args) {
	}
	
	public static void _2() {
		NumberFormat numberFormat = NumberFormat.getInstance();
		try {
			Number number = numberFormat.parse("100.00");
			System.out.println(number.intValue());
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	public static void arredondamento() {
		NumberFormat numberFormat = NumberFormat.getInstance();
		numberFormat.setRoundingMode(RoundingMode.UP);
		numberFormat.setMaximumFractionDigits(0);
		numberFormat.setMinimumIntegerDigits(0);
		System.out.println(numberFormat.format(99.50));
	}
	
	public static void porcentagem() {
		NumberFormat numberFormat = NumberFormat.getPercentInstance();
		double number = 99.987;
		String formattedNumber = numberFormat.format(number);
		System.out.println(formattedNumber);
		
		numberFormat.setMaximumIntegerDigits(4);
		numberFormat.setMinimumIntegerDigits(3);
		numberFormat.setMaximumFractionDigits(2);
		numberFormat.setMinimumFractionDigits(1);
		formattedNumber = numberFormat.format(number);
		System.out.println(formattedNumber);

		numberFormat.setMaximumIntegerDigits(7);
		numberFormat.setMinimumIntegerDigits(5);
		formattedNumber = numberFormat.format(number);
		System.out.println(formattedNumber);
	}
	
	public static void moeda() {
		NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
		String number = numberFormat.format(100.99);
		System.out.println(number);
		Currency currency = numberFormat.getCurrency();
		System.out.println(currency);
		
		NumberFormat numberFormat_br = NumberFormat.getCurrencyInstance(Locale.getDefault());
		String number_br = numberFormat_br.format(100.99);
		System.out.println(number_br);
		currency = numberFormat_br.getCurrency();
		System.out.println(currency);
	}
	
	public static void _1() {
//		1.000,00 - Brasil
//		1,000;00 - Eua
		
		NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
		String number = numberFormat.format(100.99);
		System.out.println(number);

		NumberFormat numberFormat_br = NumberFormat.getInstance(new Locale("pt", "BR"));
		String number_br = numberFormat_br.format(100.99);
		System.out.println(number_br);
	}
}
