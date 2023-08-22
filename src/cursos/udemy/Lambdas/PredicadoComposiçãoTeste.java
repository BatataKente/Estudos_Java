package curso.Lambdas;

import java.util.function.Predicate;

public class PredicadoComposiçãoTeste {
	public static void main(String[] args) {
		Predicate<Integer> isPair = number -> number % 2 == 0;
		Predicate<Integer> isLengthEqualToThree = number -> number >= 100 && number <= 999;
		System.out.println(isPair.and(isLengthEqualToThree).negate().test(22));
		System.out.println(isPair.or(isLengthEqualToThree).test(22));
	}
}
