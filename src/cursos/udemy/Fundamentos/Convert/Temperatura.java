package curso.Fundamentos.Convert;

public class Temperatura {
	public static void main(String[] args) {
// (F - 32) x 5/9 = C
		converterFarenheitToCelcius(23.5);
		converterFarenheitToCelcius(14.556);
		converterFarenheitToCelcius(43.1);
		converterFarenheitToCelcius(89);
		converterFarenheitToCelcius(0);
	}
	static void converterFarenheitToCelcius(double farenheit) {
		System.out.print("O resultado é " + (farenheit - 32) * 5/9 + "°C\n");
	}
}
