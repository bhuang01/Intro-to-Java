/*
 * Author: 		Bryan H.
 * Date: 		03/15/19
 * Description: A class to print out a time in hour and minute format
 * 				Also includes other methods that are shortcuts for comparing,
 * 				finding elapsed time, etc.
 */

public class Time {
	
	//Fields:
	private int hours;
	private int minutes;
	public String time;
	
	//Constructors:
	public Time() {
		this.hours = 0;
		this.minutes = 0;
	}
	public Time(int hours, int minutes) {
		if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
			//throw new IllegalArgumentException("Time must be in a valid time range!");
			System.out.println("Time must be in a valid time range!");
		}
		this.hours = hours;
		this.minutes = minutes;
		
		time = hours + ":" + minutes;
	}
	
	//Methods:
	
	//Converts a time to a string format in (HH:MM) format
	public String toString() {
//		String strHour = hours + "";
//		String strMinute = minutes + "";
//		
//		if (hours < 10) strHour = "0" + strHour;
//		if (minutes < 10) strHour = "0" + strHour;
//		
//		time = strHour + ":" + strMinute;
//		
//		return time;
		
		String minSpace = "" + minutes;
		String strHours = "" + hours;
		
		//System.out.println(minSpace);
		
		if(minSpace.length() == 1) {
			minSpace = "0" + minSpace;
		}
		
		if(strHours.length() == 1) {
			strHours = "0" + strHours;
		}
		
		//System.out.println(minSpace);
		
		return strHours + ":" + minSpace;
	}
	
	//Converts a certain time in hours:minutes format to minutes after 00:00
	private int toMins() {
		int mins = 0;
		mins += hours * 60;
		mins += minutes;
		
		return mins;
	}

	//Compares times to see if one is later, earlier, or the same
	/*
	 * @param: 		A time to compare to
	 * @return: 	-1 if time is earlier than Time t
	 * 				0 if time is equal to t
	 * 				1 if time is later than t
	 * 				2 if error
	 */
	public int compareTo(Time t) {
		int compareNum = 2;
		
		//Compares times by checking both hours and minutes, separately
		if (t.hours == hours && t.minutes == minutes) compareNum = 0;
		else if (t.hours < hours || (t.hours == hours && t.minutes < hours)) compareNum = 1;
		else if (t.hours > hours || (t.hours == hours && t.minutes > hours)) compareNum = -1;
		
		//Compares times by using the toMins method
		if (this.toMins() == t.toMins()) compareNum = 0;
		else if (t.toMins() < this.toMins()) compareNum = 1;
		else if (t.toMins() > this.toMins()) compareNum = -1;
			
		return compareNum;
	}
	
	//Returns the elapsed number of minutes since a certain Time t
	/*
	 * @param: 		Time t, origin time
	 * @return: 	Number of minutes after Time t
	 * 				If t is greater than time, then t will be assumed to be
	 * 				from the previous day
	 */
	public int elapsedSince(Time t) {
		int elapsedMins = 0;
		int tMins = t.toMins();
		int timeMins = this.toMins();
		int minInDay = 24*60;
		
		if (t.toMins() > this.toMins()) {
			elapsedMins += minInDay - tMins;
			elapsedMins += timeMins;
		}
		else if (t.toMins() < this.toMins()) {
			elapsedMins += timeMins - tMins;
		}
		else if (t.toMins() == this.toMins()) elapsedMins = 0;
		
		return elapsedMins;
	}
}
