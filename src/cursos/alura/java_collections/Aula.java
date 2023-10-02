package cursos.alura.java_collections;

public class Aula implements Comparable<Aula> {

	private final String titulo;
	private final int tempo;

	public Aula(String titulo, int tempo) {
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public int getTempo() {
		return tempo;
	}
	
	public String getTitulo() {
		return titulo == null? "" : titulo;
	}
	
	public String toString() {
		return String.format("{\"aula\": \"%s\", \"tempo\": \"%2d minutos\"}", getTitulo(),  getTempo());
	}

	public int compareTo(Aula aula) {
		return getTitulo().compareTo(aula.getTitulo());
	}
}
