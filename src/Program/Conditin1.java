package Program;

public class Conditin1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 97;
		
		if(a<0)
		{
			System.out.println("Num is -ve");
		}
		else if(a==0)
		{
			System.out.println("Num is 0");
		}
		else
		{
			if(a%2==0)
			{
				System.out.println("Num is even");
			}
			else
			{
				System.out.println("Num is odd");
			}
		}

		
	}

}
