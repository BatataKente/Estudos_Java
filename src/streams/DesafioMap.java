package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		mySolution();
	}
	static void mySolution() {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		/*
		 * 1. Número para String binária... 6 -> "110"
		 * 2. Reverter a String... "110" -> "011"
		 * 3. Converter de volta para inteiro -> "011" -> 3
		 * */
		Function<Integer, String> toBinary = number -> {
			var result = "";
			do {
				result += Integer.toString(number%2); number /= 2;
			} while (number >= 1);
			return new StringBuilder(result).reverse().toString();
		};
		UnaryOperator<String> reverse = sentense -> {
			return new StringBuilder(sentense).reverse().toString();
		};
		Function<String, Integer> toInteger = binary -> {
			var result = 0;
			for (int counter = 0; counter < binary.length(); counter++) {
				var multiplyer = (int) Math.pow(2, counter);
				result += Character.getNumericValue(binary.charAt(counter))*multiplyer;
			}
			return result;
		};
		numbers.stream()
			.map(toBinary)
			.map(reverse)
			.map(toInteger)
			.forEach(System.out::println);
	}
}
