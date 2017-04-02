/**
 * Program Name:	NumberStats.java
 * Purpose:			To demonstrate the use of statistical methods (#1-12)
 * 					and to demonstrate the use of utility methods (#13-19)
 * Coder:			Janice Manning, Student Number
 * Date:			   March, 2017
 */

/**
 * Algorithm:
 * 1.	Populate an array with ints
 * 2.	Print array
 * 3.	Count elements in array
 * 4.	Count elements in array given a condition and a value
 * 5.	Calculate sum of array elements
 * 6.	Calculate sum of array elements given a condition and a value (HOMEWORK)
 * 7.	Calculate average of array elements
 * 8. Calculate average of array elements given a condition and a value (HOMEWORK)
 * 9. Find maximum value in array
 * 10. Find minimum value in array (HOMEWORK)
 * 11. Find median value in array 
 * 12. Find mode value in array (HOMEWORK CHALLENGE!)
 *  13. Sort the array
 * 14. Clear the array
 * 15. Check if the array is empty
 * 16. Search the array for a value and get its index
 * 17. Remove data from the array if it is there
 * 18. Add data to the end of the array
 * 19. Add data to the beginning or middle of the array
 */
import java.util.Arrays;
import java.util.Scanner;

public class NumberStatistics
{
	public static void main(String[] args)
	{
		//some bullshit(user inputs)
        int [] numbers = fillArray();

        // 1. Populate an array with ints with hard-coded values
		//int [] numbers = {42, 56, 44, 7, 15, 482, 63, 55, -87, 36, -6, 20, 44};	
		// 2. Print the array		
        printArray(numbers);

		// 3. Count elements in array
		System.out.println("Count of elements: " + numbers.length);
		// 4. Count elements in array given a condition and a value
		int count = countIf(numbers, ">", 50);
        System.out.println("Count of elements greater than 50: " + count);
		// 5. Calculate sum of array elements
		int total = sum(numbers);
        System.out.println("Sum of elements: " + total);
		// 6. Calculate sum of array elements given a condition and a value (HOMEWORK)
		    //total = sumIf(numbers, "<", 50);
            //System.out.println("Sum of elements <50: ");
		// 7. Calculate average of array elements
		double average = average(numbers);
        System.out.println("Average of elements: " + average);		
		// 8. Calculate average of array elements given a condition and a value (HOMEWORK)
		    //average = averageIf(numbers, "<", 70);
            //System.out.println("Average of element <70");
		// 9. Find maximum value in array
			int highest = max(numbers);
            System.out.println("The max value of elements: " + highest);	
		// 10. Find minimum value in array (HOMEWORK)
				
		// 11. Find the median of the sorted array!!
		Arrays.sort(numbers);
		// 12. Find mode value in array (HOMEWORK CHALLENGE)
			
		// 13. Sort the array
		
		// 14. Clear the array
		UtilHelper.clear(numbers); 
		// 15. Check if the array is empty
		
		// 16. Search the array for a value and get the index of the first occurrence
		
		// 17. Remove data from the array if it's there
		
		// 18. Add data to the end of the array
				
		// 19. Add data to the beginning or middle of the array
		
	}// End of main method

    //2. method to print int array 
    public static void printArray(int [] array)
    {
        System.out.print("Array values: ");
        for(int x = 0; x < array.length; x++)
            {
                if (x == 0)
                    System.out.print("[ " + array[x] + " ,");
                else if (x <= array.length-2)
                    System.out.print(array[x] + " ,");
                else if (x == array.length-1)
                    System.out.print(array[x]+ " ]");
            }
        System.out.println();
    }//End of printArray method
    
    //3. method to count values given condition 
    public static int countIf(int [] array, String operator, int value)
    {
        int count = 0;
        for(int x : array)
        {
            if(operator.equals(">"))
            {
                if(x > value)
                    count++;
            }
            else if(operator.equals("<"))
            {
                if(x<value)
                    count++;
            }
        }
        return count;
    }//end of countIf method
//user input
public static int [] fillArray() 
    {
    int [] array = new int[13];

    
    Scanner input = new Scanner(System.in);

    //get user input
    System.out.print("Emter 13 values between 10 and 100: ");
    for(int x = 0; x<array.length; x++)
    {
        System.out.print("Number" + (x + 1) + ": ");
        array[x] = input.nextInt();

        //validate input
        while(array[x] < 10 || array[x] > 100)
            {
                System.out.print("Interger out of range.");
                array[x] = input.nextInt();
            }
    }
    return array;
    }//end of user input
//sum values 
public static int sum(int [] array)
{
    int total = 0;
    for(int x : array)
    {
        total += x;
    }

    return total;
}//end of sum 
//AVG values
public static double average(int [] array)
{
    double averageArray = 0.0;
    int total = sum(array);
    averageArray = total / array.length;
  
    return averageArray;
}//end of average
//find the max 
public static int max(int [] array)
{
    int highest = array[0];
    for(int x = 1; x < array.length; x++)
    {
        if(array[x] > highest)
            highest = array[x];

    }
    return highest;
}


}// End of class