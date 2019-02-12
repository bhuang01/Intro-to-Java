/*
 * Author: Bryan H.
 * Date: 12/20/18
 * Description: A program that helps cashiers organize their orders and let customers order food
 */
 
import java.util.Scanner;
import java.text.NumberFormat;

public class GPACalculator {
	
	public static void main(String[] argv) {
		
		Scanner scanner = new Scanner(System.in);
		
		GPACalculator foodPrice = new GPACalculator();
		NumberFormat formatter = NumberFormat.getCurrencyInstance();
		
		foodPrice.menu();
		
		int choice = scanner.nextInt();
		
		double totalPrice = 0;
		
		switch (choice) {
		case 1:
			System.out.println("Cheeseburger");
			System.out.println("$6.99");
			totalPrice += 6.99;
			System.out.println("******************************\n");
			break;
		case 2:
			System.out.println("Hot Dog");
			System.out.println("$3.99");
			totalPrice += 3.99;
			System.out.println("******************************\n");
			break;
		case 3:
			System.out.println("Pizza");
			System.out.println("$4.99");
			totalPrice += 4.99;
			System.out.println("******************************\n");
			break;
		case 4:
			System.out.println("Salad");
			System.out.println("$5.99");
			totalPrice += 5.99;
			System.out.println("******************************\n");
			break;
		case 5:
			System.out.println("Drink");
			System.out.println("$0.99");
			totalPrice += 0.99;
			System.out.println("******************************\n");
			break;
		case 6:
			System.out.println("Get bill");
			System.out.println("Your total is: " + totalPrice);
			System.out.println("******************************\n");
			break;
		default:
			// The user input an unexpected choice.
		}
		
		while (choice != 6) {
			foodPrice.menu();
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Cheeseburger");
				System.out.println("$6.99");
				totalPrice += 6.99;
				System.out.println("******************************\n");
				break;
			case 2:
				System.out.println("Hot Dog");
				System.out.println("$3.99");
				totalPrice += 3.99;
				System.out.println("******************************\n");
				break;
			case 3:
				System.out.println("Pizza");
				System.out.println("$4.99");
				totalPrice += 4.99;
				System.out.println("******************************\n");
				break;
			case 4:
				System.out.println("Salad");
				System.out.println("$5.99");
				totalPrice += 5.99;
				System.out.println("******************************\n");
				break;
			case 5:
				System.out.println("Drink");
				System.out.println("$0.99");
				totalPrice += 0.99;
				System.out.println("******************************\n");
				break;
			case 6:
				System.out.println("Get bill");
				System.out.println("~ CA Tax: 8.75% ~");
				
				totalPrice *= 1.0875;
				totalPrice *= 100;
				long beforeRound = Math.round(totalPrice);
				double taxedPrice = beforeRound / 100.0;
				String beforeTip = formatter.format(taxedPrice);
				
				System.out.println("Your total is: " + beforeTip);
				
				System.out.println("How many people are with you today?");
				int numPeople = scanner.nextInt();
				
				double tip = 0;
				tip = taxedPrice * 0.15;
				String finalTip = formatter.format(tip);
				
				if (numPeople >= 6) {
					System.out.println("Would you like to consider a 15% tip? (15% tip = " + finalTip + ")");
					boolean yesTip = scanner.nextBoolean();
				}
				else if (numPeople < 6) System.out.println("No need for tip");
				
				System.out.println("******************************\n");
				break;
			default:
				// The user input an unexpected choice.
			}
		}
	}

	public static void menu() {
		
		System.out.println("What would you like to order?\n");
		System.out.println("(1) - Cheeseburger - $6.99");
		System.out.println("(2) - Hot Dog - $3.99");
		System.out.println("(3) - Pizza - $4.99");
		System.out.println("(4) - Salad - $5.99");
		System.out.println("(5) - Soft Drink - $0.99");
		System.out.println("(6) - Get bill");

		/***************************************************/
	}	
	
}
