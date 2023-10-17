package cursos.alura._1_2_design_patterns._8;

public class ServicoSingleton {
		private static Servico instance;
		
		public Servico getInstance() {
			if(instance == null) instance = new Servico();
			return instance;
		}
}
