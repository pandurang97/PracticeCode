package javaPractice;

public class Code18 {

	public void decToBinary(int n) {
		for(int i=31;i>=0;i--) {
			int k =n>>i;
			if((k&1)>0)
				System.out.print("1");
			else
				System.out.print("0");
		}
	}
	public static void main(String[] args) {
	
		Code18 a = new Code18();
		int n=32;
		System.out.print("Decimal - "+n +" ");
		System.out.print("Binary - ");
		a.decToBinary(n);
	}

}
