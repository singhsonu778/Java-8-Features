import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Java_8_Stream {
	public static void main(String args[]) {

		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");
		strings.forEach(System.out::println);

		// filter //count
		long count = strings.stream().filter(string -> string.isEmpty()).count();
		System.out.println("Empty Strings count: " + count);

		count = strings.stream().filter(string -> string.length() == 3).count();
		System.out.println("Strings of length 3: " + count);

		List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
		System.out.println("Filtered List: " + filtered);

		String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
		System.out.println("Merged String: " + mergedString);

		List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
		System.out.println("Numbers : " + numbers);

		// map
		strings.stream().map(String::toUpperCase).forEach(System.out::println);

		// distinct
		Object squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
		System.out.println("Squares List: " + squaresList);

		System.out.println("Random Numbers: ");
		Random random = new Random();

		// sort
		random.ints().limit(10).sorted().forEach(System.out::println);
		/* sorted only create a sorted view of the stream without manipulating
		 the ordering of the backed collection */
	}
}
