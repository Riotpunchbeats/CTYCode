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

public class PointOfSale
{
	public static void main(String[] args)
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		String custname = "";

		System.out.println("Hi! Welcome to Maggie's! \nWhat's your name?");
		custname = input.next();
		System.out.println("Ok, " + custname + " , enter the price of each of your purchases in dollars and cents and then hit the ENTER key. \nFor example, if your item cost $5.99, then you would enter 5.99.");

    }
}