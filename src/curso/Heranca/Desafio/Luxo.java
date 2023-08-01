package curso.Heranca.Desafio;

public interface Luxo {
	public void ligarAr();
	public void desligarAr();
	default int nivelDoAr() {
		return 1;
	}
}
