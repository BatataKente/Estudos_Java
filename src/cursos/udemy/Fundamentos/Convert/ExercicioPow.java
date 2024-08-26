package curso.Fundamentos.Convert;

public class ExercicioPow {
	public static void main(String[] args) {
		Byte a = Byte.parseByte(powConvertingToString(10, 2));
		Short b = Short.parseShort(powConvertingToString(10, 4));
		Integer c = Integer.parseInt(powConvertingToString(10, 9));
		Long d = Long.parseLong(powConvertingToString(10, 18));
		print(
				"a: " + a + "\n" + 
				"b: " + b + "\n" + 
				"c: " + c + "\n" + 
				"d: " + d
		);
	}
	static String powConvertingToString(double value, int pow) {
		return String.valueOf(Math.round(Math.pow(value, pow)));
	} 
	static void print(String value) {
		System.out.print(value);
	} 
}
