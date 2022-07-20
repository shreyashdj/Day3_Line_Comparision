package com.bridgelabz.day3LineComparision;

import java.util.Scanner;		// imported Scanner class

public class LineComparision {

	public static void main(String[] args) {

		System.out.println("Welcome to Line Comparision");
		
		Scanner scan = new Scanner(System.in);		// created scan object
		
		/*
		 * 		taking inputs for x1,y1 & x2,y2
		 */

		System.out.println("\n Enter point A(x1,y1) :");
		int x1 = scan.nextInt();
		int y1 = scan.nextInt();
		
		System.out.println(" Enter point B(x2,y2) :");
		int x2 = scan.nextInt();
		int y2 = scan.nextInt();
		
		
		Double lengthOfLineAB = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));	// calculating length of line AB
		
		System.out.println("\n Two Points Are A(" +x1 +"," +y1 +") & B(" +x2 +"," +y2 +")");
		System.out.println(" Length of the line AB is " + lengthOfLineAB);
		
		/*
		 * 		taking inputs for p1,q1 & p2,q2
		 */
		
		System.out.println("\n Enter point C(p1,q1) :");
		int p1 = scan.nextInt();
		int q1 = scan.nextInt();
		
		System.out.println(" Enter point D(p2,q2) :");
		int p2 = scan.nextInt();
		int q2 = scan.nextInt();
		
		Double lengthOfLineCD = Math.sqrt((p2-p1) * (p2-p1) + (q2-q1) * (q2-q1));	// calculating length of line CD
		
		System.out.println("\n Two Points Are C(" +p1 +"," +q1 +") & D(" +p2 +"," +q2 +")");
		System.out.println(" Length of the line CD is " + lengthOfLineCD);
	    
		/*
		 * 		comparing of length of lines AB & CD using compareTo method
		 */
		
		int result = lengthOfLineAB.compareTo(lengthOfLineCD);
		
		if (result == -1) {
			System.out.println("\n Length of line AB is less than line CD");
		} else if (result == 1) {
			System.out.println("\n Length of line AB is greater than line CD");
		} else
			System.out.println("\n Length of lines AB & CD are equal");

		
scan.close();
		
	}

}
