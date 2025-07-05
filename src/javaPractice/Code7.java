package javaPractice;

import java.util.List;

public class Code7 {

	public static void main(String[] args) {
	
		Integer[]array = {1,2};
		List<Integer> li = List.of(array);
		array[0]=10;
		System.out.println(li);
	}

}
