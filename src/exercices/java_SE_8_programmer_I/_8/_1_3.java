package exercices.java_SE_8_programmer_I._8;

public class _1_3 {
	public static void main(String[] args) {
		System.out.println(a(args.length));
	}
	static int a(int l) {
		if(l<10) return b(l);
		else return c();
	}
	static int b(int l) {
		if(l<10) return b(l);
		else return c();
	}
	static /*long Não compila: erro ao invocar o método c.*/int c() {
		return 3;
	}
}
