package Lambdas;

@FunctionalInterface public interface Cálculo {
	double executar(double a, double b);
	default String sayLero() {
		return "Lero Lero";
	}
	static String sayLeroAgain() {
		return "Lero";
	}
}
