package javaPractice;

public class Code16 {

	static void swapvalues(int m, int n) {
		int temp =m;
		m=n;
		n=temp;
		System.out.println("value of m is: "+m   +"   values of n is:" +n +"  ");
	}
	
	public static void main(String[] args) {
	
		int m=9, n=5;
		swapvalues(m,n);
	}

}
