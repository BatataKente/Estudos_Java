package Absrato;

public abstract class Mamífero extends Animal {
	abstract String mamar();
	@Override public final String mover() {
		return "Saindo do lugar";
	}
}
