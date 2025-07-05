package Program;

public class DefaultSameclass {

	int a=10;
	
	void method() {
		System.out.println("This is a method wihin the clss:");
		System.out.println("The value of a"+a);
	}
	public static void main(String[] args) {
	
		DefaultSameclass dsc = new DefaultSameclass ();
		dsc.method();
		System.out.println("Accessing the data");
	}
}
