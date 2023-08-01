package curso.Classe.Teste;

public class PrimeiroTrauma {
	private static PrimeiroTrauma self = new PrimeiroTrauma();
	int a = 3; 
	static int b = 4;
	public static void main(String[] args) {
		 System.out.println(/*My  Solution*/(new PrimeiroTrauma()).a);
		 PrimeiroTrauma trauma = new PrimeiroTrauma();
		 System.out.println(trauma.a);
		 System.out.println(b);
		 System.out.print(self.a);
	}
}
