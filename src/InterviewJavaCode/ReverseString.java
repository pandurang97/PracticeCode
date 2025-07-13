package InterviewJavaCode;

public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Automation";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println("Reverse of string is:  "+str+" TO: "+rev);
	}

}
