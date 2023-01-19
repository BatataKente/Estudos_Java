package Lambdas;

import java.util.function.UnaryOperator;

public class OperadorUnário {
	public static void main(String[] args) {
		UnaryOperator<Integer> plusTwo = number -> number + 2;
		UnaryOperator<Integer> multipliedByTwo = number -> number * 2;
		UnaryOperator<Integer> pow = number -> number * number;
		int result_1 = plusTwo
				.andThen(multipliedByTwo)
				.andThen(pow)
				.apply(0);
		System.out.println(result_1);
		int result_2 = pow
				.compose(multipliedByTwo)
				.compose(plusTwo)
				.apply(0);
		System.out.println(result_2);
	}
}
