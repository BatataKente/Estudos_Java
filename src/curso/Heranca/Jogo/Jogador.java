package curso.Heranca.Jogo;

class Jogador {
	private int hp = 100;
	public int x;
	public int y;
	public Jogador()  {
		this(0, 0);
	}
	public Jogador(int x, int  y)  {
		this.x = x;
		this.y = y;
	}
	public boolean atacar(Jogador oponente) {
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
	public boolean andar(Direcao direcao) {
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
	public String status() {
		return "hp: " + hp + "\tposition: (x: " + x + "; y: " + y + ")";
	}
}
