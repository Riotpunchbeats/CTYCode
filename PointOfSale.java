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
import java.util.*;

public class PointOfSale
{
	public static void main(String[] args)
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		//Create variables
		String custname = "";
		//Create Arrays
		double [] itemArray = fillArray();
		
		System.out.println("Hi! Welcome to Maggie's! \nWhat's your name?");
		custname = input.next();
		System.out.println("Ok, " + custname + ", enter the price of each of your purchases in dollars and cents and then hit the ENTER key. \nFor example, if your item cost $5.99, then you would enter 5.99.");
		System.out.println("\nIf you make a mistake while entering a price, just enter a zero for the next entry. The last entry will then be subtracted from your total.");

		System.out.println("enter");

		
    }
	public static double [] fillArray() 
    {
    double [] array = new double[10];

    
    Scanner input = new Scanner(System.in);

    //get user input
    System.out.print("Please enter your item price:  ");
    for(double x = 0; x<array.length; x++)
    {
        System.out.print("item " + (x + 1) + ": $  ");
        array[x] = input.nextInt();

        //validate input
        while(array[x] < 0 || array[x] > 99.99)
            {
                System.out.print("Out of range, please enter a valid price.");
                array[x] = input.nextInt();
            }
    }
    return array;
}//end of user input
}