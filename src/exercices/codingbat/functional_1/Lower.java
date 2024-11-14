package exercices.codingbat.functional_1;

import java.util.List;
import java.util.stream.Collectors;

public class Lower {
	public List<String> lower(List<String> strings) {
		return strings
				.stream()
				.map(sentence -> {return sentence.toLowerCase();})
				.collect(Collectors.toList());
	}
}