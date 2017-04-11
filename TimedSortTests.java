/**
 * Program Name:	TimedSortTests.java
 * Purpose:			To compare how long it takes sorting algorithms to sort arrays of various sizes
 * Coder:			Your Name, Student Number
 * Date:				April, 2017
 */

import java.io.*;
import java.util.*;

public class TimedSortTests
{
	//Create an array
	static int [] array;
	 
	public static void main(String[] args)throws IOException
	{
		//Create a Scanner object
		Scanner input = new Scanner(System.in);
		
		//Test 2 - test length of time required to sort the array for arrays of varying sizes
		//Declare variables
		boolean test = true;
		long start = 0;
		long end = 0;
		long duration = 0;
		int choice = 0;
		String filename = "";
		
		writeRandomToFile("100.txt", 100);
		writeRandomToFile("1k.txt", 1000);
		writeRandomToFile("5k.txt", 5000);
		writeRandomToFile("10k.txt", 10000);
		writeRandomToFile("100k.txt", 100000);
		writeRandomToFile("250k.txt", 250000);
		
		//Repeat tests
		while (test)
		{
			System.out.println("1.  Data set of 100 elements"); 
			System.out.println("2.  Data set of 1,000 elements");
			System.out.println("3.  Data set of 5,000 elements");
			System.out.println("4.  Data set of 10,000 elements");
			System.out.println("5.  Data set of 100,000 elements");
			System.out.println("6.  Data set of 250,000 elements");
			System.out.print("Choose a file size to sort:  ");
			choice = input.nextInt();
			
			if (choice == 1)
				filename = "100.txt";
			else if (choice == 2)	
				filename = "1k.txt";								
			else if (choice == 3)
				filename = "5k.txt";
			else if (choice == 4)
				filename = "10k.txt";
			else if (choice == 5)
				filename = "100k.txt";
			else if (choice == 6)
				filename = "250k.txt";
			
			//Fill array from file with length specified in first line of file
			fillArrayFromFile(filename);			
			
			//Copy array for sorting
			int [] bubbleSort = Arrays.copyOf(array, array.length);			
			int [] selectionSort = Arrays.copyOf(array, array.length);
			int [] quickSort = Arrays.copyOf(array, array.length);
							
			//Print unsorted arrays
			System.out.println("\nBubble Sort data:");
			printArray(bubbleSort);
//			System.out.println("\nSelection Sort data:");
//			printArray(selectionSort);
//			System.out.println("\nQuick Sort data:");
//			printArray(quickSort);
			
			//Bubble Sort test
			System.out.println("\nBubble Sort beginning . . . .");
			//Get the current time in milliseconds from System
			start = System.currentTimeMillis();
			//Start the sort	
			SortsHelper.bubbleSort(bubbleSort);			
			//Get the current time in milliseconds from System
			end = System.currentTimeMillis();
			//Find the duration for the sort
			duration = end - start;			
			//Display the time it took to complete the bubble sort
			System.out.println("Done Bubble Sort");
			System.out.println("Bubble Sort took:  " + duration + " milliSeconds\n");
			
			System.out.println("\nBubble Sort data now sorted:");
			printArray(bubbleSort);
			
			//Selection Sort test
			System.out.println("\nSelection Sort beginning . . . .");
			//Get the current time in milliseconds from System
			start = System.currentTimeMillis();
			//Start the sort			
			SortsHelper.selectionSort(selectionSort);
			//Get the current time in milliseconds from System
			end = System.currentTimeMillis();
			//Find the duration for the sort
			duration = end - start;	
			//Display the time it took to complete the bubble sort
			System.out.println("Done Selection Sort");
			System.out.println("Selection Sort took:  " + duration + " milliSeconds\n");
			
			//Quick Sort test
			System.out.println("\nQuick Sort beginning . . . .");
			//Get the current time in milliseconds from System
			start = System.currentTimeMillis();
			//Start the sort			
			SortsHelper.quickSort(quickSort, 0, quickSort.length - 1);
			//Get the current time in milliseconds from System
			end = System.currentTimeMillis();
			//Find the duration for the sort
			duration = end - start;	
			//Display the time it took to complete the bubble sort
			System.out.println("Done QuickSort");
			System.out.println("Quick Sort took:  " + duration + " milliSeconds\n");
					
			//Run test another file size
			System.out.println("Run test on another file size? (N to stop)  ");
			char answer = input.next().charAt(0);
			if(answer == 'N')
				test = false;			
		}
		
		//Close the input object
		input.close();
	}//End of main method
	
	public static void printArray(int [] array)
	{
		for(int x = 0; x < array.length; x++)
		{
				if((x+1) % 20 == 0)
						System.out.printf("%5d\n", array[x]);				
				else
					System.out.printf("%5d", array[x]);
		}
	}//End of printArray method
		
	public static void writeRandomToFile(String filename, int fileLength) throws IOException
	{
		//Create a File object to store the file
		File file = new File (filename);
		
		//Create a PrintWriter object to write to the file
		PrintWriter write = new PrintWriter(new BufferedWriter(new FileWriter(file,false)));
		
		//Add file length to first line of the file
		write.println(fileLength);
		
		for(int x = 0; x < fileLength; x++)
			//Add a line to the file
			write.println((int)(Math.random() * 1000));
		
		write.close();		
	}//End of writeToFile method
		
	public static void fillArrayFromFile(String filename) throws IOException
    {
    	BufferedReader infile = new BufferedReader(new FileReader(filename));
		int fileLength = Integer.parseInt(infile.readLine());
		
		array = new int[fileLength];
		
		for (int x = 0; x < fileLength; x++)
		{
			array[x] = Integer.parseInt(infile.readLine());			
		}
				
		infile.close();
    }//End of fillArrayFromFile method
}//End of class