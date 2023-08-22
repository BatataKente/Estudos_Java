package curso.Lambdas;

public class Tréd {
	public static void main(String[] args) {
		final var trabalho_1 = new Trabalho();
		final var trabalho_2 = new Runnable() {
			@Override public void run() {
				for (int counter = 0; counter < 10; counter++) {
					System.out.println("Lero Lero #2 " + counter);
					try {
						Thread.sleep(100);
					} catch (InterruptedException error) {
						error.printStackTrace();
					}
				}
			}
		};
		final Runnable trabalho_3 = Tréd::trabalho_3;
		final var thread_1 = new Thread(trabalho_1);
		final var thread_2 = new Thread(trabalho_2);
		final var thread_3 = new Thread(trabalho_3);
		
		thread_1.start();
		thread_2.start();
		thread_3.start();
	}
	
	static void trabalho_3() {
		for (int counter = 0; counter < 10; counter++) {
			System.out.println("Lero Lero #3 " + counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException error) {
				error.printStackTrace();
			}
		}
	}
}
