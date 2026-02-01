package InterviewJavaCode;

import java.util.ArrayList;
import java.util.List;

public class FindDuplicate {

	public static void main(String[] args) {

		int [] numbers = {1,2,3,4,2,7,8,8,3};
		List<Integer> duplicate = new ArrayList<>();
		
		for(int i=0;i<numbers.length;i++)
		{
			for(int j=i+1;j<numbers.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					if(!duplicate.contains(numbers[i]))
					{
						duplicate.add(numbers[i]);
					}
				}
			}
		}
		System.out.println("Duplicate Elements: "+duplicate);
	}

}
