package Program;

public class ArraysEvenNumReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {1,4,8,9,10,88,99};
		
		for(int i=arr.length-1; i>=0;i--)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
				
			}

		}
	
	}

}
