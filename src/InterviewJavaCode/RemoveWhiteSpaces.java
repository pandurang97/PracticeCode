package InterviewJavaCode;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {

		String str ="Remove White Spaces";
		
		str = str.replaceAll("\\s+", "");
				System.out.println("The strin is:: "+str);

	}

}
