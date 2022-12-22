package Classe.Data;

public class DataTeste {
	public static void main(String[] args) {
		Data queda = new Data(9, 11, 1989);
		queda.description = "A queda do muro de Berlim, em 9 de novembro de 1989, "
				+ "foi um evento crucial na história mundial que marcou a queda da "
				+ "Cortina de Ferro e o início da queda do comunismo na Europa "
				+ "Oriental e Central. A queda da fronteira interna da Alemanha "
				+ "ocorreu pouco depois";
		Data outraQueda = new Data(26, 12, 1991);
		outraQueda.description = "A dissolução da União Soviética "
				+ "ocorreu em 26 de dezembro de 1991, como resultado da "
				+ "declaração nº. 142-Н do Soviete Supremo da União Soviética. "
				+ "A declaração reconheceu a independência das antigas repúblicas "
				+ "soviéticas e criou a Comunidade de Estados Independentes.";
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
