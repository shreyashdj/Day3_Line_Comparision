package com.bridgelabz.day3LineComparision;

import java.util.Scanner;		// imported Scanner class

public class LineComparision {

	public static void main(String[] args) {

	System.out.println("Welcome to Line Comparision");
		
	Double lengthOfLineAB, lengthOfLineCD;
	
		Scanner scan = new Scanner(System.in);		// created scan object
		Line line = new Line();
		
		/*
		 * 		taking inputs for x1,y1 & x2,y2
		 * 		calculating length of line AB
		 */
		
		System.out.println("\nEnter point A(x1,y1) :");
		line.x1 = scan.nextInt();
		line.y1 = scan.nextInt();
		
		System.out.println("Enter point B(x2,y2) :");
		line.x2 = scan.nextInt();
		line.y2 = scan.nextInt();
		
		lengthOfLineAB = line.length();
		
		System.out.println("\n Two Points Are A(" +line.x1 +"," +line.y1 +") & B(" +line.x2 +"," +line.y2 +")");
		System.out.println(" Length of the line AB is " +lengthOfLineAB );
		
		/*		
		 * 		taking inputs for p1,q1 & p2,q2
		 * 		and calculating length of line CD
		 */
		
		System.out.println("\nEnter point C(x1,y1) :");
		line.x1 = scan.nextInt();
		line.y1 = scan.nextInt();
		
		System.out.println("Enter point D(x2,y2) :");
		line.x2 = scan.nextInt();
		line.y2 = scan.nextInt();
		
		lengthOfLineCD = line.length();
		
		System.out.println("\n Two Points Are C(" +line.x1 +"," +line.y1 +") & D(" +line.x2 +"," +line.y2 +")");
		System.out.println(" Length of the line CD is " +lengthOfLineCD );
		
		//	checking equality of length of lines AB & CD using equals method
		
		line.equal(lengthOfLineAB, lengthOfLineCD);
		
		/*
		 * 		comparing of length of lines AB & CD using compareTo method
		 */
		
		line.compare(lengthOfLineAB, lengthOfLineCD);

		
scan.close();		
	}

}
