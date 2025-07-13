package InterviewJavaCode;

public class CountingVowelsAndConsonants {

	public static void main(String[] args) {
		
		String str = "A B C D E F G H I J K L M N O P Q R S T U V W X Y Z";
		str = str.toLowerCase();
		
		int vowels=0, consonants=0;
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch>='a'||ch<='z')
			{
				if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
					vowels++;
				}
				else {
					consonants++;
				}
			}
		}
		System.out.println("Vowels:  "+vowels +",  Consonants:  "+consonants);
		
	}

}
