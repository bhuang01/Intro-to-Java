/*
 * Author: Bryan H.
 * Date: 03/15/19
 * Description: A class used to test the time class
 */

public class TimeTest {
	
	public static void main(String[] argv) {
		Time t1 = new Time();
		Time t2 = new Time(13,5);
		Time t3 = new Time(24,0);
		Time t4 = new Time(-1,30);
		
		System.out.println(t1 + " " + t2 + " " + t3 + " " + t4);
		
		//System.out.println(t3.toMins()); //Testing the toMins() public method
		
		//System.out.println(t1.elapsedSince(t2)); //Testing the elapsedTime method
	
		
	}
}
