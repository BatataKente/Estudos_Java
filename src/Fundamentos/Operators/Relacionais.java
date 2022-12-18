package Fundamentos.Operators;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		System.out.print('\u0061' + "\n");
		System.out.println(a == b);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		double nota = 9.3;
		boolean bomComportamento = false;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("\nTem desconto? " + temDesconto);
	}
}
