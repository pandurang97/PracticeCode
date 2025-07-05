package fibonacciSeries;

import java.util.LinkedList;
import java.util.Queue;
public class Fibonacci5 {

	public static void fibonacci(int n) {
		if(n<1) return;
		Queue<Integer>queue = new LinkedList<>();
		queue.add(0);
		queue.add(1);
		System.out.print("0 1");
		for( int i=2;i<n;i++) {
			int first=queue.poll();
			int second=queue.peek();
			int next=first+second;
			queue.add(next);
			System.out.print(" "+next+" ");
		}
		
	}
	public static void main(String[] args) {

		int n=10;
		fibonacci(n);
	}

}
