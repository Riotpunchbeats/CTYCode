/**
 * Program Name:	ArrayListProcessing.java
 * Purpose:			To demonstrate methods that will process a list
 * Coder:			Your Name Here
 * Date:				April, 2017
 */

import java.util.*;

public class ArrayListProcessing
{
	public static void main(String[] args)
	{
		//Create an ArrayList object available to all methods
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Print the empty list
		printList(list);
		
		//Call a method to create a list of 15 DIFFERENT random integers between 1 - 25
		addRandomInts(list, 15, 1, 25);		
		//Print the 10 random integers
		System.out.print("Random integers:  ");
		printList(list);
		
		//Green Group
		//1. Find the largest number in the list
		//int largest = findLargest(list);
		//System.out.println("Largest number: " + largest);
		
		//2. Reverse the list		
		//3. Sort the first half of the list		
		//4. Find the second largest value in the list 
		//5. Remove the second largest value in the list		
		//6. Remove any even numbers in the list
		
		//Yellow Group
		//1. Find the average of the list
		//double average = findAverage(list);
		//System.out.println("Average: " + average);
		
		//2. Search the list for the value 13
		//3. Sort the last half of the list
		//4. Double up the values of the list elements
		//5. Remove the first half of the list
		
		//Blue Group
		//1. Find the smallest number in the list
		//int smallest = findSmallest(list);
		//System.out.println("Smallest number: " + smallest);
		
		//2. Sort the list in ascending order
		//3. Sort the list in descending order
		//4. Find the average value of the last half of the list
		//5. Replace any even values in the list with zero
		//6. Remove the middle element if the list size is odd, or the middle two elements if the list size is even		
		
	}//End of main method
	
	/**
	*  Method:		addRandomInts
	*  Purpose:		To produce a list of unique random ints 
	*  Parameters:	int size, int low, int high
	*  Returns:		void
	*/
	public static void addRandomInts(ArrayList<Integer> list, int size, int low, int high)
	{
		int num = 0;
		
		//Continue making random int's until the list size reaches count
		while (list.size() < size)
		{
			num = (int)(Math.random() * (high - low + 1) + low);
			
			//Ensure the generated random int has not been added to the list
			if (list.indexOf(num) == -1)
				list.add(num);
		}		
	}//End of addRandomInts method
	
	/**
	*  Method:		printList
	*  Purpose:		To print the list
	*  Parameters:	none
	*  Returns:		void
	*/
	public static void printList(ArrayList<Integer> list)
	{
		if (list.size() > 0)
		{
			System.out.print("[ ");
			for (Integer x : list)
				System.out.print(x + " ");
			System.out.print("]\n\n");
		}
		else
			System.out.println("List is empty.\n");					
	}//End of printList method
}//End of class