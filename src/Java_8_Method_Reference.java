import java.util.Arrays;
import java.util.List;

public class Java_8_Method_Reference {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sonu", "Gaurav", "Madhuri");
		names.forEach(System.out::println);
	}
}
