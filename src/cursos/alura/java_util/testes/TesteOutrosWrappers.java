package cursos.alura.java_util.testes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TesteOutrosWrappers {
	public static void main(String[] args) {
		
		Integer integerObject = Integer.valueOf(29);
		System.out.println(integerObject.intValue());
		
		Double doubleObject = Double.valueOf(3.2);
		System.out.println(doubleObject.doubleValue());
		
		Boolean booleanObject = Boolean.FALSE;
		System.out.println(booleanObject.booleanValue());
		
		Number numero = Float.valueOf(29.2f);
		
		List<Number> numbers = new ArrayList<Number>();
		numbers.add(integerObject);
		numbers.add(doubleObject);
		numbers.add(numero);
		
		System.out.println(Arrays.toString(numbers.toArray()));
	}
}
