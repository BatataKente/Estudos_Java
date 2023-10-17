package cursos.alura._1_2_design_patterns._4;

import java.util.ArrayList;
import java.util.List;

public class Historico {

	private final List<State> states = new ArrayList<State>();
	
	public State get(final int index) {
		return states.get(index);
	}
	
	public void add(final State state) {
		states.add(state);
	}
}
