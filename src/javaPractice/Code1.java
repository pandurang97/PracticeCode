package javaPractice;

class Parent{
	static int num = 100;
	static void print() {
		System.out.println("Parent");
	}
}
class Child extends Parent{
	
}
public class Code1 {
	
	public static void main(String[] args) {
		Child.print();
		System.out.println(Child.num);

	}

}
