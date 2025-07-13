package InterviewJavaCode;

public class FindingSmalletNumber {

	public static void main(String[] args) {
		
		int number[]= {10,23,43,0,-13,2,1,5};
		int min=number[0];
		
		for(int i=1;i<number.length;i++)
		{
			if(number[i]<min)
			{
				min = number[i];
			}
		}
		System.out.println("The smallest nunber is: "+min);
		
	}

}
