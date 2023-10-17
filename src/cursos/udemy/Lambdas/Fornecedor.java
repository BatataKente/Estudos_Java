package curso.Lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> aList = () -> Arrays.asList("Josicleison", "Josicelide", "Marcidinelson");
		System.out.println(aList.get());
	}
}
