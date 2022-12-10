package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		var a = Math.pow((((Math.pow((6*(3+2)), 2))/(3*2))-(Math.pow(((1-5)*(2-7)/2), 2))), 3)/Math.pow(10, 3);
		System.out.printf(
				"\nResultado -> %.0f", stepCalculate()
		);
	}
	static double stepCalculate() {
		double step = 3 + 2; 
		System.out.printf("%.0f\n", step);
		step *= 6;
		System.out.printf("%.0f\n", step);
		step = Math.pow(step, 2);
		System.out.printf("%.0f\n", step);
		step /= (3*2);
		System.out.printf("%.0f\n", step);
		step -= Math.pow((1 - 5)*(2 - 7)/2, 2);
		System.out.printf("%.0f\n", step);
		step = Math.pow(step, 3);
		System.out.printf("%.0f\n", step);
		step /= Math.pow(10, 3);
		return step;
	}
}