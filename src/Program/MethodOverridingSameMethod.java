package Program;

class Vehicle {
	public void run() {
		System.out.println("Vehicle is running::");
	}
}

class Bike extends Vehicle {
	public void run() {
		System.out.println("Bike 70km/hour");
	}
}

class Car extends Vehicle {
	public void run() {
		System.out.println("Car 35km/hour");
	}
}

public class MethodOverridingSameMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Vehicle();
		Bike b = new Bike();
		Car c = new Car();
		v.run();
		c.run();
		b.run();
	}

}
