package Factorial;

public class Factorial1 {

	public static void main(String[] args) {
		
		int i, fact=1;
		int number =5;
		for(i=1;i<=number;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+ number +" is:" +fact);
	}

}
//28 dec 2025