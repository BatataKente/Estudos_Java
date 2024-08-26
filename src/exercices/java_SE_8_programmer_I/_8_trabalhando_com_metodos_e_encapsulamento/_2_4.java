package exercices.java_SE_8_programmer_I._8_trabalhando_com_metodos_e_encapsulamento;

class _2_4B{
	 static void x() {
		 System.out.println("x");
	 }
	 static void y() {
		 System.out.println("y");
	 }
 } 

 public class _2_4 extends _2_4B {
	 public static void main(String[] args) {
//		 this.x(); //Não é possível usar this em um contexto estático
//		 _2_4.y(); //Impossível fazer uma referência estática para o método não-estático y() do tipo B
	 }
 }
