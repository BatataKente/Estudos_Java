package Collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	public static void main(String[] args) {
		example();
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	static void example() {
		HashSet hashSet = new HashSet();
		hashSet.add(1.2);
		hashSet.add(true);
		hashSet.add("Lero Lero");
		hashSet.add(1);
		hashSet.add('Z');
		System.out.println("O tamanho é " + hashSet.size());
		hashSet.add(1);
		hashSet.add('Z');
		System.out.println("O tamanho é " + hashSet.size());
		System.out.println(hashSet.remove("Lero Lero"));
		System.out.println("O tamanho é " + hashSet.size());
		System.out.println(hashSet.contains(1));
		System.out.println(hashSet.contains(true));
		Set numbers = new HashSet();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		System.out.println(numbers);
		System.out.println(hashSet);
		hashSet.addAll(numbers);
		System.out.println(hashSet);
		hashSet.retainAll(numbers);
		System.out.println(hashSet);
		hashSet.clear();
		System.out.println(hashSet);
	}
}
