package exercices.codingbat.string_1;

public class HelloName {
	public String helloName(String name) {
		return String.format("Hello %s!", new Object[]{name});
	}
	 public String helloName_1(String name) {
		 return "Hello " + name + "!";
	 }
}
