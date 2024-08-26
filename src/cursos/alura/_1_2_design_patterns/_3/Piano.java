package cursos.alura._1_2_design_patterns._3;

import java.util.List;

public class Piano {
	
	public void tocar(List<Nota> notas) {
		Player player = new Player();
		final StringBuilder cifra = new StringBuilder();
		for (Nota nota : notas) {
			if(nota == null) continue;
			cifra.append(nota.getNoteSymbol() + " ");
		}
		System.out.println(cifra);
		player.play(cifra.toString());
	}
}
