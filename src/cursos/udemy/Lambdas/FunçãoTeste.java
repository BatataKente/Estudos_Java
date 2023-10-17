package curso.Lambdas;

import java.util.function.Function;

@SuppressWarnings("unused")
public class FunçãoTeste {
	public static void main(String[] args) {
//		Function<Integer, String> parOuImpar = numbero -> numbero % 2 == 0 ? "Par" : "Ímpar";
		Function<Integer, Boolean> isOdd = numbero -> numbero % 2 == 0 ? false : true;
		Function<Integer, String> parOuImpar = numbero -> {
			return isOdd.apply(numbero) ?  "Ímpar" : "Par";
		};
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + "!!!";
		Function<String, String> duvida = valor -> valor + "?";
//		Function<String, String>
//		System.out.println(parOuImpar.apply(2));
//		System.out.println(oResultadoE.apply(parOuImpar.apply(2)));
		String resultado = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		System.out.println(resultado);
		String resultado2 = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(33);
		System.out.println(resultado2);
	}
}
