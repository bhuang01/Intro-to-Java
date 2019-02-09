/*
 * Author: Bryan H.
 * Date: 2/6/19
 * Description: This program plays around with the String class and some of its methods.
 * Version: 1.0
 * Version Notes: N/A
 */

import java.util.Scanner;

public class StringToolBox {
	
	Scanner scan = new Scanner(System.in);
	
	public String nameEcho(String s) {
		int index = 0;
		
		String firstName="";
		String lastName = "";
		
		index = s.indexOf(" ");
		
		firstName = s.substring(0, index);
		lastName = s.substring(index);
		
		firstName.toUpperCase();
		lastName = lastName.toUpperCase();
		
		return firstName + lastName;
	}
	
	public boolean endsWithStar(String s) {
		boolean endsWithStar = false;
		//int beginIndex = s.length() - 1;
		String star = "*";
		//String lastChar = s.substring(beginIndex);
		
		if (s.endsWith(star)) {
			endsWithStar = true;
		}
		
		return endsWithStar;
	}

	public boolean endsWithTwoStars(String s) {		
		if (s.endsWith("**")) return true;
		
		return false;
	}

	public String last4(String s) {
		String lastFour = "";
		int index = s.length() - 4;
		lastFour = s.substring(index);
		lastFour = lastFour.replace("", " ").trim();
		return lastFour;
	}

	public String last5(String s) {
		String lastFive = "";
		int index = s.length() - 6;
		lastFive = s.substring(index);
		lastFive = lastFive.replaceAll(" ","");
		
		lastFive = lastFive.replace("", " ").trim();
		return lastFive;
	}

	public String scroll(String s) {
		String firstChar = "";
		String newStr = "";
		firstChar = s.substring(0, 1);
		newStr = s.substring(1) + firstChar;
		return newStr;
	}

	public String convertName(String s) {
		int indexOfFirstName = s.indexOf(",") + 2;
		
		String firstName = s.substring(indexOfFirstName);
		String lastName = s.substring(0, indexOfFirstName - 2);
		
		String newStr = firstName + " " + lastName;
		return newStr;
	}
	
	public String removeDashes(String s) {
		String newStr = s.replaceAll("-", "");
		return newStr;
	}
	
	public String dateStr(String s) {
		String newStr = "";
		String newDay;
		String newMonth;
		
		int indexFirstSlash = s.indexOf("/");
		int indexSecondSlash = s.indexOf("/", indexFirstSlash + 1);
		
		String month = s.substring(0, indexFirstSlash);
		int numMonth = Integer.parseInt(month);
		if (numMonth < 10) {
			newMonth = "0" + numMonth;
		}
		else {
			newMonth = numMonth + "";
		}
		
		String day = s.substring(indexFirstSlash + 1, indexSecondSlash);
		int numDay = Integer.parseInt(day);
		if (numDay < 10) {
			newDay = "0" + numDay;
		}
		else {
			newDay = numDay + "";
		}
		
		String year = s.substring(indexSecondSlash + 1);
		
		newStr = newDay + "-" + newMonth + "-" + year;
		
		return newStr;
	}
	
	public String negativeBits(String s) {
		String newStr;
		newStr = s.replaceAll(" ", "");
		newStr = s.replaceAll("0", "2").replaceAll("1", "0").replaceAll("2", "1");
		return newStr;
	}
	
	public boolean containsSameChar(String s) {
		boolean containsSameChar = false;
		String firstChar = s.substring(0, 1);
		String newStr = s.replaceAll(firstChar, "");
		if (newStr.length() == 0) containsSameChar = true;
		return containsSameChar;
	}
	
	public String removeComments(String s) {
		int indexBefore = s.indexOf("/*");
		int indexAfter = s.indexOf("*/");
		String before = s.substring(0, indexBefore);
		String after = s.substring(indexAfter + 2, s.length());
		return before + after;
	}
	
	public String caesar(String s) {
		int cipherNum = scan.nextInt();
		if (cipherNum >= 25) cipherNum -= 25;
		String newStr = "";
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		for (int i = 0; i < s.length() - 1; i++) {
			int indexReplace = i + cipherNum;
			if (indexReplace > 25) {
				indexReplace -= 25;
			}
			newStr = s.replace(s.charAt(i), s.charAt(indexReplace));
		}
		return newStr;
	}
}