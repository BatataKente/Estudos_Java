package cursos.alura._1_2_design_patterns._6;

public class Programa {

	public static void main(String[] args) {
		Map map = new GoogleMaps();
		map.getMap("rua vergueira");
		
		System.out.println(new CalendarAdapter().getHoje().getTime());
	}
}
