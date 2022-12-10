package Fundamentos;

public class DesafioAritmetico {
	public static void main(String[] args) {
		System.out.printf("Resultado -> %.0f", calculate());
	}
	static double stepCalculate() {
		double step = 3 + 2; 
		step *= 6;
		step = Math.pow(step, 2);
		step /= (3*2);
		step -= Math.pow((1 - 5)*(2 - 7)/2, 2);
		step = Math.pow(step, 3);
		step /= Math.pow(10, 3);
		return step;
	}
	static double calculate() {
		double numA = Math.pow(6 * (3 + 2), 2);
		double denA = 3 * 2;
		double superA = numA/denA;
		double numB = (1 - 5) * (2 - 7);
		double denB = 2;
		double superB = Math.pow(numB/denB, 2);
		double num = Math.pow(superA - superB, 3);
		double den = Math.pow(10, 3);
		return num/den;
	}
}