package curso.Collections;

import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> users = new HashMap<Integer, String>();
		users.put(1, "Josicleison");
		users.put(1, "Mickael Jackson");
		users.put(20, "Josicleisde");
		users.put(3, "Josicleison");
		exampleI(users);
		exampleII(users);
	}
	static void exampleII(Map<Integer, String> users) {
		for (int key : users.keySet()) {
			System.out.print(key + " ");
		}
		System.out.print("\n");
		for (String values : users.values()) {
			System.out.println(values);
		}
		for (Entry<Integer, String> user : users.entrySet()) {
			System.out.print(user.getKey() + ": ");
			System.out.println(user.getValue());
		}
	}
	static void exampleI(Map<Integer, String> users) {
		System.out.println(users.size());
		System.out.println(users.isEmpty());
		System.out.println(users.keySet());
		System.out.println(users.values());
		System.out.println(users.entrySet());
		System.out.println(users.containsKey(20));
		System.out.println(users.containsValue("Josicleison"));
		System.out.println(users.get(3));
		System.out.println(users.remove(20, "Lero Lero"));
		System.out.println(users.remove(1));
		System.out.println(users.values());
	}
}
