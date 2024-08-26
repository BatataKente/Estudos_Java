package apresentacao._4_conceitos_importantes__membros_de_classe;

public class ConceitosImportantes {
	public static void main(String[] args) {
		//Bloco: Conjunto de comandos cercados por {}
		{
			int valor = 2;
			System.out.println(valor);
		}
		//Instância: Cópia de uma classe que contém seus próprios 
		//valores de variáveis de instância
		UmObjeto umObjeto = new UmObjeto();
		System.out.println(umObjeto);

		//Atributos e métodos pertencentes à classe, não à instância
		System.out.println(Math.PI);
		
		//Acesso usando a notação de ponto (Classe.atributo ou Classe.método)
		System.out.println(umObjeto.atributo);
		System.out.println(umObjeto.metodo());
	} 
}