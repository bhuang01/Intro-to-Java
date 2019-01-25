/**
 * @(#)DogYears.java
 *

  For testing purposes:
  Dog age of 1 = Human age 13
  Dog age of 2 = Human age 18
  Dog age of 5 = Human age 34
  Dog age of 8 = Human age 50
  Dog age of 12 = Human age 72
  1
  2
  5
  8
  12

 *
 * @author bhuang956: Bryan Huang
 * Date: 11/7/18
 * Description: Enter a dog age and you will get the equivalent in human age
 * @version 2.0
 * Version Notes: Added a function that can convert celsius to fahrenheit and back
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class DogYears {

	//Converts dog years to human years
    public int convertToHumanYears(int dog) {
    	double human = 0;
    	double ratioDog = 16.0/3; //After one dog year, every three dog years is 16 human years
    	if (dog == 1) human = 13; //These situations are specific
    	if (dog == 0) human = 0;  //These situations are specific
    	else if (dog > 1) {
    		human += 13;
    		dog--;
    		double otherYears = (double)dog * ratioDog;
    		human += otherYears;
    		human = Math.round(human); // Rounds years to integer
    	}
    	return (int)human;
    }
    
    //Converts human years to dog years
    public static int convertToDogYears(int human) {
    	double dog = 0;
    	double ratioHuman = 3.0/16; //After one dog year, every three dog years is 16 human years
    	if (human == 13) dog = 1;
    	if (human == 0) dog = 0;
    	else if (human > 13) {
    		dog += 1;
    		human -= 13;
    		double otherYears = (double)human * ratioHuman;
    		dog += otherYears;
    		dog = Math.round(dog); // Rounds answer
    	}
    	return (int)dog;
    }

	public static void main (String[] args) {
		Scanner keyboard = new Scanner(System.in);
		// TAKE IN USER INPUT
		System.out.println("Enter a dog age:");
		int dogAge = keyboard.nextInt();

		DogYears dogConverter = new DogYears();
		int human = dogConverter.convertToHumanYears(dogAge);
		
		//Print out the result
		System.out.println("Human Years: " + human);
		
		System.out.println("Enter a human age: ");
		int humanAge = keyboard.nextInt();
		
		DogYears humanConverter = new DogYears();
		int dog = humanConverter.convertToDogYears(humanAge);

		// PRINT OUT THE RESULT
		System.out.println("Dog Years: " + dog);
	}
		
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		//CONVERTS TEMPERATURE IN CELSIUS TO FAHRENHEIT
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
//		// TAKE IN USER INPUT
//		System.out.println("Temperature in Celsius:");
//		int celsius = keyboard.nextInt();
//
//		DogYears celConverter = new DogYears();
//		int fahConverted = celConverter.convertToFahrenheit(celsius);
//				
//		//Print out the result
//		System.out.println("Fahrenheit: " + fahConverted + " degrees");
//		if (fahConverted <= 32) {
//			System.out.println("That is pretty damn cold!");
//		}
//		else if (fahConverted >= 100) {
//			System.out.println("That is pretty damn hot!");
//		}
//				
//		System.out.println("Temperature in Fahrenheit:");
//		int fahrenheit = keyboard.nextInt();
//				
//		DogYears fahConverter = new DogYears();
//		int celConverted = fahConverter.convertToCelsius(fahrenheit);
//
//		// PRINT OUT THE RESULT
//		System.out.println("Celsius: " + celConverted + " degrees");
//		if (celConverted <= 0) {
//			System.out.println("That is pretty damn cold!");
//		}
//		else if (celConverted >= 37) {
//			System.out.println("That is pretty damn hot!");
//		}
//	}
	
	public static int convertToFahrenheit(int celsius) {
    	int fahrenheit = 0;
    	fahrenheit = (int)(Math.round(((double)(celsius*9)/5) + 32));
    	
    	return fahrenheit;
    }
	
	public static int convertToCelsius(int fahrenheit) {
    	int celsius = 0;
    	celsius = (int)(Math.round(((fahrenheit-32)*5)/9));
    	
    	return celsius;
    }

}