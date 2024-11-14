package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Doubling {

	public List<Integer> doubling(List<Integer> nums) {
		return nums.stream().map(num -> {return num*2;}).collect(Collectors.toList());
	}
}
