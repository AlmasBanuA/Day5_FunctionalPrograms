package bridgelabz;

/* 
* importing the scanner class
*/
import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {

		/* 
		*takes two integer command-line arguments x and y
		*/
		
		int x1;
		int x2;
		int y1;
		int y2;
		double Dist;

		/*
		* creating scanner object and prints inpuut from user
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("enter x1 point");

		x1 = sc.nextInt();

		System.out.println("enter y1 point");

		y1 = sc.nextInt();

		System.out.println("enter x2 point");

		x2 = sc.nextInt();

		System.out.println("enter y2 point");

		y2 = sc.nextInt();

		/*
		*  prints the Euclidean distance from the point (x, y) to the origin (0, 0) from distance formula
		*/
		Dist = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

		System.out.println("The distance between" + "(" + x1 + "," + y1 + ")," + "(" + x2 + "," + y2 + ") is:" + Dist);

	}

}


	

