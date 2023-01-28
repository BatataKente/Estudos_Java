package streams;

import java.util.function.UnaryOperator;

public interface Utilitários {
	public static UnaryOperator<String> paraMaiusculo = element -> {
		return element.toUpperCase();
	};
	public static UnaryOperator<String> primeiraLetra = element -> {
		return Character.toString(element.charAt(0));
	};
	public static String grito(String element) {
		return  element + "!!! ";
	}
}
