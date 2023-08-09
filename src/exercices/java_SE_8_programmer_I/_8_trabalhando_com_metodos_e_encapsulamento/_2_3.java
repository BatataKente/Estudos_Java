package exercices.java_SE_8_programmer_I._8_trabalhando_com_metodos_e_encapsulamento;

public class _2_3 {
	public static void main(String[] args) {
		new _2_3().x(); //Compila e imprime z.
	}
	static void x() {
		new B().y();
	}
}

class B {
	void y() {
		this.z();
	}
	static void z() {
		System.out.println("z");
	}
}