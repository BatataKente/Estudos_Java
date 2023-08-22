package curso.Collections.Listas;

import java.util.ArrayList;
import java.util.List;

public class Lista {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		users.add(new User("Josicleison"));
		users.add(new User("Ana"));
		users.add(new User("Ana"));
		users.add(new User("Marcidineison"));
		users.add(new User("Jair"));
		users.add(new User("Jair"));
		System.out.println("Lero Lero " + users.get(3).toString());
		users.remove(1);
//		System.out.println(users.remove(new User("Marcidineison"))); 
		System.out.println(users.contains(new User("Marcidineison")));
		for (User user : users) {
			System.out.println(user);
		}
	}
}	
