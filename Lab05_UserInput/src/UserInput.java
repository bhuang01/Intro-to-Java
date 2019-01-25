
import java.util.Scanner;
public class UserInput 
{
	public static void main(String[] argv) 
	{
		timestwo(); //calls for the method called "timestwo" to be executed in this main method
	}
	public static void timestwo() //creates a method called "timestwo" with return type void
	{
		System.out.println("Enter an integer:");
		Scanner number = new Scanner(System.in); //Initializes the scanner for user input but doesn't call for it yet
		int x = number.nextInt(); //creates a user input section from the method "nextInt"
		System.out.println("Your result is:" + " " + "2 * " + x + " = " + (x +x));
		
	}
}