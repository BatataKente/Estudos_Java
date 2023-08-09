package exercices.java_SE_8_programmer_I._8;

public class Example {
	public static void main(String[] args) {
		Example example = new Example();
		example.method2(0);
	}
	String method2(int a) {
		if(a > 0) {
			return "positive";
		} else if(a < 0) {
			return "negative";
		}
		throw new RuntimeException("zero!");
	}
}
