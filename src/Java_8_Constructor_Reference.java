interface PersonFactory<P extends Person> {
	P create(String firstName, String lastName);
}

class Person {
	String firstName;
	String lastName;

	Person() {
	}

	Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + " " + lastName;
	}
}

public class Java_8_Constructor_Reference {
	public static void main(String[] args) {
		PersonFactory<Person> personFactory = Person::new;
		//Above line is identical to below two lines
		//PersonFactory<Person> personFactory = (a, b) -> { return new Person(a, b); };
		//PersonFactory<Person> personFactory = (a, b) -> new Person(a, b);
		System.out.println(personFactory.create("Sonu", "Singh"));
	}
}