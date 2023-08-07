package apresentacao.pacotes.utils;

public class Baskara {
	public static String calcular(double a, double b, double c) {
		double delta = (b*b) - (4*a*c);//Exemplo: double
		if(delta < 0) return "delta negativo não foi possível efetuar cálculo.";
		double x_1 = ((-b) + (Math.pow(delta, 0.5)))/(2*a);//Exemplo: double
		double x_2 = ((-b) - (Math.pow(delta, 0.5)))/(2*a);//Exemplo: double
		return String.format(
				"O valor de x' é %.2f e o valor de x'' é %.2f.",
				new Object[]{new Double(x_1), new Double(x_2)}
		);
	}
}
