public class Java_8_Default_Method {
	public static void main(String args[]) {
		Vehicle vehicle = new Car();
		vehicle.method1();
		vehicle.method2();
		Vehicle.staticMethod();

		FourWheeler fourWheeler = new Car();
		fourWheeler.method1();
		fourWheeler.method3();
	}
}

interface Vehicle {
	default void method1() {
		System.out.println("Vehicle method1");
	}

	default void method2() {
		System.out.println("Vehicle method2");
	}

	static void staticMethod() {
		System.out.println("Static Method");
	}
}

interface FourWheeler {
	default void method1() {
		System.out.println("FourWheeler method1");
	}

	default void method3() {
		System.out.println("FourWheeler method3");
	}
}

class Car implements Vehicle, FourWheeler {
	public void method1() { 	// must override duplicate default message
		System.out.println("Car overridden method1");
		Vehicle.super.method1();
		FourWheeler.super.method1();
	}
}