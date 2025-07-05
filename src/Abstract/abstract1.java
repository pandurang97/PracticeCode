package Abstract;

abstract class Bank{
	abstract int rateofinterest();
	
}
class SBI extends Bank{
	int rateofinterest() {
		return 7;
	}
}
class icici extends Bank{
	int rateofinterest() {
		return 8;
	}
}
public class abstract1{
	public static void main(String args[]) {
		Bank b;
		b= new SBI();
		System.out.println("The rate of interest is"+b.rateofinterest()+"%");
		b= new icici();
		System.out.println("The rate of interest is"+b.rateofinterest()+"%");
	}
}