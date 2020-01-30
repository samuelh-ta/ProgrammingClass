package chapter2;

import java.util.Scanner;

public class CylindricalVolume {
	
public static void main(String[] args) {
	
	heading();
	double radius = inputRadius();
	double length = inputLength();
	output(calcArea(radius,length),calcVolume(calcArea(radius,length),length));
	}

    static void heading() {
	
    	System.out.println("---------------------------");
		System.out.println("|                         |");
		System.out.println("|      Samuel Herman      |");
		System.out.println("|   AP Computer Science   |");
		System.out.println("|        B Period         |");
		System.out.println("|   Cylindrical Volume    |");
		System.out.println("|                         |");
		System.out.println("---------------------------");

    }
    
    static double inputRadius() {
    	
    	Scanner scanobject = new Scanner(System.in);
    	
    	System.out.print("Enter the radius of the cylinder: ");
    	double radius = scanobject.nextDouble();
    	
    	return radius;
    	
    }
    
    static double inputLength() {
    	
    	Scanner scanobject = new Scanner(System.in);
    	
    	System.out.print("Enter the length of the cylinder: ");
    	double length = scanobject.nextDouble();
    	
    	return length;
    }
    
    public static double calcArea(double radius, double length) {
    	
    	double area = radius * length * Math.PI;
    	
    	return area;
    }
    
    public static double calcVolume(double area, double length) {
    	
    	double volume = area * length;
    	
    	return volume;
    }
    
    public static void output(double area, double volume) {
    	
    	System.out.println("The area of the cylinder is: " + area);
    	System.out.println("The volume of the cylinder is: " + volume);
    }

	
}
