package curso.Classe.Null;

import curso.Classe.Objetos.Data;

public class ValorNulo {
	public static void main(String[] args) {
		String a = "";
		System.out.println(a.concat("!!!!"));
		Data b = Math.random() > 0.5 ? new Data(0, 0, 0) : null;
		if (b != null) {
			System.out.println(b.formatData());
		}
		String c = Math.random() > 0.5 ? "Lero Lero"  : null;
		if (c != null) {
			System.out.println(c);
		}
	}
}