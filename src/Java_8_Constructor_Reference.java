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
		System.out.println(personFactory.create("Sonu", "Singh"));
	}
}