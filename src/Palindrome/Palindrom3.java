package Palindrome;

public class Palindrom3 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome("radar".toLowerCase()));
		System.out.println(isPalindrome("Naman".toLowerCase()));
		System.out.println(isPalindrome("12321".toLowerCase()));
		System.out.println(isPalindrome("12345".toLowerCase()));
	
	}
	private static boolean isPalindrome(String string) {
		String reversed=new StringBuilder(string).reverse().toString();
		return string.equals(reversed);
	}

}
