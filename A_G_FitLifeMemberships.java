/**
 * Program Name:	A_G_FitLifeMemberships
 * Purpose:			To simulate a fast food booth
 * Coder:			Ayden Green 0818753
 * Date:				March, 2017
 */

import java.text.NumberFormat;
import java.util.Scanner;

public class A_G_FitLifeMemberships
{
	public static void main(String[] args)
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
        
        //Create a NumberFormat object
		NumberFormat nf = NumberFormat.getCurrencyInstance();

        //Declare and initialize variables
		String userName = "";
		int numberOfPeople = 0;
		int oneClubCount = 0;
		int regionCount = 0;
		int nationalCount = 0;
		char memOption = ' ';
		double memberPrice = 0.0;
		double totalPrice = 0.0;

        //Declare and initialize constants
		final double ONE_CLUB_PRICE = 99.00;
		final double MULTICLUB_PRICE = 115.75;
		final double NATIONAL_PRICE = 135.50;

        //Print header
        System.out.println("Welcome to FitLife's 3-month trial membership purchasing service!");
        System.out.println("----------------------------------------------------------------");
        System.out.println("This application calculates the total trial membership fee for a group of any size, \nselecting varying club access choices, joining FitLife for 3 Months");
        System.out.println("----------------------------------------------------------------");

        //Get number of people in group
        System.out.print("How many people are in your group?");
        numberOfPeople = input.nextInt();

        //Repeat "group" number of times, getting ages and calculating total admission price for the group
		for (int x = 1; x <= numberOfPeople; x++)
		{
			do
			{
				//Get group options
				System.out.print("\nEnter membership Option " + x 
						+ ". Use member Code 'C, R, or N': ");
				
				memOption = input.next().charAt(0);

				//Validate that input is correct
				
				if (!(memOption == 'C' 
						|| memOption == 'R'
						|| memOption == 'N'))
				{
					System.out.println("BAD INPUT!");
				}
				
			}while (!(memOption == 'C' 
					|| memOption == 'R'
					|| memOption == 'N'));
	
			
				
			//Assign member price based on member type selection and increment the corresponding option counter 
			switch (memOption)
			{
				case 'C':
					oneClubCount++;
					memberPrice = ONE_CLUB_PRICE;
					break;

				case 'R':
					regionCount++;
					memberPrice = MULTICLUB_PRICE;
					break;
				
				case 'N':
					nationalCount++;
					memberPrice = NATIONAL_PRICE;
					break;
				
				
			}
			
			//Update the total price
			totalPrice += memberPrice;
    	
		
		
		
		   
    }
//Output the total food order
		System.out.println("Your group consists of: ");
		System.out.println("-------------------------------");
		System.out.println(oneClubCount + " of the One-Club Membership");
		System.out.println(regionCount + " of the Muti-Club Membership ");
		System.out.println(nationalCount + " Of the 365-Club membership");
		System.out.println("-------------------------------");
		System.out.println("Your total membership fees for this group are: " + nf.format(totalPrice));
        //Close Scanner object
		input.close(); 
}}