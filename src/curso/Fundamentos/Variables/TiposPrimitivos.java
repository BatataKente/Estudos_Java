package curso.Fundamentos.Variables;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// tipos numericos inteiros
		byte  anosDeEmpresa = 23;
		short numeroDeVoos = 541;
		int id = 56789;
		long pontosAcumulados = 3_323_446_123L;
		System.out.print(
				"Anos de empresa: " + anosDeEmpresa + "\n" +
				"Dias de empresa: " + anosDeEmpresa*365 + "\n" +
				"Numero de voos: " + numeroDeVoos + "\n" +
				"Id: " + id + "\n" +
				"Pontos acumulados: " + pontosAcumulados
		);
		// tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		System.out.print(
				"\n\nSalário: " + salario + "\n" +
				"Vendas acumuladas: " + vendasAcumuladas
		);
		// tipo boleano
		boolean estaDeFerias = false;
		System.out.print("\n\nEsta de férias: " + estaDeFerias);
		// tipo caractere
		char nota = 'A';
		System.out.print("\n\nNota: " + nota);
		// quantos pontos por real
		System.out.printf(
				"\n\nrelação de pontos acumulados: " + pontosAcumulados/vendasAcumuladas + "\n" +
				id + ": ganha -> " + salario + "\n" +
				"Está de férias? " + estaDeFerias + "\n" +
				"A nota tirada foi: %c ", nota
		);
	}
}
