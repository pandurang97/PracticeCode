package Pyramid;

public class Pyramid4 {

	public static void main(String[] args) {
	int count=1;
	int num=3;
		for(int i=1; i<=3;i++)
		{
			for(int j=1; j<=count;j++)
			{
			System.out.print(num+"\t");
			num+=3;
			}
			System.out.println("\t");
			count++;
		}
	}

}
