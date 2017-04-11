/**
 *	Program Name:	SortsHelper.java
 * Purpose:			A helper class which stores three sort algorithms
 * Coder:			Your Name Here
 * Date:				April, 2017
 */

public class SortsHelper
{
	public static void bubbleSort(int [] array)
	{
		// Create a temporary variable for swapping
		int temp = 0;
		int limit = array.length - 1;		//improved bubble sort

		// Create a Boolean variable to "flag" if sorting done
		boolean sorted = false;

		// Iterate as long as flag indicates the array is unsorted
		// The array is passed through as many times as it takes to swap adjacent values
		do
		{
			// Set the flag to indicate sorted, until we find a reason to change it to  
			sorted = true;
						
			// look at each array element
			for(int index = 0; index < limit; index++)
			{
				// Compare the current element to the one to the right of it
				if(array[index]>array[index+1])
				{
					// Swap the two elements
					temp = array[index];
					array[index] = array[index+1];
					array[index+1] = temp;

					// Set the flag to indicate unsorted
					sorted = false;
				}				 
			}
			limit--;
		}while (sorted == false);
	}//End of bubbleSort method
	
	public static void selectionSort(int [] array)
	{
		// Create a temporary variable for swapping
		int temp = -1;
		
		//Outer loop traverses the array from start to end
		for(int i = 0; i < array.length; i++)
		{
			//Inner loop traverses the array from i to end (array as a subset)
			for(int j = i; j < array.length; j++)
			{
				//Compare the current element to the smallest element 
				if(array[j] < array[i])
				{
					//Swap the two elements
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}		
			}			
		}		
	}//End of selection sort method
	
	public static void quickSort(int [] array, int min, int max)
	{
		int partition = 0;
		
		if( min < max)
		{
			//Create partitions
			partition = findPartition(array, min, max);
			
			//Sort the left side
			quickSort(array, min, partition - 1);
			 
			//Sort the right side
			quickSort(array, partition + 1, max);			
		}
	}//End of quickSort method
	
	//Helper method for quickSort
	private static int findPartition(int [] array, int min, int max)
	{
		int pivot = array[max];
		int small = min - 1;
		
		for (int i = min; i < max; i++)
		{
			if(array[i] <= pivot)
			{
				small++;
				swap(array, i, small);
			}
		}
		
		swap(array, max, small + 1);
		return small + 1;		
	}//End of findPartition
	
	private static void swap(int [] array, int index, int small)
	{
		int temp = 0;
		temp = array[index];
		array[index] = array[small];
		array[small] = temp;
	}//End of swap method
}//End of class