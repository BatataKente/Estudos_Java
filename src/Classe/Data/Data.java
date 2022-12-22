package Classe.Data;

public class Data {
	final int dia, mes, ano;
	String description;
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String formatData() {
//		return dia + "/" + mes + "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void printData() {
		System.out.print(formatData());
	}
}
