
import java.util.Scanner;

public class StringToolBoxTester {
	/*
	 * 
	 * This class tests all methods of the StringToolBox class.
	 * 
	 * To use this, comment out all methods that you haven't finished yet. Then run
	 * - you should see the output on the left and right of all lines match!
	 * 
	 * 
	 */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		StringToolBox stringTool = new StringToolBox();

		System.out.println("***Testing: String nameEcho(String s)***");
		System.out.println("Fred JONES = " + stringTool.nameEcho("Fred jones"));

		System.out.println("***Testing: boolean endsWithStar(String s)***");
		System.out.println("true = " + stringTool.endsWithStar("abcd*"));
		System.out.println("false = " + stringTool.endsWithStar(""));

		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		System.out.println("true = " + stringTool.endsWithTwoStars("abcd**"));
		System.out.println("false = " + stringTool.endsWithTwoStars("*"));
		System.out.println("false = " + stringTool.endsWithTwoStars(""));

		System.out.println("***Testing: String last4(String s)***");
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));

		System.out.println("***Testing: String last5(String s)***");
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));

		System.out.println("***Testing: String scroll(String s)***");
		System.out.println("23451 = " + stringTool.scroll("12345"));

		System.out.println("***Testing: String convertName(String s)***");
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		
		System.out.println("***Testing: String removeDashes(String s)***");
		System.out.println("99-2-36--13316-316-6 = " + stringTool.removeDashes("99-2-39--13316-316-6"));

		System.out.println("***Testing: String dateStr(String s)***");
		System.out.println("05/31/2019 = " + stringTool.dateStr("05/31/2019"));
		
		System.out.println("***Testing: String dateStr(String s)***");
		System.out.println("011110000111 = " + stringTool.negativeBits("011110000111"));
		
		System.out.println("***Testing: String containsSameChar(String s)***");
		System.out.println("ccccdcccc = " + stringTool.containsSameChar("cccdccccc"));
		
		System.out.println("***Testing: String removeComments(String s)***");
		System.out.println("Hello, this is a string with embedded comments = " + stringTool.removeComments("Hello, this is a /*input */string with embedded comments"));
		
		System.out.println("***Testing: String caesar(String s)***");
		System.out.println("abcdefghijklmnopqrstuvwxyz = " + stringTool.caesarCipher("abcdefghijklmnopqrstuvwxyz", 5));
		
		System.out.println("***Testing: boolean isPalindrom(String s)***");
		System.out.println("false = " + stringTool.isPalindrome("burger"));
		System.out.println("true = " + stringTool.isPalindrome("racecar"));

		System.out.println("***Testing: boolean validPassword(String password)***");
		System.out.println("true = " + stringTool.validPassword("snowFlake47"));
		System.out.println("false = " + stringTool.validPassword("SNOWFLAKE47"));	
		
		System.out.println("***Testing: boolean correctPassword(String password)***");
		System.out.println("true = " + stringTool.correctPassword("thisisthecorrectpass123"));
		System.out.println("false = " + stringTool.correctPassword("incorrect321"));	
	}

}
