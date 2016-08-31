import java.util.function.Function;

public class Java_8_Function {

	public static void main(String args[]) {
		Function<String, Integer> toInteger = Integer::valueOf;
		System.out.println(toInteger.apply("10") + toInteger.apply("20"));

		Function<String, String> backToString = toInteger.andThen(s -> String.valueOf(s * s));
		System.out.println(backToString.apply("10"));
	}
}