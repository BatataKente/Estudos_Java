package apresentacao._8_BaskaraTeste;

public class Baskara {
	private double x_1, x_2;
	private String resposta = "";
	Baskara(double a, double b, double c) {
		try {
			calculate(a, b, c);
			resposta = String.format(
					"Valor de x': %.2f\nValor de x'': %.2f.",
					new Object[]{new Double(x_1), new Double(x_2)}
			);
		} catch(Exception exception) {
			resposta = String.valueOf(exception.getMessage());
		}
	}
	private void calculate(double a, double b, double c) throws Exception {
		double delta = (b*b) - (4*a*c);
		if(delta < 0) {
			throw new Exception("Nao foi possível executar calculo pois o delta eh negativo");
		}
		x_1 = ((- b) + (Math.pow(delta, 0.5)))/(2*a);
		x_2 = ((- b) - (Math.pow(delta, 0.5)))/(2*a);
	}
	public String toString() {
		return resposta;
	}
}
