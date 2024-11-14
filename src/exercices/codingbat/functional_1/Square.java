package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Square {
	public List<Integer> square(List<Integer> nums) {
		return nums.stream().map(num -> {return num*num;}).collect(Collectors.toList());
	}
}
