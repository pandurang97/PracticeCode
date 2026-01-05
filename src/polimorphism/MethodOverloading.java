package polimorphism;

class calculator {
	public int add(int a, int b, int c) {
		return a + b + c;
	}

	public int add(int a, int b) {
		return a + b;
	}
}

public class MethodOverloading {
	public static void main(String[] args) {
		calculator c = new calculator();
		int d = c.add(10, 20);
		int w = c.add(5, 3, 10);
		System.out.println(d);
		System.out.println(w);

	}

}
