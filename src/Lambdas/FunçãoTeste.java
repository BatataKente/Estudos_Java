package Lambdas;

import java.util.function.Function;

@SuppressWarnings("unused")
public class FunçãoTeste {
	public static void main(String[] args) {
//		Function<Integer, String> parOuImpar = numbero -> numbero % 2 == 0 ? "Par" : "Ímpar";
		Function<Integer, String> parOuImpar = numbero -> {
			return numbero % 2 == 0 ? "Par" : "Ímpar";
		};
		Function<Integer, Boolean> isOdd = numbero -> numbero % 2 == 0 ? false : true;
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
//		System.out.println(parOuImpar.apply(2));
//		System.out.println(oResultadoE.apply(parOuImpar.apply(2)));
		String resultado = parOuImpar.andThen(oResultadoE).apply(2);
		System.out.println(resultado);
	}
}
