package experiences.calculadora.baskara.utils;

public class Roots {
	public final double x_1, x_2;
	public Roots(double x_1, double x_2) {
		this.x_1 = x_1;
		this.x_2 = x_2;
	}
	public String toString() {
		return String.format(
				"x': %.2f\nx'': %.2f", 
				new Object[] {new Double(x_1), new Double(x_2)}
		);
	}
}
