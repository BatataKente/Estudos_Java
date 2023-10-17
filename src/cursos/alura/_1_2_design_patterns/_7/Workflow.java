package cursos.alura._1_2_design_patterns._7;

import java.util.ArrayList;
import java.util.List;

public class Workflow {
	
	private final List<Work> comandos;
	
	public Workflow() {
		comandos = new ArrayList<Work>();
	}
	
	public void add(final Work work) {
		comandos.add(work);
	}
	
	public void process() {
		for (Work work : comandos) {
			work.execute();
		}
	}
}
