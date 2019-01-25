
/*
	This is the ConditionTester template. Use this class to test simple boolean methods!

	Coded by: Bryan H.
	Date: 12/03/18
*/

import java.util.Scanner;

public class ConditionTester {
	public static void main(String[] args) {
		Scanner kboard = new Scanner(System.in);

		// Copy-Paste more of these lines if more input is necessary
//		System.out.print("Enter the first number --> ");
//		int num1 = kboard.nextInt();
//
//		System.out.print("Enter the second number --> ");
//		int num2 = kboard.nextInt();

		// Change this code so that it calls your testing method.
		ConditionTester tester = new ConditionTester();
		int choice = tester.menu();
		
//		boolean resultOfExample = tester.exampleTestMethod(num1, num2);
//		boolean resultOfRect = tester.isPointInRect(x, y);
//		boolean resultOfYear = tester.isLeapYear(year);

		// Printing out the result of the test!
		//System.out.println("The result of the test: " + resultOfYear);
		
		
		 switch (choice) {
	        case 1:
	        	System.out.println("**EXAMPLE**");
	            System.out.println("Enter Two Numbers:");
	            int a = kboard.nextInt();
	            int b = kboard.nextInt();
	            boolean result1 = tester.exampleTestMethod(a, b);
	            
	            if (result1) System.out.println(a + " is less than " + b);
	            else System.out.println(a + " is greater than " + b);
	            
	            //System.out.println("result1");
	            break;
	        case 2:
	        	System.out.println("**POINT~RECT**");
	        	System.out.println("Enter The X and Y Points:");
	            int x = kboard.nextInt();
	            int y = kboard.nextInt();
	            boolean result2 = tester.isPointInRect(x, y);
	            
	            if (result2) System.out.println("The point " + x + "," + y + " is in the rectangle!");
	            else System.out.println("The point " + x + "," + y + " is not in the rectangle...");
	            
	            //System.out.println(result2);
	            break;
	        case 3:
	        	System.out.println("**LEAP YEAR**");
	        	System.out.println("Enter The Year:");
	            int year = kboard.nextInt();
	            boolean result3 = tester.isLeapYear(year);
	            
	            if (result3) System.out.println(year + " is a leap year!");
	            else System.out.println(year + " is not a leap year...");
	            
	            //System.out.println(result3);
	            break;
	        case 4:
	        	System.out.println("**HAS TWO ZEROES**");
	        	System.out.println("Enter the number:");
	        	int number = kboard.nextInt();
	        	boolean result4 = tester.hasTwoZeroes(number);
	        	
	        	if (result4) System.out.println("The number " + number + " has exactly two zeroes!");
	        	else System.out.println("The number " + number + " doesn't have exactly two zeroes...");
	        	
	        	break;
	        case 5:
	        	System.out.println("**IS LATER DATE**");
	        	System.out.println("Enter the first month:");
	        	int month1 = kboard.nextInt();
	        	System.out.println("Enter the first day:");
	        	int day1 = kboard.nextInt();
	        	System.out.println("Enter the first year:");
	        	int year1 = kboard.nextInt();
	        	System.out.println("Enter the second month:");
	        	int month2 = kboard.nextInt();
	        	System.out.println("Enter the second day:");
	        	int day2 = kboard.nextInt();
	        	System.out.println("Enter the second year:");
	        	int year2 = kboard.nextInt();
	        	
	        	boolean result5 = tester.isLaterDate(month1, day1, year1, month2, day2, year2);
	        	
	        	if (result5) System.out.println("The year " + month1 + "/" + day1 + "/" + year1 + " comes after the year " + month2 + "/" + day2 + "/" + year2);
	        	else System.out.println("The year " + month1 + "/" + day1 + "/" + year1 + " does not come after the year " + month2 + "/" + day2 + "/" + year2);
	        	break;
	        default:
	        	System.out.println("Input 1, 2, or 3");
	            // The user input an unexpected choice.
	    }

	}

	// This method tests the parameters in some way, then returns the result of the
	// test
	public boolean exampleTestMethod(int x, int y) {

		boolean result = false;

		// Complete your if statement (or series of if statements) here
		// if ...

		if (x<y) result = true;

		return result;
	}

	private boolean isPointInRect(int x, int y) {
		if (x > 0 && x < 0 + 100 && y > 0 && y < 0 + 100) {
			return true;
		} else {
			return false;
		}
	}

	private boolean isLeapYear(int year) {
		if (year % 4 == 0) {
			if (year % 400 == 0) return false;
			else return true;
		} else {
			return false;
		}
	}
	
	private boolean hasTwoZeroes(double number) {
		boolean hasZeroes;
		if (number % 100 == 0) {
			number = number / 100;
			if (number % 10 != 0) {
				hasZeroes = true;
			}
			else hasZeroes = false;
		}
		else hasZeroes = false;
		
		return hasZeroes;
	}
	 public boolean isLaterDate(int month1, int day1, int year1, int month2, int day2, int year2) {
		  boolean result = false;
		  if (year1 == year2) {
			  if (month1 == month2) {
				  if (day1 == day2) {
					  result = false;
				  }
				  else if (day1 > day2) {
					  result = true;
				  }
				  else if (day1 < day2) {
					  result = false;
				  }
			  }
			  else if (month1 > month2) {
				  result = true;
			  }
			  else if (month1 < month2) {
				  result = false;
			  }
		  }
		  else if (year1 > year2) {
			  result = true;
		  }
		  else if (year1 < year2) {
			  result = false;
		  }
		  return result;
	}

	
	public static int menu() {

//	    int selection;
	    Scanner input = new Scanner(System.in);

	    /***************************************************/

	    System.out.println("Choose from these choices");
	    System.out.println("*************************");
	    System.out.println("(1) - Check which number is larger");
	    System.out.println("(2) - Check if point is in rectangle");
	    System.out.println("(3) - Check if year is a leap year");
	    System.out.println("(4) - Check if a number has exactly two zeroes");
	    System.out.println("(5) - Check if a date is later than another date");

	    int selection = input.nextInt();    
	    return selection;
	}

}
