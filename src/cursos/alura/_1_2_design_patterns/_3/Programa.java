package cursos.alura._1_2_design_patterns._3;

import java.util.Arrays;
import java.util.List;

public class Programa {
	
	public static void main(String[] args) {
		
		Notas notas = new Notas();
		
		List<Nota> cifra = Arrays.asList(
				notas.get("do"),
				notas.get("do#"),
				notas.get("re"),
				notas.get("re#"),
				notas.get("mi"),
				notas.get("fa"),
				notas.get("fa"),
				notas.get("fa")
		);
		
		Piano piano =new Piano();
		piano.tocar(cifra);
	}
}
