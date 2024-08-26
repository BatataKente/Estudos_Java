package cursos.free_code_camp._1;

public class Variables {
	
	static int age = 87;
	
	public static void main(String[] arguments) {
		System.out.println(String.format("I am %d years old.", age));
	}
	
	static {
		age++;
	}
}
