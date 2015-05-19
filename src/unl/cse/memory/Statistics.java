package unl.cse.memory;

import java.util.Scanner;

public class Statistics {
	
	//Fills numList with random numbers
	public static int[] buildArray(int size)
	{
		int result[] = new int[size];
		System.out.println("Enter your list of numbers: ");
		Scanner s = new Scanner(System.in);
		int i=0;
		while(i < size && s.hasNext()) {
			result[i] = s.nextInt();
			i++;
	    }
		return result;
	}

	//Write your code here to find the mean of numList
    /*
	public static return_type findMean(parameters)
	{
		//TODO: implement
	}

	public static return_type findMax(parameters)
	{
		//TODO: implement
	}

	public static return_type findMin(parameters)
	{
		//TODO: implement
	}
    */
	public static void main(String args[]) {

	    int min = 0, max = 0, size;
	    double mean = 0.0;
	    
	    System.out.println("Enter the amount of numbers you'd like to find the stats for: ");
	    Scanner s = new Scanner(System.in);
	    size = s.nextInt();
	    
	    //declare an array and use buildArray...
	    
	    /*Pass the appropriate variables into your functions here*/
	    //min = findMin(<arguments>);
	    //max = findMax(<arguments>);
	    //mean = findMean(<arguments>);

	    System.out.println("Min: "+min);
	    System.out.println("Max: "+max);
	    System.out.println("Mean: "+mean);

	}
}
