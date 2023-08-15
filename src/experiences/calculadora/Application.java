 package experiences.calculadora;

import javax.swing.SwingUtilities;

public class Application {
	public static void  main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				public void run() {
					Calculadora calculadora = new Calculadora();
					calculadora.setVisible(true);
				}
			}
		);
	}
}
