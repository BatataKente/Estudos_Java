package curso.Classe.Teste;

import curso.Classe.Objetos.Data;

public class ValorReferencia {
	public static void main(String[] args) {
		teste1();
		System.out.println("\n");
		teste2();
		int c = 5;
		modifyPrimitive(c);
		System.out.print("\n\n" + c);
	}
	static void teste1() {
		double a = 2;
		double b = a; // atribuição por valor
		a++; b--;
		System.out.print("a: " + a + "\nb: " + b);
	}
	static void teste2() {
		Data a = new Data(1, 6, 2022);
		Data b = a; // atribuição por referência
		a.dia = 31;
		b.mes = 12;
		a.ano = 2025;
		System.out.print(
				"a: " + a + "\nb: " + b
				+ "\ndata: " + b.formatData()
				+ "\ndata: " + a.formatData()
		);
		turnDataToDefault(b);
		System.out.print(
				"\ndata: " + b.formatData()
				+ "\ndata: " + a.formatData()
		);
	}
	static void turnDataToDefault(Data d) {
		d.dia = 1; d.mes = 1; d.ano = 1970;
	}
	static void modifyPrimitive(int a) {
		a++;
	}
}
