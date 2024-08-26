package exercices.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortingDemo {
	public static void main(String[] args) {
		List musicasIndianas = new ArrayList();
		musicasIndianas.add("zara zara");
		musicasIndianas.add("besabriyaan");
		musicasIndianas.add("kaise hua");
		musicasIndianas.add("aeisa desh hai mera");
		musicasIndianas.add("koi lauta de wohh pyare pyare din");
		showList(musicasIndianas);
		Collections.sort(musicasIndianas);
		showList("After sorting...", musicasIndianas);
		showReverseList("After reverse sorting...", musicasIndianas);
	}
	private static void showList(List musicasIndianas) {
		for(int i = 0; i < musicasIndianas.size(); i++) {
			System.out.println("- " + musicasIndianas.get(i));
		}
	}
	private static void showList(String label, List musicasIndianas) {
		System.out.println(label);
		for(int i = 0; i < musicasIndianas.size(); i++) {
			System.out.println("- " + musicasIndianas.get(i));
		}
	}
	private static void showReverseList(String label, List musicasIndianas) {
		System.out.println(label);
		for(int i = musicasIndianas.size() - 1; i >= 0; i--) {
			System.out.println("- " + musicasIndianas.get(i));
		}
	}
}
