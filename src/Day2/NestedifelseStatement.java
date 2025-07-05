package Day2;

public class NestedifelseStatement {

	public static void main(String[] args) {

		int age = 21;
		
		if(age>18)
		{
			if(age>35)
			{
				System.out.println("Elegible for CM");
			}
			else {
				System.out.println("Eligible for voting");

			}
		
		}
		else {
			System.out.println("Outof block");
		}
		
	}

}
