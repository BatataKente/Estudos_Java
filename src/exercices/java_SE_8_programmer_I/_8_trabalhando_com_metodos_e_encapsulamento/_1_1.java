package exercices.java_SE_8_programmer_I._8_trabalhando_com_metodos_e_encapsulamento;

public class _1_1 {
		public static void main(String[] args) {
			x(args.length);
		}
		static int x(final int l) {
			for(int i=0;i<100;i++) {
				switch(i) {
					case 1:
						System.out.println(l);
						if(l == i) return/*Não compila*/0;
					case 0:
						System.out.println(0);
			}
		}
		System.out.println("end");
			return -1;
		}
}
