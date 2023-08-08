package apresentacao._3_tipos_primitivos;

public class TiposPrimitivos0 {
	public static void main(String[] args) {
//		Tipos de dados básicos
//		Exemplos: int, double, char, boolean
		int nota = 10;
		double pi = Math.PI;
		char letra = 'a';
		boolean passouDeAno = nota > 7;
		
		System.out.println(nota);
		System.out.println(pi);
		System.out.println(letra);
		System.out.println(passouDeAno);
//		Operador ternário
		System.out.println(passouDeAno? "O aluno passou" : "Reprovado!");
	}
}
