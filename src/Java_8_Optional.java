import java.util.Optional;

public class Java_8_Optional {

	public static void main(String args[]) {
		Integer value1 = null;
		Integer value2 = 10;
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		sum(a, b);
	}

	public static void sum(Optional<Integer> a, Optional<Integer> b) {
		System.out.println("First parameter is present: " + a.isPresent());
		System.out.println("Second parameter is present: " + b.isPresent());
		System.out.println("Total: " + (a.orElse(0) + b.get()));
		a.ifPresent(System.out::println);
		b.ifPresent(System.out::println);
	}
}