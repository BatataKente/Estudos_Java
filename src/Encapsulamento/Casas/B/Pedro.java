package Encapsulamento.Casas.B;

import Encapsulamento.Casas.A.Ana;

public class Pedro extends Ana {
	Ana mae = new Ana();
	void testeAcessos() {
//		System.out.println(mae.facoDentroDeCasa);
//		System.out.println(mae.formaDeFalar);
		System.out.println(formaDeFalar);
		System.out.println(mae.todosSabem);
	}
}
