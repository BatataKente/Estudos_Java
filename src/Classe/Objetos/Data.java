package Classe.Objetos;

public class Data {
	public int dia, mes, ano;
	String description = "?";
	Data() {
		this(1 ,1 ,1970);
	}
	public Data(final int dia, final int mes, final int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	public String otherWayFormatData() {
		return dia + "/" + mes + "/" + ano;
	}
	public String formatData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	void printData() {
		System.out.print(formatData());
	}
}
