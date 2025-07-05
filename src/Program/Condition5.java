package Program;

public class Condition5 {

	public static void main(String[] args) {

		String address="Delhi, India";
		if(address.endsWith("India")) {
			if(address.contains("meerut")) {
				System.out.println("Your city is meerut");
			}
			else if(address.contains("noida")) {
				System.out.println("Your city is noida");
			}
			else {
				System.out.println("You are not an indian");
			}
			
		}
	}

}
