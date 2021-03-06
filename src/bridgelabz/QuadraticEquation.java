package bridgelabz;

/*
* importing the scanner class
*/
import java.util.Scanner;

public class QuadraticEquation {
	
	/*
	* Function to find the roots of equation and print it
	*/
	
	static void roots(int a, int b, int c) {
		
		// calculating delta value
		int delta = Math.abs(b * b - 4 * a * c);
		double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
		double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);

		System.out.println("Roots of the given equations are :");
		System.out.println(x1);
		System.out.println(x2);

	}

	/*
	 * Main method to test the class
	*/
	public static void main(String[] args) {
		/*
		* creating scanner object
		*/
		Scanner s = new Scanner(System.in);
		/*
		* using try and catch block method code to be executed in try block others throws exception
		*/
		try {
			System.out.println("enter value for a ");
			int a = s.nextInt();
			System.out.println("enter value for b");
			int b = s.nextInt();
			System.out.println("enter value for c");
			int c = s.nextInt();
			roots(a, b, c);
		} catch (Exception e) {
			System.out.println("enter correct input");
		}
		s.close();
	}
}
