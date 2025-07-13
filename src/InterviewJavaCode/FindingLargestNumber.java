package InterviewJavaCode;

public class FindingLargestNumber {

	public static void main(String[] args) {
	
		int number[]= {10,30,4,2,0,12,53};
		int max = number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]>max)
			{
				max =number[i];
			}
		}
		System.out.println("The largest number is: "+max);
	}

}
