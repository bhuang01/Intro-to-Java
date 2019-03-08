
/*

 Author: Ed Taylor
 Date:   02/28/2018
 
 Final tester for String Tool Box Lab

*/

public class StoolBoxFinalGradeTester {
	
	
	private static int testCount = 0;
    private static int failCount = 0;
    private static int testFailCount = 0;
    private static double percentPass = 0;
    private static int totalPoints = 10;
    private static int ecPoints = 0;
    private static double earnedPoints = 0;
	

	public static void main(String[] args) {
		    
		StringToolBox stringTool = new StringToolBox();
	    // Test 1

		System.out.println("***Testing: boolean endsWithStar(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("true = " + stringTool.endsWithStar("abcd*"));
		if (stringTool.endsWithStar("abcd*") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		System.out.println("false = " + stringTool.endsWithStar(""));
		if (stringTool.endsWithStar("") != false) {
			System.out.println("FAIL");
			failCount ++;
		}
		else 
			System.out.println("PASS");
					
		bumpTestFailCount(failCount);
		resetFailCount();
		
		// Test 2
		System.out.println("***Testing: boolean endsWithTwoStars(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("true = " + stringTool.endsWithTwoStars("abcd**"));
		if (stringTool.endsWithTwoStars("abcd**") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("false = " + stringTool.endsWithTwoStars("*"));
		if (stringTool.endsWithTwoStars("*") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		
		System.out.println("false = " + stringTool.endsWithTwoStars(""));
		if (stringTool.endsWithTwoStars("") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
        // Test 3
		System.out.println("***Testing: String removeDashes(String str)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("123456789 = " + stringTool.removeDashes("123-45-6789"));
		
		if (!stringTool.removeDashes("123-45-6789").equals("123456789")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
       // Test 4
		System.out.println("***Testing: String dateStr(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("10-02-2011 = " + stringTool.dateStr("02/10/2011"));
		
		if (!stringTool.dateStr("02/10/2011").equals("10-02-2011")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();

		try {
			// This test not included in final score
			System.out.println("***Testing: ADVANCED CREDIT CONSIDERATION String dateStr(String s)***");
			
			System.out.println("10-02-2010 = " + stringTool.dateStr("2/10/2010"));
			if (!stringTool.dateStr("2/10/2010").equals("10-02-2010")) {
				System.out.println("FAIL");
				failCount ++;
			} 
			else 
				System.out.println("PASS");
			
			
			System.out.println("02-10-2010 = " + stringTool.dateStr("10/2/2010"));
			if (!stringTool.dateStr("10/2/2010").equals("02-10-2010")) {
				System.out.println("FAIL");
				failCount ++;
			} 
			else 
				System.out.println("PASS");
			
			
			
			System.out.println("02-01-2010 = " + stringTool.dateStr("1/2/2010"));
			if (!stringTool.dateStr("1/2/2010").equals("02-01-2010")) {
				System.out.println("FAIL");
				failCount ++;
			} 
			else 
				System.out.println("PASS");
			
			
		} catch (Exception e) { System.out.println("No dateStr EC"); }
		
		if (failCount == 0)
			ecPoints ++;
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		// Test 5

		System.out.println("***Testing: String last4(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("3456 = " + stringTool.last4("1234 5678 9012 3456"));
		if (!stringTool.last4("1234 5678 9012 3456").equals("3456")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		// Test 6

		System.out.println("***Testing: String last5(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("23456 = " + stringTool.last5("1234 5678 9012 3456"));
		if (!stringTool.last5("1234 5678 9012 3456").equals("23456")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		//Test 7

		System.out.println("***Testing: String scroll(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("23451 = " + stringTool.scroll("12345"));
		if (!stringTool.scroll("12345").equals("23451")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
        //Test 8
		System.out.println("***Testing: String convertName(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("Albert Einstein = " + stringTool.convertName("Einstein, Albert"));
		if (!stringTool.convertName("Einstein, Albert").equals("Albert Einstein")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
        //Test 9
		System.out.println("***Testing: String negativeBits(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("0101 = " + stringTool.negativeBits("1010"));
		if (!stringTool.negativeBits("1010").equals("0101")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("1111 0000 = " + stringTool.negativeBits("0000 1111"));
		if (!stringTool.negativeBits("0000 1111").equals("1111 0000")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();

		//Test 10
		System.out.println("***Testing: boolean containsSameChar(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("false = " + stringTool.containsSameChar("1010"));
		if (stringTool.containsSameChar("1010") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("true = " + stringTool.containsSameChar("1111111"));
		if (stringTool.containsSameChar("1111111") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		
        //Test 11
		System.out.println("***Testing: String removeComments(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("The hippo is native to Western Africa. = " + stringTool.removeComments("The hippo is native to Western Africa."));
		if (!stringTool.removeComments("The hippo is native to Western Africa.").equals("The hippo is native to Western Africa.")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		System.out.println("The pygmy hippo is native to Western Africa. = " + stringTool.removeComments("The pygmy hippo is /*a reclusive and nocturnal animal */native to Western Africa."));
		if (!stringTool.removeComments("The pygmy hippo is /*a reclusive and nocturnal animal */native to Western Africa.").equals("The pygmy hippo is native to Western Africa.")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		System.out.println("The hippo is native to Western Africa. = " + stringTool.removeComments("The /*pygmy */hippo is /*a reclusive and nocturnal animal */native to Western Africa."));
		if (!stringTool.removeComments("The /*pygmy */hippo is /*a reclusive and nocturnal animal */native to Western Africa.").equals("The hippo is native to Western Africa.")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		System.out.println("The hippo is native to Western Africa. = " + stringTool.removeComments("The /*pygmy */hippo is/* a reclusive*/ /*and *//*nocturnal animal */native to Western Africa."));
		if (!stringTool.removeComments("The /*pygmy */hippo is/* a reclusive*/ /*and *//*nocturnal animal */native to Western Africa.").equals("The hippo is native to Western Africa.")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		
		// Test 12
		System.out.println("***Testing: String caesar(String s, int n)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("lttlqj ltllqjx ljjp lqfxxjx = " + stringTool.caesarCipher("google goggles geek glasses",5));
		if (!stringTool.caesarCipher("google goggles geek glasses",5).equals("lttlqj ltllqjx ljjp lqfxxjx")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		System.out.println("Lttlqj ltllqjx ljjpd lqfxxjx = " + stringTool.caesarCipher("Google goggles geeky glasses",5));
		if (!stringTool.caesarCipher("Google goggles geeky glasses",5).equals("Lttlqj ltllqjx ljjpd lqfxxjx")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("Gur cltzl uvccb vf n erpyhfvir naq abpgheany navzny angvir gb Jrfgrea Nsevpn. = " + stringTool.caesarCipher("The pygmy hippo is a reclusive and nocturnal animal native to Western Africa.",13));
		if (!stringTool.caesarCipher("The pygmy hippo is a reclusive and nocturnal animal native to Western Africa.",13).equals("Gur cltzl uvccb vf n erpyhfvir naq abpgheany navzny angvir gb Jrfgrea Nsevpn.")) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		// Test 13
		System.out.println("***Testing: boolean isPalindrome(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("true = " + stringTool.isPalindrome("racecar"));
		if (stringTool.isPalindrome("racecar") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("false = " + stringTool.isPalindrome("bananas"));
		if (stringTool.isPalindrome("bananas") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("true = " + stringTool.isPalindrome("\"Madam, I’m Adam?\""));
		if (stringTool.isPalindrome("\"Madam, I’m Adam?\"") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("false = " + stringTool.isPalindrome("Madam, I am Adam."));
		if (stringTool.isPalindrome("Madam, I am Adam.") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("true = " + stringTool.isPalindrome("Are we not pure? \"No sir!\" Panama's moody Noriega brags. \"It is garbage!\" Irony dooms a man; a prisoner up to new era."));
		if (stringTool.isPalindrome("Are we not pure? \"No sir!\" Panama's moody Noriega brags. \"It is garbage!\" Irony dooms a man; a prisoner up to new era.") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		
		// Test 14
		System.out.println("***Testing: boolean validPassword(String s)***");
		testCount ++;
		System.out.println("Test Count:   " + testCount);
		
		System.out.println("false = " + stringTool.validPassword("Snowflake"));
		if (stringTool.validPassword("Snowflake") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("false = " + stringTool.validPassword("SNOWFLAKE47"));
		if (stringTool.validPassword("SNOWFLAKE47") != false) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("true = " + stringTool.validPassword("snowFlake47"));
		if (stringTool.validPassword("snowFlake47") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		
		System.out.println("true = " + stringTool.validPassword("snow!Flake?47"));
		if (stringTool.validPassword("snow!Flake?47") != true) {
			System.out.println("FAIL");
			failCount ++;
		} 
		else 
			System.out.println("PASS");
		
		bumpTestFailCount(failCount);
		resetFailCount();
		printTestSummary();

	}
	
	private static void  resetFailCount(){
		failCount = 0;
	}
	
	private static void bumpTestFailCount(int failCount) {
		
		if (failCount > 0)
			testFailCount ++;
	}
	
	private static void printTestSummary() {
		System.out.println("****** TEST SUMMARY *****");
		System.out.println("Test Count:   " + testCount);
		System.out.println("Fail Count:   " + testFailCount);
		
		percentPass = ((double) (testCount - testFailCount) / testCount) * 100;
		System.out.println("Percent Pass: " + Math.round(percentPass));
		System.out.println("Total Points: " + totalPoints);
		System.out.println("EC points:    " + ecPoints);
		
		earnedPoints = (totalPoints + ecPoints) * percentPass / 100;
		System.out.println("Earned Points:" + Math.round(earnedPoints));
		
			
	}


}
