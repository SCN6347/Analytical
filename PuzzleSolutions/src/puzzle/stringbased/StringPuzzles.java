package puzzle.stringbased;

import java.util.Arrays;

public class StringPuzzles
{

	public static void main(String[] args)
	{
		new StringPuzzles().checkWhetherAnagram("MSD", "YUVI");

	}

	private void checkWhetherAnagram(String firstString, String secondString)
	{
		char[] charArray1 = firstString.toCharArray();
		char[] charArray2 = secondString.toCharArray();
		
		if(charArray1.length != charArray2.length)
		{
			System.out.println("Strings are not Anagram");
		}
		
		Arrays.parallelSort(charArray1);
		Arrays.parallelSort(charArray2);
		
		if(Arrays.equals(charArray1, charArray2))
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
	}

}
