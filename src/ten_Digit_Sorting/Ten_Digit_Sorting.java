package ten_Digit_Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/*
	 Given an array A of N integers. Sort the array in increasing order of the value at the tens place digit of every number.
	If a number has no tens digit, we can assume value to be 0.If 2 numbers have same tens digit, in that case number with max value will come firstSolution should be based on comparator.
	
	Input 1:
	
	A = [15, 11, 7, 19]
	
	Input 2:
	
	A = [2, 24, 22, 19]
	
	Output 1:
	
	[7, 19, 15, 11]
	
	Output 2:
	
	[2, 19, 24, 22]
	
 */
public class Ten_Digit_Sorting {
	
	private static void ten_digit_sorting(String[] array) {

		Arrays.sort(array,new Comparator<String>()
				{
					public int compare(String temp1,String temp2)
					{
						if(temp1.length()>temp2.length())		// if temp1 length is greater, swap
						{
							return 1;
						}
						if(temp1.length()<temp2.length())		// if temp2 length is greater, don't swap
						{
							return -1;
						}
						if(temp1.length()==temp2.length())		// if both are same length,check for the first character EG: 19,20
						{
							if(Integer.parseInt(temp1.charAt(0)+"")<Integer.parseInt(temp2.charAt(0)+""))	// 19<20 => Don't swap
							{
								return -1;
							}
							if(Integer.parseInt(temp1.charAt(0)+"")>Integer.parseInt(temp2.charAt(0)+""))	// else swap
							{
								return 1;
							}
						}
						int number1=Integer.parseInt(temp1);		// convert to number
						int number2=Integer.parseInt(temp2);
						if(number1>number2)							// if number1 > number 2 , then don't swap EG 29>28
						{
							return -1;
						}
						if(number1<number2)							// else swap
						{
							return 1;
						}
						else										// if duplicates, no problem
						{
							return 0;
						}
					}
				});
		for(int i=0;i<array.length;i++)
		{
		
			System.out.print(array[i]+" ");
		}
	}

	public static void main(String[] args) {
	

		Scanner scanner=new Scanner(System.in);
		int n=scanner.nextInt();
		scanner.nextLine();
		String array[]=new String[n];			// Get string for easier manipulation using comparator
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextLine();
		}	
		ten_digit_sorting(array);

	}

	

}
