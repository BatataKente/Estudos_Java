package Polimorfismo;

public class Pessoa extends Orgânico {
	public Pessoa(double peso) {
		super(peso);
	}
	public void comer(Orgânico coisa) {
		if (coisa instanceof Pessoa) {
			System.out.println("ERROR: Comer outra pessoa é canibalismo, não pode!");
			return;
		} 
		peso += coisa.getPeso();
	}
}
