import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Java_8_Functional_Interface {
	public static void main(String args[]) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		System.out.print("Print all numbers: ");
		evaluate(list, n -> true);

		System.out.print("\nPrint even numbers: ");
		evaluate(list, n -> n % 2 == 0);
	}

	public static void evaluate(List<Integer> list, Predicate<Integer> predicate) {
		for (Integer n : list) {
			if (predicate.test(n)) {
				System.out.print(n + " ");
			}
		}
	}
}
