/*
 * Author: Bryan Huang
 * Date: 1/11/2019
 * Description: Some practice with loops: While loops
 */

import java.util.Scanner;

public class IntroLoops {


	public static void main(String[] args) {
		
		IntroLoops intro = new IntroLoops();

		Scanner kboard = new Scanner(System.in);
		System.out.println("---MENU---");
		System.out.println("What would you like to see?");
		System.out.println("1) Division");
		System.out.println("2) Print Series");
		System.out.println("3) Repeat Word");
		System.out.println("4) Print Index Line");
		System.out.print("-----> ");
		String menuChoice = kboard.next();

		if (menuChoice.equals("1")) {
			int m = kboard.nextInt();
			int n = kboard.nextInt();
			intro.divide(m, n);
		} else if (menuChoice.equals("2")) {
			int start = kboard.nextInt();
			int end = kboard.nextInt();
			printSeries(start, end);
		} else if (menuChoice.equals("3")) {
			String word = kboard.next();
			repeatWord(word);
		} else if (menuChoice.equals("4")) {
			String word1 = kboard.next();
			String word2 = kboard.next();
			printIndexLine(word1, word2);
		}
	}

	//Divides two numbers m and n
	public void divide(int m, int n) {
		System.out.println("Division to be completed here!");
		int quotient = 0;
		int remainder = 0;
		
		//Loops until m is less than n, which is the remainder
		while (m >= n) {
			m = m - n;
			quotient++;
		}
		System.out.println("Answer: " + quotient);
		System.out.println("Remainder: " + m);
		
	}

	public static void printSeries(int start, int end) {
		System.out.println("Exercise 1 to be completed here!");
	}

	public static void repeatWord(String word) {
		System.out.println("Exercise 2 to be completed here!");
		System.out.println(word);
	}

	public static void printIndexLine(String word1, String word2) {
		System.out.println("Exercise 3 to be completed here!");
	}



}