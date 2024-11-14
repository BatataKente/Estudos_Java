package exercices.gpt.exercicios_java.exercices_date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class DateJava {
	public static void main(String[] args) {
	}
	
	public static void _4() {
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL, new Locale("pt", "BR"));
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
		System.out.println(dateFormat.format(date));
		
		dateFormat = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
		System.out.println(dateFormat.format(date));
	}
	
	public static void _3() {
		
		Calendar calendar = Calendar.getInstance();
		Date date = calendar.getTime();
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		
		try {
			Date date2 = dateFormat.parse("12/01/1995");
			System.out.println(date2);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(simpleDateFormat.format(date));
		
		try {
			System.out.println(simpleDateFormat.parse("02/08/1970"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
			
	public static void _2() {

		Calendar calendar = Calendar.getInstance();
		calendar.set(2013, Calendar.FEBRUARY,	28);
		
		Date date = calendar.getTime();
		System.out.println(date);
		
		DateFormat dateFormatFull = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println(dateFormatFull.format(date));
		
		DateFormat dateFormatLong = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println(dateFormatLong.format(date));
		
		DateFormat dateFormatMedium = DateFormat.getDateInstance(DateFormat.MEDIUM);
		System.out.println(dateFormatMedium.format(date));
		
		DateFormat dateFormatShort = DateFormat.getDateInstance(DateFormat.SHORT);
		System.out.println(dateFormatShort.format(date));
	}
	
	public static void _1() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR,	2021);
		
		System.out.println(calendar.getTime());
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH) + 1);
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		Calendar calendar2 = Calendar.getInstance();
		
		System.out.println(calendar2.getTime());
		System.out.println(calendar2.get(Calendar.YEAR));
		System.out.println(calendar2.get(Calendar.MONTH) + 1);
		System.out.println(calendar2.get(Calendar.DAY_OF_MONTH));
	}
}
