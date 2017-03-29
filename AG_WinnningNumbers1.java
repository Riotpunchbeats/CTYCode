 /**
 * Program Name:	AG_WinnningNumbers.java
 * Purpose:			
 * Coder:			Ayden Green 0818753
 * Date:				March, 28, 2017
 */
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;


public class AG_WinnningNumbers1
{
	public static void main(String[] args)
	{
        //User intro
        System.out.println("Welcome to Ayden Green Quick Pick Lotto Simulation! ");
        System.out.println("-------------------------------------------------------");
        System.out.println("Instructions:");
        System.out.println("-------------------------------------------------------");
        System.out.println("1. Purchase your ticket for $6.50 \n2. Pick 10 numbers between 0-9 for your ticket. \n3. Your ticket will be comparead to the winning numbers.");
        System.out.println("-------------------------------------------------------");
        System.out.println("Good luck!");
        System.out.println("-------------------------------------------------------");

        //Create Arrays
         int [] lottoPick = fillArray();
         int [] lottoWin = fillWin();
         
         //Create final values
         final double ticketCost = 6.50;
         //print Winnning numbers
         printWin(lottoWin);
         //Print user picked numbers
         printUsr(lottoPick);
         //compare 
         int match = 0;
        {
        if (lottoPick[0] == lottoWin[0]);
            match++;
        if (lottoPick[1] == lottoWin[1])
                    match++;
        else if (lottoPick[2] == lottoWin[2])
                    match++;
        else if (lottoPick[3] == lottoWin[3])
                    match++;
        else if (lottoPick[4] == lottoWin[4])
                    match++;
        else if (lottoPick[5] == lottoWin[5])
                    match++;
        else if (lottoPick[6] == lottoWin[6])
                    match++;
        else if (lottoPick[7] == lottoWin[7])
                    match++;
        else if (lottoPick[8] == lottoWin[8])
                    match++;
        else if (lottoPick[9] == lottoWin[9])
                    match++;
        }   
    
            
      
        System.out.println(match);
    }
public static int [] fillArray() 
    {
    int [] array = new int[10];

    
    Scanner input = new Scanner(System.in);

    //get user input
    System.out.print("Enter 10 Numbers between 0-9: ");
    for(int x = 0; x<array.length; x++)
    {
        System.out.print("Number " + (x + 1) + ": ");
        array[x] = input.nextInt();

        //validate input
        while(array[x] < 0 || array[x] > 9)
            {
                System.out.print("Out of range, please enter a new number.");
                array[x] = input.nextInt();
            }
    }
    return array;
}//end of user input

public static int [] fillWin() 
    {
    int [] array = new int[10];

    
   

   
    
    for(int x = 0; x< array.length; x++)
    {
       ;
        array[x] = (int)(Math.random() * (9 - 0 + 1) + 0);

        
    }
    return array;
}
 public static void printWin(int [] lottoWin)
    {
        System.out.print("Winning Numbers: ");
        for(int x = 0; x < lottoWin.length; x++)
            {
                if (x == 0)
                    System.out.print("[ " + lottoWin[x] + ", ");
                else if (x <= lottoWin.length-2)
                    System.out.print(lottoWin[x] + ", ");
                else if (x == lottoWin.length-1)
                    System.out.print(lottoWin[x]+ " ]");
            }
        System.out.println();
    }//End of printWin method
    public static void printUsr(int [] lottoPick)
    {
        System.out.print("Array values:    ");
        for(int x = 0; x < lottoPick.length; x++)
            {
                if (x == 0)
                    System.out.print("[ " + lottoPick[x] + ", ");
                else if (x <= lottoPick.length-2)
                    System.out.print(lottoPick[x] + ", ");
                else if (x == lottoPick.length-1)
                    System.out.print(lottoPick[x]+ " ]");
            }
        System.out.println();
    }//End of printUsr method

}