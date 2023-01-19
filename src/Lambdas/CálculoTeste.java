package Lambdas;

import java.util.function.BinaryOperator;

public class CálculoTeste {
	public static void main(String[] args) {
		test_4();
	}
	static void test_1() {
		Cálculo cálculo = new Soma();
		System.out.println(cálculo.executar(2, 3));
		cálculo = new Multiplicação();
		System.out.println(cálculo.executar(2, 3));
	}
	static void test_2() {
		Cálculo cálculo = (a, b) -> {return a + b;};
		System.out.println(cálculo.executar(2, 3));
		cálculo = (a, b) -> a * b;
		System.out.println(cálculo.executar(2, 3));
		System.out.println(cálculo.sayLero());
		System.out.println(Cálculo.sayLeroAgain());
	}
	static void test_3() {
		BinaryOperator<Double> cálculo = (a, b) -> {return a + b;};
		System.out.println(cálculo.apply(2.0, 3.0));
		cálculo = (a, b) -> a * b;
		System.out.println(cálculo.apply(2.0, 3.0));
	}
	static void test_4() {
		BinaryOperator<Integer> cálculo = (a, b) -> {return a + b;};
		System.out.println(cálculo.apply(2, 3));
		cálculo = (a, b) -> a * b;
		System.out.println(cálculo.apply(2, 3));
	}
}	
