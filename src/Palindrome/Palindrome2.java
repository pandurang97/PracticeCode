package Palindrome;

public class Palindrome2 {

	public static void main(String[] args) {
	
		int num=12021, reverse=0,rem,temp;
		
		if(getReverse(num,reverse)==num)
			System.out.println(num+" Is palindrome");
		else
			System.out.println(num+" Is not palindorm");
	}
	static int getReverse(int num, int rev) {
		if(num==0)
			return rev;
		int rem=num%10;
		rev=rev*10+rem;
		return getReverse(num/10,rev);
	}

}
