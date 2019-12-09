package puzzle.number.patterns;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ******************************************************************************************************************************************************************
 * 
 * @author SCN6347 *
 ********************************************************************************************************************************************************************
 */

public class NumberBasedGenerators
{

	public static void main(String[] args)
	{
		NumberBasedGenerators numberBasedGenerators = new NumberBasedGenerators();
		Method methods[] = NumberBasedGenerators.class.getDeclaredMethods();
		for (Method method : methods)
		{
			try
			{
				if (method.getName().equals("main")) continue;
				method.invoke(numberBasedGenerators);
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

	void printAlphabetTriangle()
	{

		System.out.println("PyramidPattern.printAlphabetTriangle()");
		short i, j;
		char baseArray[] = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int charCount = 7;

		for (i = 0; i < charCount; i++)
		{
			for (j = 0; j <= i; j++)
			{
				System.out.printf("%c  ", baseArray[i]);
			}
			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printFloydsTriangle()
	{

		System.out.println("PyramidPattern.printFloydsTriangle()");
		short rows = 7, i, j, number = 1;

		for (i = 1; i <= rows; i++)
		{
			for (j = 1; j <= i; ++j)
			{
				System.out.printf("%d ", number);
				++number;
			}

			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printPascalsTraingle()
	{

		System.out.println("PyramidPattern.printPascalsTraingle()");
		short rows = 9, coef = 1, space, i, j;

		for (i = 0; i < rows; i++)
		{
			for (space = 1; space <= rows - i; space++)
				System.out.print("  ");

			for (j = 0; j <= i; j++)
			{
				if (j == 0 || i == 0) coef = 1;
				else coef = (short) (coef * (i - j + 1) / j);

				System.out.printf("%4d", coef);
			}
			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printNumberHalfPyramid()
	{

		System.out.println("PyramidPattern.printNumberHalfPyramid()");

		short i, j, rows = 7;

		for (i = 1; i <= rows; ++i)
		{
			for (j = 1; j <= i; ++j)
			{
				System.out.printf("%d ", j);
			}
			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printStarHalfPyramid()
	{

		System.out.println("PyramidPattern.printHalfPyramid()");
		short i, j, rows = 7;

		for (i = 1; i <= rows; ++i)
		{
			for (j = 1; j <= i; ++j)
			{
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printStarInvertedHalfPyramid()
	{

		System.out.println("PyramidPattern.printStarInvertedHalfPyramid()");
		short i, j, rows = 7;

		for (i = rows; i >= 1; --i)
		{
			for (j = 1; j <= i; ++j)
			{
				System.out.printf("* ");
			}
			System.out.printf("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printNumberInvertedHalfPyramid()
	{

		System.out.println("PyramidPattern.printInvertedHalfPyramid()");
		short i, j, rows = 7;
		for (i = rows; i >= 1; --i)
		{
			for (j = 1; j <= i; ++j)
			{
				System.out.printf("%d ", j);
			}
			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printStarInvertedPyramid()
	{

		System.out.println("PyramidPattern.printInvertedPyramid()");
		short rows = 7;

		for (short i = rows; i >= 1; --i)
		{
			for (short space = 0; space < rows - i; ++space)
				System.out.print("  ");

			for (short j = i; j <= 2 * i - 1; ++j)
				System.out.print("* ");

			for (short j = 0; j < i - 1; ++j)
				System.out.print("* ");

			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printNumberPyramid()
	{
		System.out.println("PyramidPattern.printNumberPyramid()");
		short rows = 6, count1 = 0, count = 0, k = 0;
		for (short i = 1; i <= rows; ++i)
		{
			for (short space = 1; space <= rows - i; ++space)
			{
				System.out.print("  ");
				++count;
			}

			while (k != 2 * i - 1)
			{
				if (count <= rows - 1)
				{
					System.out.printf("%d ", i + k);
					++count;
				}
				else
				{
					++count1;
					System.out.printf("%d ", (i + k - 2 * count1));
				}
				++k;
			}
			count1 = count = k = 0;

			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printStarEquilateralTirangle()
	{

		System.out.println("PyramidPattern.printStarEquilateralTirangle()");
		short i, k = 0, rows = 7;

		for (i = 1; i <= rows; ++i, k = 0)
		{
			for (short space = 1; space <= rows - i; ++space)
			{
				System.out.print("  ");
			}

			while (k != 2 * i - 1)
			{
				System.out.print("* ");
				++k;
			}

			System.out.print("\n");
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

	void printnumbersIncrementalByColumn()
	{

		System.out.println("PyramidPattern.printnumbersIncrementalByColumn()");
		int n = 5;
		for (int i = 0; i <= n - 1; i++)
		{
			int a = 0;
			a = i + 1;
			for (int j = 0; j <= i; j++)
			{

				System.out.print(a);
				a = a + n - j - 1;
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println("\n\n*****************************************************************************************\n\n");
	}

}
