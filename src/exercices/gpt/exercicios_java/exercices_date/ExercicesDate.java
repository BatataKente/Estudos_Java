package exercices.gpt.exercicios_java.exercices_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class ExercicesDate {
//		### Exercícios de Conversão de Data

	public static void main(String[] args) {
		_2();
	}
	
//		1. **Converter String para Date:**
//		   - Escreva um programa que leia uma data no formato "dd/MM/yyyy" de uma string e a converta em um objeto `Date`.
	public static void _1() {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try {
			System.out.println(simpleDateFormat.parse("11/11/2024"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
//		2. **Converter Date para String:**
//		   - Dado um objeto `Date`, formate-o em uma string no formato "yyyy-MM-dd HH:mm:ss".
	public static void _2() {
		Date date = new Date();
		System.out.println(new SimpleDateFormat("[\"yyyy\", \"MM\", \"dd\", \"HH\", \"mm\", \"ss\"]").format(date));
	}

//		3. **Adicionar Dias a uma Data:**
//		   - Crie uma função que receba uma data e um número de dias, e retorne a nova data adicionando os dias especificados.
	public static Date addDaysTo(Date date, int numberOfDays) {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_MONTH, numberOfDays);
		return calendar.getTime();
	} 
	public static Date addDaysToAlternativeTrick(Date date, int numberOfDays) throws ParseException {
		String[] dateFields = new SimpleDateFormat("yyyy, MM, dd, HH, mm, ss").format(date).split(", ");
		dateFields[2] = String.valueOf(Integer.valueOf(dateFields[2]) + numberOfDays);
		return new SimpleDateFormat("yyyy, MM, dd, HH, mm, ss").parse(String.join(", ", dateFields));
	} 
	public static void _3() {
		System.out.println(addDaysTo(new Date(), 10));
	}
	
//		4. **Calcular Diferença entre Datas:**
//		   - Escreva um programa que calcule a diferença em dias entre duas datas fornecidas pelo usuário.
	public static long differenceInDaysBetween(Date a, Date b) {
		long value = a.getTime() - b.getTime();
		return value / (1000 * 60 * 60 * 24);
	}
	public static void _4() {
		System.out.println(differenceInDaysBetween(new Date(), addDaysTo(new Date(), 100)));
	}
	
//		5. **Converter Date para LocalDate:**
//		   - Dado um objeto `Date`, converta-o em um objeto `LocalDate` usando `java.time`.
	public static LocalDate dateToLocalDate(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);
		int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		return LocalDate.of(year, month, dayOfMonth);
	}
	public static LocalDate dateToLocalDateAlt(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
	}
	public static void _5() {
		System.out.println(dateToLocalDateAlt(new Date()));
	}
//
//		6. **Converter LocalDate para Date:**
//		   - Dado um objeto `LocalDate`, converta-o em um objeto `Date`.
	public static Date localDateToDate(LocalDate localDate) {
		Calendar calendar = Calendar.getInstance();
		calendar.set(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth());
		return calendar.getTime();
	}
	public static Date localDateToDateAlt(LocalDate localDate) {
		return Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	}
	public static void _6() {
		System.out.println(localDateToDateAlt(LocalDate.now()));
	}
//
//		7. **Obter Dia da Semana:**
//		   - Dada uma data, retorne o dia da semana correspondente (e.g., "Monday", "Tuesday").
	public static String dayOfWeekOf(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return (new String[] {"Domingo", "Segunda", "Terça", "Quarta", "Quinta", "Sábado"})[calendar.get(Calendar.DAY_OF_WEEK) - 1];
	}
	public static String dayOfWeekOfAlt(Date date) {
		return date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate().getDayOfWeek().toString();
	}
    public static String dayOfWeekOfAltAlt(Date date) {
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
        String formattedDate = dateFormat.format(date);
        String dayOfWeek = formattedDate.split(",")[0];
        return dayOfWeek;
    }
	public static void _7() {
		System.out.println(dayOfWeekOfAltAlt(new Date()));
	}
//
//		8. **Formatar Data com Locale:**
//		   - Formate uma data em um formato específico de `Locale`, como francês ou japonês.
	public static void _8() {
		Date date = new Date();
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.JAPAN);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.FRANCE);
		System.out.println(dateFormat.format(date));
	}
//
//		9. **Calcular Idade:**
//		   - Escreva um programa que calcule a idade de uma pessoa com base na data de nascimento fornecida.
	public static String ageOf(Date birthDate) {
		Period period = Period.between(
				birthDate
					.toInstant()
					.atZone(ZoneId.systemDefault())
					.toLocalDate(), 
				LocalDate.now()
		);
		return String.format(
				"%d years, %d months and %d days", 
				period.getYears(), period.getMonths(), period.getDays()
		);
	}
	public static void _9() {
		try {
			System.out.println(ageOf(new SimpleDateFormat("dd/MM/yyyy").parse("15/12/1996")));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
//
//		10. **Último Dia do Mês:**
//		    - Dada uma data, determine qual é o último dia do mês dessa data.
	public static void _10() {
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
		System.out.println(calendar.getMaximum(Calendar.DAY_OF_MONTH));
	}
}
