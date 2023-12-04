package experiences.m10a_calcula_potencia;

public class CalculaRaizDoQuadradoPerfeito {
	
	public static void main(String[] args) {
		System.out.println();
		System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(144));
		System.out.println();
		System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(4));
		System.out.println();
		System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(25));
        System.out.println();
        System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(36));
        System.out.println();
        System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(100));
        System.out.println();
        System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(169));
        System.out.println();
        System.out.println(garotinhaCalculandoRaizDoQuadradoPerfeito(289));
	}
	
	private static String garotinhaCalculandoRaizDoQuadradoPerfeito(final double number) {
		
		final String casasPosVirgula = 1 + "";
		
		if(1 == number) return "A raiz é " + number;
		
		double testNumber = 2;
		double result = testNumber;
		
		System.out.printf(
				"%." + casasPosVirgula + "f^2 = %." + casasPosVirgula + "f\n", result, result*result
		);
		
		testNumber *= testNumber;
		
		if(testNumber == number) return "A raiz é " + result;
		
		while(testNumber < number) {
			
			System.out.printf(
					"%." + casasPosVirgula + "f + %." + casasPosVirgula + "f + %." + casasPosVirgula + "f = ", testNumber, result, result + 1
			);
			
			testNumber = testNumber + result + (result + 1);
			
			System.out.printf(
					"%." + casasPosVirgula + "f\n", testNumber
			);
			
			result++;
			
			if(testNumber == number) return String.format("A raiz é %.1f", result);
		}
		
		return "Não foi possivel encontrar a raiz, não é quadrado perfeito.";
	}
}
