package chapter4;

import java.util.Scanner;

public class GPS {

	public static void main(String[] args) {
		
		heading();

		double area = getArea();
		
		System.out.println("The area of the triangle between the three cities is: "  + area);

		}
	
		public static double getArea() {
			
			Scanner input = new Scanner(System.in);

			double radius = Math.toRadians(6371.01);
			
			System.out.print("Enter the X coordinate of your first city: ");
			double x1 = input.nextDouble();
			
			System.out.print("Enter the Y coordinate of your first city: ");
			double y1 = input.nextDouble();
			
			System.out.print("Enter the X coordinate of your second city: ");
			double x2 = input.nextDouble();
			
			System.out.print("Enter the Y coordinate of your second city: ");
			double y2 = input.nextDouble();
			
			System.out.print("Enter the X coordinate of your third city: ");
			double x3 = input.nextDouble();
			
			System.out.print("Enter the Y coordinate of your third city: ");
			double y3 = input.nextDouble();
				
			System.out.println();
					
			double distance1 = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
			double distance2 = radius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) * Math.cos(x3) * Math.cos(y2 - y3));
			double distance3 = radius * Math.acos(Math.sin(x1) * Math.sin(x3) + Math.cos(x1) * Math.cos(x3) * Math.cos(y1 - y3));
			
			System.out.println("Distance 1: " + distance1);
			System.out.println("Distance 2: " + distance2);
			System.out.println("Distance 3: " + distance3);
			
			System.out.println();
			
			double perim = (distance1 + distance2 + distance3)/2;
			
			double area = Math.sqrt(perim * (perim - distance1) * (perim - distance2) * (perim - distance3));
			
			return area;
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|       Heading MK2       |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
	    /*
	     * This is the input/output for the places of Area 51, Pyongyang North Korea, and Tokyo Japan
	     * 
	     * Enter the X coordinate of your first city: 35.6762
	     * Enter the Y coordinate of your first city: 139.6503
	     * Enter the X coordinate of your second city: 39.0392
	     * Enter the Y coordinate of your second city: 125.7625
	     * Enter the X coordinate of your third city: 37.2343
	     * Enter the Y coordinate of your third city: -115.8067
	     * 
	     * Distance 1: 299.26595528658436
	     * Distance 2: 250.38250059853655
	     * Distance 3: 100.5666179060587
	     * 
	     * The area of the triangle between the three cities is: 11872.819885246601
	     */
	    
}
