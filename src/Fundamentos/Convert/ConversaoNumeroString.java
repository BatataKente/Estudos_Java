package Fundamentos.Convert;

public class ConversaoNumeroString {
	public static void main(String[] args) {
		final Integer a = 10_000;
		System.out.println(a.toString().length());
		int b = 100_000;
		System.out.println(Integer.toString(b).length());
		System.out.println(("Meuzovo: " + b).length());
		System.out.println(("" + b).length());
	}
}
