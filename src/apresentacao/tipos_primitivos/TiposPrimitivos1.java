package apresentacao.tipos_primitivos;

public class TiposPrimitivos1 {
	public static void main(String[] args) {
		
	}
    public static String backAround(String str) {
        final char lastChar = str.charAt(str.length() - 1);//Exemplo: char
        return lastChar + str + lastChar;
    }
	private static String baskara(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);//Exemplo: double
		if(delta < 0) return "delta negativo não foi possível efetuar cálculo.";
		double x_1 = ((-b) + (Math.pow(delta, 0.5)))/(2*a);//Exemplo: double
		double x_2 = ((-b) - (Math.pow(delta, 0.5)))/(2*a);//Exemplo: double
		return String.format(
				"O valor de x' é %.2f e o valor de x'' é %.2f.",
				new Object[]{new Double(x_1), new Double(x_2)}
		);
	}
    private static int close10(int a, int b) {
        final int diffA = Math.abs(a - 10);//Exemplo: int
        final int diffB = Math.abs(b - 10);//Exemplo: int
        final boolean diffAEqualsDiffB = diffA == diffB;//	Exemplo: boolean
        final boolean diffALesserThanDiffB = diffA < diffB;//Exemplo: boolean
        if(diffAEqualsDiffB) return 0;
        if(diffALesserThanDiffB) return a;
        return b;
    }
}
