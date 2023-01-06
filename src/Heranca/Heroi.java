package Heranca;

public class Heroi extends Jogador {
	boolean atacar(Jogador oponente) {
		boolean golpe_1 = super.atacar(oponente);
		boolean golpe_2 = super.atacar(oponente);
		return golpe_1 || golpe_2;
	}
}
