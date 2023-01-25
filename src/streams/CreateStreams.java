package streams;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CreateStreams {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		
		Stream<String> languages = Stream.of("Java ", "Lua ", "JavaScript\n");
		languages.forEach(print);
		
		String[] otherLanguages = {"Phyton ", "Lisp ", "Perl ", "Go\n"};
		
		Stream.of(otherLanguages).forEach(print);
		Arrays.stream(otherLanguages).forEach(print);
		Arrays.stream(otherLanguages, 1, 4).forEach(print);
	}
}
