package exercices.java_SE_8_programmer_I._8;

public class _2_3 {
	public static void main(String[] args) {
		new _2_3().x();
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