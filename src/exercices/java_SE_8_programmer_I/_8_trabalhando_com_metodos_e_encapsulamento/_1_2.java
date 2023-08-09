package exercices.java_SE_8_programmer_I._8_trabalhando_com_metodos_e_encapsulamento;

public class _1_2 {
		 public static void main(String[] args) {
			 x(5); //Compila e ao rodar com cinco parâmetros, imprime 0, 5, 0 e End.
		 }
		 static int x(final int l) {
			 for(int i=0;i<100;i++) {
				 switch(i) {
					 case 1:
						 System.out.println(l);
						 if(l==i) return 3;
					 case 0:
						 System.out.println(0);
				 }
			 }
			 System.out.println("End");
			 return -1;
		 }
}
