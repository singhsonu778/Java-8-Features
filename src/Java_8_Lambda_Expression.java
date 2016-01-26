import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java_8_Lambda_Expression {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sonu", "Gaurav", "Madhuri");

		System.out.println("Sort using Java 8 syntax");
		System.out.println("Before sort: " + names);

		Comparator<String> comparator = (s1, s2) -> s1.compareTo(s2);
		//Comparator<String> comparator = (s1, s2) -> {return s1.compareTo(s2);};
		Collections.sort(names, comparator);

		System.out.println("After sort: " + names);
	}
}
