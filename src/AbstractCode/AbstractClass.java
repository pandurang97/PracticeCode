package AbstractCode;

abstract class Animal {
	abstract void run();

	void eat() {
		System.out.println("Animal is eating.");
	}
}

 class Dog extends Animal {
	void run() {
		System.out.println("Running animals");
	}

}

public class AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a = new Dog();
		a.eat();
		a.run();

	}

}
