package lambdaExpressions;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class LamExp2 {

	public static Predicate<String> checkIfStartWith(String letter) {
		return name -> name.startsWith(letter);
	}

	public LamExp2() {
		final List<String> friends = Arrays.asList("Rohini", "Kavya", "Geethika", "Dheeraj", "Radhika", "Anvitha");

		final Function<String, Predicate<String>> startsWithLetter = letter -> name -> name.startsWith(letter);

		final List<String> friendsStartsWithR = friends.stream().filter(checkIfStartWith("R"))
				.collect(Collectors.toList());
		System.out.println(friendsStartsWithR);
	}

}