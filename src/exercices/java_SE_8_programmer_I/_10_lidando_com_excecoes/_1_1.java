package exercices.java_SE_8_programmer_I._10_lidando_com_excecoes;

import java.sql.SQLException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class _1_1 {
	
    private static Class[] manyExceptionClasses = {
            SQLException.class, // - Checked
            Exception.class, // - Checked
            IndexOutOfBoundsException.class, // - Checked
            FileNotFoundException.class, // - Checked
            IOException.class,// - Checked
            ParseException.class,// - Checked
            ArithmeticException.class,// - Unchecked (RuntimeException)
            NullPointerException.class,// - Unchecked (RuntimeException)
            ArrayIndexOutOfBoundsException.class,// - Unchecked (RuntimeException)
            IllegalArgumentException.class,// - Unchecked (RuntimeException)
            ClassCastException.class,// - Unchecked (RuntimeException)
            IllegalStateException.class,// - Unchecked (RuntimeException)
            UnsupportedOperationException.class// - Unchecked (RuntimeException)
    };
    
    public static void main(String[] args) {
//        Class[] exceptionClasses = {
//                SQLException.class,
//                Exception.class,
//                IndexOutOfBoundsException.class,
//                FileNotFoundException.class
//        };
        Question_1Solution(manyExceptionClasses);
    }
    
    public static void Question_1Solution(Class[] exceptionClasses) {
    	
        String uncheckedNames = "Nenhuma.";
        String checkedNames = "Nenhuma.";
        
        for(int i = 0; i < exceptionClasses.length; i++) {
            final Class name = exceptionClasses[i];
            System.out.println("- " + name.getSimpleName());
            if(RuntimeException.class.isAssignableFrom(name)) {
                if(uncheckedNames.equals("Nenhuma.")) {
                    uncheckedNames = name.getSimpleName();
                } else {
                    uncheckedNames += ", " + name.getSimpleName();
                }
            } else {
                if(checkedNames.equals("Nenhuma.")) {
                    checkedNames = "Checked: " + name.getSimpleName();
                } else {
                    checkedNames += ", " + name.getSimpleName();
                }
            }
        }
        
        System.out.println("Dentre as classes acima qual delas são unchecked, e checked?");
//        System.out.println("unchecked: " + uncheckedNames);
//		System.out.println("checked: " + checkedNames);
        System.out.println(String.format("unchecked: %s", new Object[]{uncheckedNames}));
        System.out.println(String.format("checked: %s", new Object[]{checkedNames}));
    }
}
















