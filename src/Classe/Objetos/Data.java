package Classe.Objetos;

public class Data {
//	final int dia, mes, ano;
	public int dia, mes, ano;
	String description = "?";
	Data() {
		this.dia = 1;
		this.mes = 1;
		this.ano = 1970;
	}
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String formatData() {
//		return dia + "/" + mes + "/" + ano;
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void printData() {
		System.out.print(formatData());
	}
}
