package Fundamentos.Convert;

import java.util.Scanner;

public class Wrapper {
	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
		Byte numbro = 100;
		Short value = 1000;
//		Integer integre = Integer.parseInt(input.next());
		Integer integre = 10000;
		Long valeu = 10000000L;
		System.out.print(numbro + " " + numbro.byteValue() + "\n");
		System.out.printf("%s\n", value.toString());
		System.out.println(integre*3);
		System.out.println(valeu/3.0);
//		input.close();
		Boolean berdade = Boolean.parseBoolean("true");
		System.out.println(!berdade);
		System.out.printf("%s\n", berdade.toString().toUpperCase());
		Character letra = '@';
		System.out.print(letra + "...\n");
		Float fumro = 123F;
		Double doubro = 1234.5678;
		System.out.print(fumro + "\n" + doubro);
	}
}
