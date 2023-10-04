package cursos.alura.java_brasil.cnpj;

import br.com.caelum.stella.validation.CNPJValidator;
import br.com.caelum.stella.validation.TituloEleitoralValidator;
import cursos.alura.java_brasil.Documento;

public class TesteCnpj {
	public static void main(String[] args) {
		final String cnpj = "66.040.316/0001-15";
//		try {
//			
//			new CNPJValidator().assertValid(cnpj);
//			System.out.println("CNPJ VÁLIDO");
//		} catch (InvalidStateException e) {
//			System.out.println("CNPJ INVÁLIDO : " + e);
//		}
		final String tituloEleitoral = "554100510175";
//		try {
//			new TituloEleitoralValidator().assertValid(tituloEleitoral);
//			System.out.println("TÍTULO VÁLIDO");
//		} catch (InvalidStateException e) {
//			System.out.println("TÍTULO INVÁLIDO : " + e);
//		}
		Documento.validar(new CNPJValidator(), cnpj);
		Documento.validar(new TituloEleitoralValidator(), "Título Eleitoral", tituloEleitoral);
	}
}
