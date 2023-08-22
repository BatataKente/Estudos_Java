package curso.Heranca.Jogo;

public class Heroi extends Jogador {
	public Heroi() {
		this(0, 0);
	}
	Heroi(int x, int y) {
		super(x, y);
	}
	public boolean atacar(Jogador oponente) {
		boolean golpe_1 = super.atacar(oponente);
		boolean golpe_2 = super.atacar(oponente);
		return golpe_1 || golpe_2;
	}
}
