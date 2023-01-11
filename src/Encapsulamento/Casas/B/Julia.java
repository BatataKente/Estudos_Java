package Encapsulamento.Casas.B;

import Encapsulamento.Casas.A.Ana;

public class Julia {
	Ana sogra = new Ana();
	void testeAcessos() {
		System.out.println(sogra.todosSabem);
	}
}
