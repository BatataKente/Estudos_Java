package Heranca;

class Jogador {
	int hp = 100;
	int x;
	int y;
	boolean atacar(Jogador oponente) {
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		int dano = 10;
		if (deltaX == 0 && deltaY == 1)  {
			oponente.hp -= dano;
			return true;
		} else if (deltaX == 1 && deltaY == 0)  {
			oponente.hp -= dano;
			return true;
		}
		return false;
	}
	boolean andar(Direcao direcao) {
		var andou = true;
		switch (direcao) {
				case NORTE: y--; break;
				case LESTE: x++; break;
				case SUL: y++; break;
				case OESTE: x--; break;
				default: andou = false;
		}
		return andou;
	}
	String status() {
		return "hp: " + hp + "\tposition: (x: " + x + "; y: " + y + ")";
	}
}
