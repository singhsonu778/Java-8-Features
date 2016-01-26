@FunctionalInterface		// avoids adding 2nd abstract method to Interface
interface Converter<F, T> {
	T convert(F from);
}

class Something {
	String startsWith(String s) {
		return String.valueOf(s.charAt(0));
	}
}

public class Java_8_Functional_Interface_And_Method_Reference {
	public static void main(String args[]) {
		// Converter<String, Integer> converter = (from) -> Integer.valueOf(from);
		Converter<String, Integer> converter = Integer::valueOf;
		System.out.println(converter.convert("123"));

		/**********************************************************************/

		Something something = new Something();
		Converter<String, String> converter1 = something::startsWith;
		System.out.println(converter1.convert("Java"));
	}
}