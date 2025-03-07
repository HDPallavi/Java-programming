package programs;

import java.util.Arrays;

public class SortElementsinArray 
{

	public static void main(String[] args) 
	{
		 int[] numbers = {25, 10, 47, 32, 89, 55, 63}; // Unsorted array

	        System.out.println("Original Array: " + Arrays.toString(numbers));

	        Arrays.sort(numbers); // Sorting in ascending order

	        System.out.println("Sorted Array: " + Arrays.toString(numbers));
	}

}
