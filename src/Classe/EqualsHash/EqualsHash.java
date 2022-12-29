package Classe.EqualsHash;

public class EqualsHash {
	public static void main(String[] args) {
		example();
	}
	static void example() {
		var firstUser = new User();
		firstUser.nome = "Josicleison Elves";
		firstUser.email = "j@j.com";
		var secondUser = new User();
		secondUser.nome = "Josicleison Elves";
		secondUser.email = "j@j.com";
		System.out.println(firstUser == secondUser);
		System.out.println(firstUser.equals(secondUser));
		System.out.println(secondUser.equals(firstUser));
	}
}
