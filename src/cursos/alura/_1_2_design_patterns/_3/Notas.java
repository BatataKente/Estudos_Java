package cursos.alura._1_2_design_patterns._3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notas {
	
	private static Map<String, Nota> notas = new HashMap<String, Nota>();
	
	private Nota create(final String nota) {
		switch (nota) {
			case "do": return new C();
			case "do#": return new CSharp();
			case "re": return new D();
			case "re#": return new DSharp();
			case "mi": return new E();
			case "fa": return new F();
			case "fa#": return new FSharp();
			case "sol": return new G();
			case "sol#": return new GSharp();
			case "la": return new A();
			case "la#": return new ASharp();
			case "si": return new B();
		}
		return null;
	}
	
	public Nota get(final String nome) {
		if(!notas.containsKey(nome)) {
			Nota nota = create(nome);
			if(nota != null) notas.put(nome, nota);
		}
		return notas.get(nome.toLowerCase());
	}
	
	public List<Nota> getAll() {
		return new ArrayList<Nota>(notas.values());
	}
}
