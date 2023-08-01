package curso.Fundamentos.Exercicios;

public class ExerciciosConceitosBasicos {
	public static void main(String[] args) {
		System.out.println(parseFahrenheit(10));
		System.out.println(parseCelcius(50));
		System.out.println(calculateImc(70, 1.8));
		showSquaretNdCube(3);
		System.out.println(calculateTriangleArea(10, 10));
		final var xs = calculateBaskara(1, 4, 3);
		System.out.printf("%.0f, %.0f", xs[0], xs[1]);
	}
	static double parseFahrenheit(double celcius) {
		return (celcius*1.8) + 32;
	}
	static double parseCelcius(double fahrenheit) {
		return (fahrenheit - 32)/1.8;
	}
	static double calculateImc(double peso, double altura) {
		return peso/Math.pow(altura, 2);
	}
	static void showSquaretNdCube(double value) {
		System.out.printf("%.0f^2 = %.0f\n", value, Math.pow(value, 2));
		System.out.printf("%.0f^3 = %.0f\n", value, Math.pow(value, 3));
	}
	static double calculateTriangleArea(double base, double height) {
		return base*height/2;
	}
	static double[] calculateBaskara(double a, double b, double c) {
		double delta = calculateDelta(a, b, c);
		if (delta < 0) {return null;}
		double xi = (- b + Math.pow(delta, 0.5))/2*a;
		double xii = (- b - Math.pow(delta, 0.5))/2*a;
		double[] result = {xi, xii};
		return result;
	}
	static double calculateDelta(double a, double b, double c) {
		return Math.pow(b, 2) - 4*a*c;
	}
}
