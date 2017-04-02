/**
 * Program Name:	PointOfSale
 * Purpose:			To Create a simple Point of sale system with user input
 * Coder:			Ayden Green 0818753
 * Date:		    
 * Algorythm:
 * 1. Declare variables
 * 2. Declare constants
 * 3. Create Arrays 
 * 4. Print Preamble
 * 5. Get user input
 * 6. Create loop
 */



import java.text.NumberFormat;
import java.util.Scanner;

public class POS2
{
	public static void main(String[] args)
	{
		//Create Scanner object
		Scanner input = new Scanner(System.in);
		//Create a DecimalFormat object
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		//Declare variables
		double [] purchases = new double[10];	//stores valid purchases
		double price = 0.0;							//stores user-entered prices
		int index = 0;									//counts loop iterations, used to control array length of 10
		int arrayCount = 0;							//counts valid prices assigned to array elements, used to control a zero entry
		String custname = "";
		//Declare a constant		
		final double MAX_PURCHASE = 99.99;
		final int SENTINEL = -1;
		
		//Print a title and instructions/ get users name
		System.out.println("Hi! Welcome to Maggie's! \nWhat's your name?");
		custname = input.next();
		System.out.println("Ok, " + custname + ", enter the price of each of your purchases in dollars and cents and then hit the ENTER key. \nFor example, if your item cost $5.99, then you would enter 5.99.");
		System.out.println("\nIf you make a mistake while entering a price, just enter a zero for the next entry. The last entry will then be subtracted from your total.");

		System.out.println("enter");
		
		
		//Main outer loop		
		do
		{			
			//Get a purchase price (using price variable)
			
			//Validate that price is not beyond the max purchase or < -1
			
			//Check if the user has signaled that he made a mistake and remove previous purchase
			if(price == 0.0 && arrayCount > 0)
			{
				
				
			}
			//Check if price is zero and arrayCount is zero, there are no items to remove 
			else if(price == 0.0 && arrayCount == 0)
			{
				
			}
			//Check if price is greater than 0.0, process the purchase
			else if(price > 0.0)
			{
				//Store the purchase in the purchase array
				
				//Update the subtotal
				
				//Print the subtotal
				
				//Increment the counters
			}
		}while(price != SENTINEL && index < 10);		//User is done shopping
		
		//Display the purchases (only the elements with data) and subtotal
	
		//Calculate the hst and print the result
		//Calculate the grand total and print the result
		//Get the tender amount
		//Validate the tender amount
		//Calculate the change
		
		//**Determine the denominations**	
		

}
} //End of main method