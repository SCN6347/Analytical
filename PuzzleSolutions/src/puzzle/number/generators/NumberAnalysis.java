package puzzle.number.generators;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ******************************************************************************************************************************************************************
 * 									@author SCN6347										    *
 ********************************************************************************************************************************************************************
 */

public class NumberAnalysis
{

	public static void main(String[] args)
	{
		NumberAnalysis numberAnalysis = new NumberAnalysis();
		Method methods[] = NumberAnalysis.class.getDeclaredMethods();
		System.out.println("\n*******************************************************************************************************************\n");
		for (Method method : methods)
		{
			try
			{
				String methodName = method.getName();
				if(methodName.equals("main") || methodName.contains("lambda$")) continue;
				if(Modifier.isPrivate(method.getModifiers())) continue;
				method.invoke(numberAnalysis);
				System.out.println("\n*******************************************************************************************************************\n");
			}
			catch (IllegalAccessException e)
			{
				e.printStackTrace();
			}
			catch (IllegalArgumentException e)
			{
				e.printStackTrace();
			}
			catch (InvocationTargetException e)
			{
				e.printStackTrace();
			}
		}
	}
	
	void sumOfDigits()
	{
		int number = 5156789;
		int result = number;
		result = (number % 9 == 0) ? 9 : (number % 9);
		System.out.println("NumberAnalysis.sumOfDigits(): Input = " + number + " Result = " + result);
	}
	
	void sumOfDigitsIteration()
	{
		int number = 5156789;
		char numbers[] = String.valueOf(number).toCharArray();
//		String[] numbers = String.valueOf(number).split("(?<=.)");
		int result = 0;
		while(numbers.length > 1)
		{
			result = 0;
			for (char c : numbers)
			{
				result += Integer.valueOf(String.valueOf(c));
			}
			numbers = String.valueOf(result).toCharArray();
		}
		System.out.println("NumberAnalysis.sumOfDigitsIteration(): Input = " + number + " Result = " + result);
	}
}