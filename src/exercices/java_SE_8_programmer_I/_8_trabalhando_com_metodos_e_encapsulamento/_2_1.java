package exercices.java_SE_8_programmer_I._8_trabalhando_com_metodos_e_encapsulamento;

public class _2_1 {
	 public static void main(String[] args) {
		 x();
	 }
	 static /*Não compila*/void x() {
		 System.out.println("x");
		 y();
	 }
	 static /*Não compila*/void y() {
		 System.out.println("y");
	 }
}
