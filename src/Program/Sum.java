package Program;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1,4,8,9,10,88,99};
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			
//			System.out.println("The sum of number is:"+arr[i]);
			sum	=sum+arr[i];
		}
		System.out.println("The sum of given arrays is:"+sum);
	}

}
