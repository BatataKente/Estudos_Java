package curso.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

class CreateStreams {
	  public static void main(String[] args) {
		  	Consumer<Object> print = System.out::print;
		  	Stream<String> languages = Stream.of("Java ", "Lua ", "Portugol");
		  	languages.forEach(print);
		  	System.out.print("\n\n");
		  	String[] languages_2 = {"Python ", "Lisp ", "Perl ", "Go"};
		  	Stream.of(languages_2).forEach(print);
		  	System.out.print("\n\n");
		  	Arrays.stream(languages_2).forEach(print);
		  	System.out.print("\n\n");
		  	Arrays.stream(languages_2, 1, 3).forEach(print);
		  	System.out.print("\n\n");
		  	List<String> languages_3 = Arrays.asList("C ", "PHP ", "Kotlin ");
		  	languages_3.stream().forEach(print);
		  	System.out.print("\n\n");
		  	languages_3.parallelStream().forEach(print);
		  	System.out.print("\n\n");
//		  	Stream.generate(() -> "a").forEach(print);
//		  	Stream.iterate(0, n -> n + 1).forEach(print);
	  }
}