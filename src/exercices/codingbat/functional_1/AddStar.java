package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class AddStar {
	public List<String> addStar(List<String> strings) {
		return strings
				.stream()
				.map(sentence -> {return sentence + "*";})
				.collect(Collectors.toList());
	}
}
