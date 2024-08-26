package cursos.free_code_camp._1;

public class DataTypes {
	
	public static void main(Strings[] arguments) {
		_3();
	}
	
	public static void _3() {
		double a = 5.8;
		int b = (int) a;
		System.out.println(b);
	}
	
	public static void _2() {
		int a = 5;
		double b = a;
		System.out.println(b);
	}
	
	public static void _1() {
		// integer types
		byte aSingleByte = 100; // -128 to 127
		short aShort = 1000; // -32,768 to 32,767
		int anInt = 10000; // -2,147,483,648 to 2,147,483,647
		long aLong = 10000000000L; // -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		// floating point types
		float aFloat = 100.0f; // 32-bit precision
		double aDouble = 100.0; // 64-bit precision
		// character types
		char aChar = '©';
		char anotherChar = 169;
		char yetAnotherChar = '\u00A9';
		// boolean types	
		boolean aBoolean = true;
		boolean anotherBoolean = false;
		System.out.println(
			String.format("aSingleByte: %d, aShort: %d, anInt: %d, aLong: %d", aSingleByte, aShort, anInt, aLong) + "\n" +
			String.format("aFloat: %f, aDouble: %f", aFloat, aDouble) + "\n" +
			String.format("aChar: %c, anotherChar: %c, yetAnotherChar: %c", aChar, anotherChar, yetAnotherChar) + "\n" +
			String.format("aBoolean: %b, anotherBoolean: %b", aBoolean, anotherBoolean)
		);
	}
}
