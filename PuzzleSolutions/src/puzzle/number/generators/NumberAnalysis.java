package puzzle.number.generators;

public class NumberAnalysis
{

	public static void main(String[] args)
	{
		NumberAnalysis numberAnalysis = new NumberAnalysis();
		System.out.println("Sum Of Digits of 5156789 = " + numberAnalysis.sumOfDigits(5156789)) ;
	}
	
	private int sumOfDigits(int number)
	{
		if (number == 0) return 0;
		return (number % 9 == 0) ? 9 : (number % 9);
	}

	private int nextGreaterNumber(int number)
	{
		
		return number;
		
	}

}
