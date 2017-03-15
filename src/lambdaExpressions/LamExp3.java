package lambdaExpressions;

import java.util.Arrays;
import java.util.List;

public class LamExp3 {

	public LamExp3() {
		final List<String> friends = Arrays.asList("Rohini", "Kavya", "Geethika", "Dheeraj", "Radhika", "Anvitha");


		friends.stream().map(String::toUpperCase).forEach(System.out::println);

	}

}
