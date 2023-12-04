package experiences.m10a_calcula_potencia;

public class CalculaRaizDoQuadradoPerfeito {
	
	public static void main(String[] args) {
		System.out.println("teste");
		System.out.println(calcular(144));
		
	}
	
	private static String calcular(final double number) {
		final String casasPosVirgula = 1 + "";
		if(1 == number) return "A raiz é " + number;
		double testNumber = 2;
		double tempNumber = testNumber;
		System.out.printf(
				"%." + casasPosVirgula + "f^2 = %." + casasPosVirgula + "f\n", tempNumber, tempNumber*tempNumber
		);
		testNumber *= testNumber;
		if(testNumber == number) return "A raiz é " + number;
		while(testNumber < number) {
			System.out.printf(
					"%." + casasPosVirgula + "f + %." + casasPosVirgula + "f + %." + casasPosVirgula + "f = ", testNumber, tempNumber, tempNumber + 1
			);
			testNumber = testNumber + tempNumber + (tempNumber + 1);
			System.out.printf(
					"%." + casasPosVirgula + "f\n", testNumber
			);
			tempNumber++;
			if(testNumber == number) return String.format("A raiz é %.1f", number);
		}
		return "Não foi possivel encontrar a raiz, não é quadrado perfeito.";
	}
}
