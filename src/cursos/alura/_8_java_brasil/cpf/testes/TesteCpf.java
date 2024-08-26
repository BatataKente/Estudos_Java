package cursos.alura._8_java_brasil.cpf.testes;

import br.com.caelum.stella.validation.CPFValidator;
import cursos.alura._8_java_brasil.cpf.Cpf;

public class TesteCpf {
	public static void main(String[] args) {
//		86288366757
//		98745366797
//		Cpf cpf = new Cpf("86288366757");
//		System.out.println(cpf.getValue());
//		System.out.println(cpf.isValid());
//		Cpf cpf2 = new Cpf("98745366797");
//		System.out.println(cpf2.getValue());
//		System.out.println(cpf2.isValid());
//		Cpf cpf3 = new Cpf("22222222222");
//		System.out.println(cpf2.getValue());
//		System.out.println(cpf2.isValid());
		CPFValidator validator = new CPFValidator();
		try {
			validator.assertValid("86288366757");
			System.out.println("CPF VÁLIDO");
		} catch (Exception e) {
			System.out.println("CPF INVÁLIDO : " + e);
		}
	}
}