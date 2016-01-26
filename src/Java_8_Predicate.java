import java.util.Objects;
import java.util.function.Predicate;

public class Java_8_Predicate {

	public static void main(String args[]) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		System.out.println(predicate.test("Java"));
		System.out.println(predicate.negate().test("Java"));

		Predicate<Boolean> predicate1 = Objects::nonNull;
		Predicate<Boolean> predicate2 = Objects::isNull;
		System.out.println(predicate1.test(new Boolean(true)));
		System.out.println(predicate2.test(null));

		Predicate<String> predicate3 = String::isEmpty;
		Predicate<String> predicate4 = predicate3.negate();
		System.out.println(predicate3.test(""));
		System.out.println(predicate4.test(""));
	}
}