package InterviewJavaCode;

public class CountCharacters {

	public static void main(String[] args) {

		String str = "Welcome to the Java programs";
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println("The total characters count of the given "+" = "+ str+ " is --> "+count);
	}

}
