package exercices.sorting;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class IntegerSortingDemo {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Integer(15));
		list.add(new Integer(3));
		list.add(new Integer(7));
		list.add(new Integer(1));
		list.add(new Integer(9));
		list.add(new Integer(10));
		System.out.println(list);//[15, 3, 7, 1, 9, 10]
		Collections.sort(list);
		System.out.println("After sorting... " + list);//[1, 3, 7, 9, 10, 15]
	}
}
