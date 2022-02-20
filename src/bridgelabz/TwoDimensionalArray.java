package bridgelabz;

/*
* importing scanner class
*/
import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/*
		*  create scanner object
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows");
		int n = sc.nextInt();
		System.out.println("Enter the columns");
		int m = sc.nextInt();
		System.out.println("You are creating array of size: " + m + "x" + n);
		
		/*
		*  A library for reading in 2D arrays of integers, doubles, or booleans from
		*  standard input and printing them out to standard output.
		*/
		System.out.println("Cases for 2D Array ....");
		System.out.println("1  ==>> Integer");
		System.out.println("2  ==>> Double");
		System.out.println("3  ==>> Boolean");
		int Case = sc.nextInt();
		
		/*
		* using switch case for integer type array in rows and columns
		*/
		switch (Case) {
		case 1:
			System.out.println("For interger type array, please enter numbers for rows and columns");
			int arr[][] = new int[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(" " + arr[i][j]);
				}
				System.out.println(" ");
			}
				
		
		* /*
		* using switch case for double type array in rows and columns
		*/
		case 2:
			System.out.println("For double type array, please enter numbers for rows and columns");

			double arrD[][] = new double[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arrD[i][j] = sc.nextInt();
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(" " + arrD[i][j]);
				}
				System.out.println(" ");
			}
				
		/*
		* using switch case for boolen type array in rows and columns
		*/
		case 3:
			System.out.println("For boolean type array, please enter values for rows and columns");

			boolean arrB[][] = new boolean[n][m];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					arrB[i][j] = sc.nextBoolean();
				}
			}
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					System.out.print(" " + arrB[i][j]);
				}
				System.out.println(" ");
			}
				
		/*
		*  if three cases will not executed then enters for default statement
		*/
		default:
			System.out.println("INVALID INPUT ");
		}

	}

}
