package experiences.baskara;

public class Baskara {
	private final double x_1, x_2;
	public Baskara(double a, double b, double c) throws Exception {
		Roots roots = calculate(a, b, c);
		this.x_1 = roots.x_1;
		this.x_2 = roots.x_2;
	}
	public static Roots calculate(double a, double b, double c) throws Exception {
		double delta = (b*b) - (4*a*c);
		if(delta < 0) throw new Exception("Não foi possivel calcular pois delta eh negativo.");
		double x_1 = ((- b) + (Math.pow(delta, 0.5)))/(2*a);
		double x_2 = ((- b) - (Math.pow(delta, 0.5)))/(2*a);
		return new Roots(x_1, x_2);
	}
	public String toString() {
		return String.format(
				"Valor do x': %.2f\nValor do x'': %.2f", 
				new Object[] {new Double(x_1), new Double(x_2)}
		);
	}
}
