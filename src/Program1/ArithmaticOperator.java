package Program1;

import java.util.Scanner;

public class ArithmaticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
	
		
		System.out.println("Enter first num");
		int num=scan.nextInt();
		System.out.println("Enter second num");
		int num2=scan.nextInt();
		System.out.println(num+num2+"  "+"Add");
		System.out.println(num-num2+"  "+"sub");
		System.out.println(num/num2+"  "+"/");
		System.out.println(num*num2+"  "+"*");
		  
		
	}

}
