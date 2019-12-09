package puzzle.number.generators;

import java.util.Arrays;

/**
 * ******************************************************************************************************************************************************************
 * 									@author SCN6347										    *
 ********************************************************************************************************************************************************************
 *
 * Logic Implied:
 * 
 * 1. Check whether the digits of the number are in descending order. If so, no next higher value is possible.
 * 2. Move from right to left to find a subsequent digits like digit at right is greater than digit at left. 
 * 3. Swap this integer with the next possible highest integer to the right.
 * 4. Sort the array to the right of the left most changed integer in Ascending order.
 * 
 */

public class NextLargestNumber
{

	public static void main(String[] args)
	{
		NextLargestNumber nextLargestNumber = new NextLargestNumber();
		nextLargestNumber.nextGreaterNumber(123564);

	}

	void nextGreaterNumber(int number)
	{
		char charArray[] = String.valueOf(number).toCharArray();
		int[] numArray = convertCharArraytoIntArray(charArray);

		if (isArrayDescending(numArray))
		{
			System.out.println("No Next Higher Value is Possible");
			return;
		}
		byte swapPosition = identifySwapPosition(numArray);
		if (swapPosition < 0)
		{
			System.out.println("Logic Failed");
			return;
		}
		System.out.println("Swap Position: " + swapPosition + "   Swap Number: " + numArray[swapPosition]);
		int currentNum = numArray[swapPosition];
		int nextHighest = Integer.MAX_VALUE;
		byte nextHighPos = -1;
		for (byte i = (byte) (swapPosition + 1); i < numArray.length; i++)
		{
			int indexNum = numArray[i];
			if (indexNum > currentNum && indexNum <= nextHighest)
			{
				nextHighest = indexNum;
				nextHighPos = i;
			}
		}

		numArray[swapPosition] = nextHighest;
		numArray[nextHighPos] = currentNum;
		Arrays.sort(numArray, swapPosition + 1, numArray.length);

		int result = mergeDigitsToInteger(numArray);
		System.out.println("Next Highest Number Identified for Input = " + number + " is: " + result);
	}

	private int mergeDigitsToInteger(int[] numArray)
	{
		StringBuilder numberValue = new StringBuilder();
		for (int i = 0; i < numArray.length; i++)
		{
			numberValue.append(numArray[i]);

		}
		return Integer.valueOf(numberValue.toString());
	}

	private byte identifySwapPosition(int[] numArray)
	{
		for (byte i = (byte) (numArray.length - 1); i >= 1; i--)
		{
			if (numArray[i - 1] < numArray[i]) return (byte) (i - 1);
		}
		return -1;
	}

	private int[] convertCharArraytoIntArray(char[] charArray)
	{
		int numArray[] = new int[charArray.length];
		for (int i = 0; i < charArray.length; i++)
		{
			numArray[i] = Integer.valueOf(String.valueOf(charArray[i]));
		}
		return numArray;
	}

	private boolean isArrayDescending(int[] numArray)
	{
		for (int i = 1; i < numArray.length; i++)
		{
			if (numArray[i] > numArray[i - 1]) return false;
		}
		return true;
	}
}