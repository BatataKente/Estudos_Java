package Fundamentos;

import javax.swing.JOptionPane;

public class ConsersaoStringToNumero {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(
				"Digite o primeiro valor:"
		);
		String b = JOptionPane.showInputDialog(
				"Digite o segundo valor:"
		);
		double resultado = Double.parseDouble(a) + Double.parseDouble(b);
		System.out.printf("O resultado é %.1f", resultado);
		System.out.printf("\nA média é %.1f", resultado/2);
	}
}
