package apresentacao._7_class_cast_exception;

import java.io.FileReader;

public class GeraErro {
	
	static void deClassCastException(Object objeto) {
		if(objeto.getClass().isAssignableFrom(Exception.class)) {
			Error exception = (Error) objeto;
		}
		Exception exception = (Exception) objeto;
	}
	
	static void deIOException() {
		try {
			FileReader fileReader = new FileReader("caminho pra lugar nenhum.txt");
		} catch(Exception exception) {
			exception.printStackTrace();
		}
	}
	
	static void deArrayIndexOutOfBoundsException() {
		int[] numbers = {1,2,3};
		int value = numbers[5];
	}
	
	static void deNullPointerException() {
		String text = null;
		int length = text.length();
	}
	
	static void deNullPointerExceptionTratando() {
		try {
			String text = null;
			int length = text.length();
		} catch(Exception error) {
			System.out.println(error/*Erro trazido pelo sistema*/);
		}
	}
	
	static void deNullPointerExceptionTratandoEJogando() throws Exception {
		String text = null;
		int length = text.length();
	}
	
	static void deArithmeticException() {
		int result = 10/0;
	}
	
	static void deIllegalArgumentException() throws Exception {
		int age = -5;
		if(age < 0) {
			throw new IllegalArgumentException("a idade não pode ser negativa");
		}
	}
}
