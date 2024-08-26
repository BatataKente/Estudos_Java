package cursos.alura._8_java_brasil.data;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Data {
	
	public static void main(String[] args) {
//		LocalDate hoje = LocalDate.now();
//		System.out.println(hoje);
//		DateTimeFormatter brazilianDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//		System.out.println(hoje.format(brazilianDate));
//		LocalDateTime agora = LocalDateTime.now;
//		System.out.println(agora);
//		DateTimeFormatter brazilianDateTime = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");
//		System.out.println(agora.format(brazilianDateTime));
//		DateTimeFormatter brazilianLocalizedDate = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withLocale("pt", "br");
//		System.out.println(agora.format(brazilianLocalizedDate));
//		agora.minusHours(5);
//		agora.plusHours(10);
//		System.out.println(agora);
		Date date = new Date();
		System.out.println(new SimpleDateFormat("dd/MM/yyyy").format(date));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm").format(date));
		System.out.println(new SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(date));
	}
}
