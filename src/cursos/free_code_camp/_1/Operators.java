package cursos.free_code_camp._1;

public class Operators {
	
	public static void main(Strings[] args) {
		_7();
	}
	
	public static void _7() {
		int a = 0;
		System.out.println(a++);
		System.out.println(a);

		int b = 0;
		System.out.println(--b);
		System.out.println(b);
	}
	
	public static void _6() {
		int score = 0;
		int turns = 10;
		score++;
		turns--;
		System.out.println(String.format("{\"score\": %d, \"turns\": %d}", score, turns));
	}
	
	public static void _5() {
		boolean isStudent = false;
		boolean isLibraryMember = true;
		System.out.println(String.format(
				"%b || %b => %b", isStudent, isLibraryMember, isStudent || isLibraryMember
		));
		System.out.println(String.format("!%b => %b", isStudent, !isStudent));
	}
	
	public static void _4() {
		int age = 25;
		int min = 18;
		int max = 40;
		System.out.println(String.format(
				"%d >= %d && %d <= %d? %b", age, min, age, max, age >= min && age <= max
		));
	}
	
	public static void _3() {
		int a = 12;
		int b = 15;
		System.out.println(String.format("%d == %d => " + (a == b), a, b));
		System.out.println(String.format("%d != %d => " + (a != b), a, b));
		System.out.println(String.format("%d > %d => " + (a > b), a, b));
		System.out.println(String.format("%d < %d => " + (a < b), a, b));
		System.out.println(String.format("%d >= %d => " + (a >= b), a, b));
		System.out.println(String.format("%d <= %d => " + (a <= b), a, b));
	}
	
	public static void _2() {
		int number = 12;
		int divisor = 2;
		System.out.println(String.format("%d %% %d = %d", number, divisor, number %= divisor));
	}
	
	public static void _1() {
		int a = 12;
		float b = 8;
		System.out.println(String.format("%d + %.2f = " + (a + b), a, b)); // addition
		System.out.println(String.format("%d - %.2f = " + (a - b), a, b)); // subtraction
		System.out.println(String.format("%d * %.2f = " + (a * b), a, b)); // multiplication
		System.out.println(String.format("%d / %.2f = " + (a / b), a, b)); // division
		System.out.println(String.format("%d %% %.2f = " + (a % b), a, b)); // modulus
		System.out.println(String.format("++%d => " + (++a), a)); // increment
		System.out.println(String.format("%d-- => " + (a--), a)); // decrement
		System.out.println(String.format("%d += %.2f => " + (a += b) + "\n", a, b)); // assignment
	}
}
