package curso.Encapsulamento.Exercicio;

public class Pessoa {
	private String name = "Josicleison";
	private int age;
	public Pessoa(int age) {
		setAge(age);
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		if (age <= 120) {
			this.age = Math.abs(age);
		}
	}
	@Override public String toString() {
		return "nome: " + getName() + "\nidade: " + getAge();
	}
}
