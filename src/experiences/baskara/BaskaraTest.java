package experiences.baskara;

public class BaskaraTest {
	public static void main(String[] args) {
//		try {
//			Baskara baskara = new Baskara(2, 5, 2);
//			System.out.print(baskara);
//		} catch (Exception exception) {
//			exception.printStackTrace();
//		}
		try {
			Roots roots;
			roots = Baskara.calculate(2, 5, 2);
			System.out.print(roots);
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}
