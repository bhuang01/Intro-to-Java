/*
   This class implements a vendor that sells one kind of items.
   A vendor carries out sales transactions.
*/

/*
 * Author: Bryan H.
 * Date: 03/13/19
 * Description: A couple methods and a constructor for the vending machine to work
 */

public class Vendor {
	// Fields:
	private int numItemsInStock;
	private int itemPrice;
	private int currentDepositCents;
	private int currentChange;
	private static double totalSales;
	private double currentSale;

	// Constructor
	// Parameters:
	// int price of a single item in cents
	// int number of items to place in stock
	// ... Vendor ...
	public Vendor(int itemPrice, int numItemsInStock) {
		this.itemPrice = itemPrice;
		this.numItemsInStock = numItemsInStock;
	}

	// Sets the quantity of items in stock.
	// Parameters:
	// int number of items to place in stock
	// Return:
	// None
	// ...setStock...

	public void setStock(int numItemsInStock) {
		this.numItemsInStock = numItemsInStock;
	}

	// Returns the number of items currently in stock.
	// Parameters:
	// None
	// Return:
	// int number of items currently in stock
	// ...getStock...
	public int getStock() {
		return numItemsInStock;
	}

	// Adds a specified amount (in cents) to the deposited amount.
	// Parameters:
	// int number of cents to add to the deposit
	// Return:
	// None
	// ...addMoney...
	public void addMoney(int numCentsToDeposit) {
		currentDepositCents += numCentsToDeposit;
	}

	// Returns the currently deposited amount (in cents).
	// Parameters:
	// None
	// Return:
	// int number of cents in the current deposit
	// ...getDeposit...
	public int getDeposit() {
		return currentDepositCents;
	}

	// Implements a sale. If there are items in stock and
	// the deposited amount is greater than or equal to
	// the single item price, then adjusts the stock
	// and calculates and sets change and returns true;
	// otherwise refunds the whole deposit (moves it into change)
	// and returns false.
	// Parameters:
	// None
	// Return:
	// boolean successful sale (true) or failure (false)
	// ...makeSale...
	public boolean makeSale(){
		if (numItemsInStock > 0 && currentDepositCents >= itemPrice) {
			numItemsInStock--;
			currentChange = currentDepositCents - itemPrice;
			currentDepositCents = 0;
			
			//Adds the current sale transaction to the total
			currentSale = itemPrice - currentChange;
			totalSales += currentSale;
			
			return true;
		}
		else {
			currentChange = currentDepositCents;
			currentDepositCents = 0;
			return false;
		}
		
	}

	// Returns and zeroes out the amount of change (from the last
	// sale or refund).
	// Parameters:
	// None
	// Return:
	// int number of cents in the current change
	// ...getChange...
	public int getChange() {
		return currentChange;
	}

	public int returnChange() {
		int returnChangeNum = 0;
		returnChangeNum = currentDepositCents;
		currentDepositCents = 0;
		return returnChangeNum;
	}
	
	public static double getTotalSales(){
		double temp = totalSales;
		totalSales = 0;
		return temp;
	}
}
