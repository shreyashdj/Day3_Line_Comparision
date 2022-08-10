package com.bridgelabz.day3LineComparision;

public class Line {
	
	int x1;
	int y1;
	int x2;
	int y2;
	
	public double length() {
		
		// calculating length of line
		Double lengthOfLine = Math.sqrt((x2-x1) * (x2-x1) + (y2-y1) * (y2-y1));
		
		return lengthOfLine;		
	}

	public void equal(Double lengthOfLineAB, Double lengthOfLineCD) {
		
		System.out.println("\n Length of lines AB & CD are equal : " + lengthOfLineAB.equals(lengthOfLineCD));
	}
	
	public void compare(Double lengthOfLineAB, Double lengthOfLineCD) {
		
		int result = lengthOfLineAB.compareTo(lengthOfLineCD);
		
		if (result == -1) {
			System.out.println("\n Length of line AB is less than line CD");
		} else if (result == 1) {
			System.out.println("\n Length of line AB is greater than line CD");
		}

		
	}
	
}