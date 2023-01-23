package Lambdas;

public class Trabalho implements Runnable {
	@Override public void run() {
		for (int counter = 0; counter < 10; counter++) {
			System.out.println("Lero Lero #1 " + counter);
			try {
				Thread.sleep(100);
			} catch (InterruptedException error) {
				error.printStackTrace();
			}
		}
	}
}
