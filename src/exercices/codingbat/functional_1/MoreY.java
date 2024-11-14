package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {
	public List<String> moreY(List<String> strings) {
		return strings
				.stream()
				.map(sentence -> {
					return "y".concat(sentence).concat("y");
				})
				.collect(Collectors.toList());
	}
}
