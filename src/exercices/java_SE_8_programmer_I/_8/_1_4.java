package exercices.java_SE_8_programmer_I._8;

public class _1_4 {
		public static void main(String[] args) {
			System.out.println(a(args.length)/*[0]*/);
		}
		static /*int,int Não compila*/int a(int l) {
			if(l==0) return /*{0, l}*/1; else return /*{l, 0}*/2;
		}
}
