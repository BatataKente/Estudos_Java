package cursos.alura._1_2_design_patterns._6;

import java.util.Calendar;

public class CalendarAdapter implements Relogio {
	@Override
	public Calendar getHoje() {
		return Calendar.getInstance();
	}
}
