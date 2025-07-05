package Package1;

public class Private1 {

	private void add()
	{
		System.out.println("The result private access modifiers");
	}
	
	public static void main(String[]args) {
		Private1 pri = new Private1();
		pri.add();
	}
}

// Private acce modifiers can accept 1) Same package and same class