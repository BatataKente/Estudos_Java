package curso.Collections;

import java.util.HashSet;

import curso.Collections.Listas.User;

public class Hash {
	public static void main(String[] args) {
		HashSet<User> users = new HashSet<User>();
		users.add(new User("Josicleison"));
		users.add(new User("Josicleide"));
		users.add(new User("Ana"));
		boolean test = users.contains(new User("Josicleison"));
		System.out.println(test);
	}
}