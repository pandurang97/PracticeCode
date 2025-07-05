package javaPractice;

public class HeartCode13 {

	public static void main(String[] args) {

		 int i, j;
	        int n = 5; // You can increase this for a bigger heart

	        // Upper part of heart
	        for (i = n / 2; i <= n; i += 2) {
	            // Left spaces
	            for (j = 1; j < n - i; j += 2) {
	                System.out.print(" ");
	            }
	            // Left stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            // Middle spaces
	            for (j = 1; j <= n - i; j++) {
	                System.out.print(" ");
	            }
	            // Right stars
	            for (j = 1; j <= i; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }

	        // Lower part of heart (inverted triangle)
	        for (i = n; i >= 1; i--) {
	            // Left spaces
	            for (j = 0; j < n - i; j++) {
	                System.out.print(" ");
	            }
	            // Stars
	            for (j = 1; j <= (i * 2) - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	    }
	}