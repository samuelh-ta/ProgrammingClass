package chapter7;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
	
	public static Scanner input;
	public static DecimalFormat df;
	
		public static void main(String[] args) {
		
		heading();
		
		mainMenu();
		
		}

	    static void heading() {
		
	    	System.out.println("---------------------------");
			System.out.println("|                         |");
			System.out.println("|      Samuel Herman      |");
			System.out.println("|   AP Computer Science   |");
			System.out.println("|        B Period         |");
			System.out.println("|      Sorted Array       |");
			System.out.println("|                         |");
			System.out.println("---------------------------");

	    }
	    
	    public static int[] createArray() {
	    	int[] sortedArray = new int[10000];
	    	
	    	for (int x = 0; x <= sortedArray.length - 1; x ++) {
	    		sortedArray[x] = (int)(Math.random()*((5000 - 1)+ 1)+1);
	    	}
	    	
	    	Arrays.sort(sortedArray);
	    	
	    	return sortedArray;
	    }
	    
	    public static void mainMenu() {
	    	
	    	Scanner input = new Scanner(System.in);
	    	int selection = 0;
	    	int numberWanted = 0;
	    		    	
	    	int[] array = createArray();
	    	
	    	System.out.println("An array has been made use the following menu to get selected values: ");
	    	System.out.println();
	    	System.out.println("1. Find the mean (average)");
	    	System.out.println("2. Find the largest and smallest values");
	    	System.out.println("3. Find the median (average of the 2 middle numbers)");
	    	System.out.println("4. Find the mode");
	    	System.out.println("5. Find a specific number");
	    	System.out.println("6. Print a given section of the list");
	    	System.out.println();
	    	System.out.print("Enter a selection: ");
	    	 
	    	selection = input.nextInt();
	    	
	    	System.out.println();
	    	
	    	double mean = findMean(array);
	    	int[] smallAndLarge = findSmallAndLarge(array);
	    	double median = findMedian(array);
	    	int mode = findMode(array);
	    	
	    	if (selection == 5) {
	    		System.out.println();
		    	System.out.print("Enter a number you want found");
		    	numberWanted = input.nextInt();
		    	System.out.println();
	    	}
	    	int indexOfWanted = findNumber(array,numberWanted);
	    	
	    	int start = 0;
	    	int end = 0;
	    	if(selection == 6) {
	    		System.out.print("Start index: ");
	    		start = input.nextInt();
	    		System.out.print("End index: ");
	    		end = input.nextInt();
	    		System.out.println();
	    	}
	    	int[] selectedPortion = findStartToEnd(array,start,end);
	    	
	    	switch (selection) {
	    	case 1: System.out.println("The average is: " + findMean(array)); break;
	    	
	    	case 2: System.out.println("The smallest value is: " + smallAndLarge[0] + " and the largest value is: " + smallAndLarge[1]); break;
	    	
	    	case 3: System.out.println("The median is: " + median); break;
	    	
	    	case 4: System.out.println("The mode is: " + mode); break;
	    	
	    	case 5: System.out.println("The index of: " + array[indexOfWanted] + " is at the index of: " + indexOfWanted); break;
	    	
	    	case 6: 
	    		for (int x = 0; x < selectedPortion.length;x++) {
	    			System.out.println("Index " + x + ": " +selectedPortion[x]);
	    		}
	    		break;
	    	}
	    }
	    
	    public static double findMean(int[] array) {
	    	
	    	df = new DecimalFormat("###.00");			
	    	double total = 0;
	    	double average = 0.0;
	    	
	    	for (int x = 0; x <= array.length - 1; x ++) {
	    		total += array[x];
	    	}
	    	
	    	average = Double.parseDouble(df.format((total / (array.length - 1))));
	    	
	    	return average;
	    }
	    
	    public static int[] findSmallAndLarge(int[] array) {
	    	int[] smallAndLarge = new int[2];
	    	int smallest = 10000000;
	    	int largest = -10000000;
	    	
	    	for (int x = 0; x <= array.length - 1; x++) {
	    		if (array[x] < smallest) {
	    			smallest = array[x];
	    		}
	    		
	    		if (array[x] > largest) {
	    			largest = array[x];
	    		}
	    	}
	    	
	    	smallAndLarge[0] = smallest;
	    	smallAndLarge[1] = largest;
	    	
	    	return smallAndLarge;
	    }
	    
	    public static double findMedian(int[] array) {
	    	
	    	df = new DecimalFormat("###.00");
			
	    	double median = 0;
	    	
	    	int part1 = array[(int) ((array.length - 1) / 2 - .5)];
	    	int part2 = array[(int) ((array.length - 1) / 2 + .5)];
	    	
	    	median = (part1 + part2) / 2;
	    	
	    	return median;
	    }
	    
	    private static int findMode(int[] array) {
	    	int mostCommonIndex = 0;
	    	int countedSoFar = 1;
	    	int highestCount = 1;
	    	
	    	for (int i = 1; i < array.length; i++) {
	    		
	    		if (array[i - 1] == array[i]) {
	    			countedSoFar++;	    		
	    			if(highestCount < countedSoFar) {
	    			highestCount = countedSoFar;
	    			mostCommonIndex = i;
	    			}else {
	    				countedSoFar = 1;
	    			}
	    		}
	    	}
	    	
	    	
	    	return mostCommonIndex;
	    }
	    
	    private static int findNumber(int[] array, int numberWanted) {
	    
	    	Scanner input = new Scanner(System.in);
	    	int indexOfWanted = 0;
	    		    	
	    	for (int x = 0; x < array.length; x++) {
	    		if (array[x] == numberWanted) {
	    			indexOfWanted = x;
	    			break;
	    		}
	    	}
	    	
	    	return indexOfWanted;
	    }
	    
	    private static int[] findStartToEnd(int[] array, int start, int end) {
	    	int[] outputArray = new int[end - start];
	    	
	    	for (int x = 0; x < end - start; x++) {
	    		outputArray[x] = array[start + x];
	    	}
	    	
	    	return outputArray;
	    }

}
