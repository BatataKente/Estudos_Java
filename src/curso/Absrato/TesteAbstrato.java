package curso.Absrato;

public class TesteAbstrato {
	public static void main(String[] args) {
		Mamífero a  = new Cachorro();
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
	}
}
