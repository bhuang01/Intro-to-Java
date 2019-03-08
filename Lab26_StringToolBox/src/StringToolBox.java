/*
 * Author: Bryan H.
 * Date: 2/6/19
 * Description: This program plays around with the String class and some of its methods.
 * Version: 2.0
 * Version Notes: Experimentation is the correct password method that checks if the given password is correct
 * Extra Experimentation: Added a password strength feature to the valid password method
 */

import java.util.Scanner;

public class StringToolBox {

	/**
	 * Returns a name with the last name in all caps.
	 * 
	 * @param input - The name
	 * @return Bob jones would retrun Bob JONES
	 */
	public String nameEcho(String input) {
		int spaceIndex = 0;
		String firstName = "";
		String lastName = "";

		spaceIndex = input.indexOf(" ");
		firstName = input.substring(0, spaceIndex);
		lastName = input.substring(spaceIndex);
		lastName = lastName.toUpperCase();

		return firstName + lastName;
	}

	/*
	 * Checks if string ends with a star
	 */
	public static boolean endsWithStar(String input) {
		if (input.endsWith("*")) {
			return true;
		}

		return false;
	}

	/**
	 * Checks if a string ends with two stars
	 */
	public static boolean endsWithTwoStars(String input) {
		if (input.endsWith("**")) {
			return true;
		}

		return false;
	}

	/**
	 * Returns the last 4 characters of a string.
	 */
	public static String last4(String input) {
		return input.substring(input.length() - 4, input.length());
	}

	/**
	 * Returns the last 5 characters of a string.
	 */
	public static String last5(String input) {
		input = input.replaceAll(" ", "");
		return input.substring(input.length() - 5, input.length());
	}

	/**
	 * Makes a string have a scrolling effect by moving the first character to the
	 * end.
	 */
	public static String scroll(String input) {
		return input.substring(1, input.length()) + input.substring(0, 1);
	}

	/**
	 * Makes a name Last, First instead of First Last.
	 */
	public static String convertName(String input) {
		int commaIndex = input.indexOf(",");
		return input.substring(commaIndex + 2, input.length()) + " " + input.substring(0, commaIndex);
	}

	/**
	 * Removes the dashes from a string.
	 */
	public static String removeDashes(String input) {
		return input.replaceAll("-", "");
	}

	/**
	 * Converts data formats from slashes to dashes.
	 */
	public static String dateStr(String input) {
		int firstSlash = input.indexOf("/");
		int lastSlash = input.lastIndexOf("/");
		String months = input.substring(0, firstSlash);
		String days = input.substring(firstSlash + 1, lastSlash);
		String years = input.substring(lastSlash + 1, input.length());
		
		if(Integer.parseInt(months) < 10 && months.length() == 1) {
			months = "0" + months;
		}
		
		if(Integer.parseInt(days) < 10 && days.length() == 1) {
			days = "0" + days;
		}
		
		return days + "-" + months + "-" + years;
	}

	/**
	 * Makes bits negative (0 to 1 and 1 to 0)
	 */
	public static String negativeBits(String input) {
		input = input.trim();
		input = input.replaceAll("1", "a");
		input = input.replaceAll("0", "b");
		input = input.replaceAll("a", "0");
		return input.replaceAll("b", "1");
	}

	/**
	 * If a string contains all of the same characters.
	 */
	public static boolean containsSameChar(String input) {
		if (input.replaceAll("" + input.charAt(0), "").length() == 0) {
			return true;
		}

		return false;
	}

	/**
	 * Removes the /* comments from a string.
	 */
	public static String removeComments(String input) {

		String buffer = input;

		// While comments still exist in out string
		while (buffer.contains("/*")) {
			int startComment = buffer.indexOf("/*");
			int endComment = buffer.indexOf("*/");

			// If there are no comments to begin with
			if (startComment == 0) {
				return input;
			}

			String before = buffer.substring(0, startComment);
			String after = buffer.substring(endComment + 2, buffer.length());
			buffer = before + after;
		}

		return buffer;
	}
	
	/**
	 * Does the caesar cipher to a string.
	 */
	public static String caesarCipher(String input, int cipher) {
		String result = "";
		for (int i = 0; i < input.length(); i++) {
			if (Character.isLetter(input.charAt(i))) {
				char c = (char) (input.charAt(i) + cipher);
				if (Character.isUpperCase(input.charAt(i))) {
					if (c > 'Z') {
						result += (char) (input.charAt(i) - (26 - cipher));
					} else {
						result += (char) (input.charAt(i) + cipher);
					}
				} else {
					if (c > 'z') {
						result += (char) (input.charAt(i) - (26 - cipher));
					} else {
						result += (char) (input.charAt(i) + cipher);
					}
				}
			} else {
				result += input.charAt(i);
			}
		}
		return result;
	}

	/**
	 * Tests if a word in reverse is the same as the word normally.
	 */
	public static boolean isPalindrome(String word) {
		// Format the string (just lower case letters)
		word = word.toLowerCase();

		String parsed = "";
		for (Character c : word.toCharArray()) {
			if (Character.isLetter(c)) {
				parsed += c;
			}
		}

		word = parsed;

		// Reverse the string
		String reversed = new StringBuffer(word).reverse().toString();

		if (reversed.equals(word)) {
			return true;
		}

		return false;
	}

	/*
	 * Checks if a given password is up to standard and valid
	 */
	public static boolean validPassword(String password) {
		if (password.contains(" ") || password.length() < 7) {
			return false;
		}

		boolean containsUpper = false;
		boolean containsLower = false;
		boolean containsNumber = false;
		char[] passArray = password.toCharArray();
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(passArray[i])) {
				containsUpper = true;
			}

			if (Character.isLowerCase(passArray[i])) {
				containsLower = true;
			}

			if (Character.isDigit(passArray[i])) {
				containsNumber = true;
			}
		}

		if (containsUpper && containsLower && containsNumber) {
			return true;
		}
		
		/*
		 * ------------------------------------------------------
		 * CHECKS PASSWORD STRENGTH (EXPERIMENTATION)
		 * ------------------------------------------------------
		 */
		
		int passStrengthNum = 0;
		int TOTALPASSSTRENGTH = 50;
		if (password.length() > 10) passStrengthNum += 10;
		if (containsUpper) passStrengthNum += 10;
		if (containsLower) passStrengthNum += 10;
		if (containsNumber) passStrengthNum += 10;
		
		System.out.println("\n************PASSWORD STRENGTH*************");
		System.out.println("Your password is:");
		if (passStrengthNum == 10) System.out.println("VERY WEAK");
		else if (passStrengthNum == 20) System.out.println("WEAK");
		else if (passStrengthNum == 30) System.out.println("AVERAGE");
		else if (passStrengthNum == 40) System.out.println("STRONG");
		else if (passStrengthNum == 50) System.out.println("VERY STRONG");
		System.out.println("******************************************\n");

		return false;
	}	
	
	//Checks if a password is correct
	public boolean correctPassword(String input) {
		boolean correct = false;
		String password = "thisisthecorrectpass123";
		
		if (input.equals(password))correct = true;
		return correct;
	}
}
