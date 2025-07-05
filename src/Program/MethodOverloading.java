package Program;

class Adder{
	static int add(int a, int b) 
	{
		return a+b;
	}
	static int add (int a, int b, int c)
	{
		return a+b+c;
	}
}

public class MethodOverloading {

	public static void main(String[] args) {


		System.out.println("Result"+"  "+Adder.add(35	, 352));
		System.out.println("Result"+"  "+Adder.add(0, 10, 40));
	}

}
