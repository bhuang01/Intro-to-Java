/*
 * Author: Bryan H.
 * Date: 03/15/19
 * Description: A class to print out a time in hour and minute format
 */

public class Time {
	//Fields:
	private int hours;
	private int minutes;
	public String time;
	
	//Constructors:
	public Time() {
		hours = 0;
		minutes = 0;
	}
	public Time(int hours, int minutes) {
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			throw new IllegalArgumentException("Time must be in a valid time range!");
		}
		this.hours = hours;
		this.minutes = minutes;
		
		time = hours + ":" + minutes;
	}
	
	//Methods:
	public String toString() {
		String strHour = hours + "";
		String strMinute = minutes + "";
		
		if (hours < 10) strHour = "0" + strHour;
		if (minutes < 10) strHour = "0" + strHour;
		
		time = strHour + ":" + strMinute;
		
		return time;
	}
}
