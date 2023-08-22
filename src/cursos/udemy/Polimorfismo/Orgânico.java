package curso.Polimorfismo;

public abstract class Orgânico {
	protected double peso;
	public Orgânico(double peso) {
		setPeso(peso);
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		if (peso > 0) this.peso = peso;
	}
}
