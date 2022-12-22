package Classe.Data;

public class DataTeste {
	public static void main(String[] args) {
		Data queda = new Data(9, 11, 1989);
		Data outraQueda = new Data(26, 12, 1991);
		System.out.printf(
				"Queda do muro de Berlin: %d/%d/%d\n", 
				queda.dia, queda.mes, queda.ano
		);
		System.out.printf(
				"Queda da URSS: %d/%d/%d\n", 
				outraQueda.dia, outraQueda.mes, outraQueda.ano
		);
	}
}
