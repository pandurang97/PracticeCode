package javaPractice;

public class Code6 {

	private static String s= "Welcome";
	public static void main(String[] args) {
	
		StringBuilder sb = new StringBuilder(s);
		System.out.println(sb.equals(s));
	}

}
