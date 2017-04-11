/**
 * Program Name:	MyTesterClass.java
 * Purpose:			To test the methods in MyToolbox
 * Coder:			Your Name Here
 * Date:				April, 2017
 */
import java.util.*;

public class MyTesterClass
{
	public static void main(String[] args)
	{
		//Declare and initialize variables
		int [] array = {2, 15, 78, -98, -2, 14, 190, 25, 56, 123, 478};

		ArrayList<Integer> list = new ArrayList<Integer>();

		int [][] twoDArray = {{12, 13, 12, 12},
								{8, 9, 8, 7},
								{14, 13, 12, 15},
								{30, 35, 40, 37},
								{24, 26, 23, 24},
								{30, 4, 11, 21}};
		
		//Test MyToolbox utilities on the array
		//1.  Print the array
		MyToolbox.printArray(array);
		//2.  Print if the array is empty
		System.out.println("Array empty?  " + MyToolbox.isEmpty(array));
		//3.  Print the sum of the array
		System.out.println("Sum of array: " + MyToolbox.sumArray(array));
		//4.  Print the average of the array
		System.out.println("Average of array:  " + MyToolbox.averageArray(array));
		//5.  Print the array reversed
		array = MyToolbox.reverseArray(array);
		MyToolbox.printArray(array);
		//6.  Print the array sorted
		array = MyToolbox.sortArray(array);
		MyToolbox.printArray(array);
						
		//Test MyToolbox utilities on the list
		//1.  Add 10 elements to the list, random numbers between 1 and 100
		MyToolbox.makeRandomInts(list, 10,  100);
		//2.  Print the list
		System.out.println(list.toString());
		//3.  Print the sum of the list
		System.out.println("Sum of list:  " + MyToolbox.sumList(list));
		//4.  Print the average of the list
		System.out.println("Average of list:  " + MyToolbox.averageList(list));
		//5.  Print the list reversed
		list = MyToolbox.reverseList(list);
		System.out.println(list.toString());
		//6.  Print the list sorted
		list = MyToolbox.sortList(list);
		System.out.println(list.toString());
				
		//Test MyToolbox utilities on the 2Darray
		//1.  Print the 2D array
		MyToolbox.printArray(twoDArray);
		//2.  Print if the 2D array is empty
		System.out.println("2Darray empty?  " + MyToolbox.isEmpty(twoDArray));
		//3.  Print the sum of the 2D array
		System.out.println("Sum of 2Darray:  " + MyToolbox.sumArray(twoDArray));
		//4.  Print the average of the array
		System.out.println("Average of array:  " + MyToolbox.averageArray(twoDArray)); 
		//5.  Print the sum of the first row of the 2D array
		System.out.println("Sum of first row:  " + MyToolbox.sumRow(twoDArray, 0));
		//6.  Print the sum of the last row of the 2D array
		System.out.println("Sum of last column:  " + MyToolbox.sumColumn(twoDArray,  twoDArray[0].length - 1));
		//7.  Print the maximum value of the first column of the 2D array
		System.out.println("Max of first column:  " + MyToolbox.findMaxColValue(twoDArray, 0));
		//8.  Print the minimum value of the first column of the 2D array			
		System.out.println("Min of first column:  " + MyToolbox.findMinColValue(twoDArray, 0));	
		//9.  Print the index of an element if it's found
		int value = 24;
		System.out.println(MyToolbox.indexOf(twoDArray, value));
			
	}//End of main method
}//End of class