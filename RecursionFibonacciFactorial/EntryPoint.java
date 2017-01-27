package Recursion;

import java.util.Scanner;

public class EntryPoint
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		boolean x = false;
		while (x != true)
		{
			System.out.println("Type 1 for Factorial, type 2 for Fibonacci, or 3 to quit");
			int input = sc.nextInt();
			if (input == 1)
			{
				System.out.println("What number do you wish to learn the factorial of?");
				int ip = sc.nextInt();
				System.out.println(Factorial(ip));
				System.out.println("");
				x = false;
			}
			if (input == 2)
			{
				System.out.println("What number do you wish to learn the Fibonacci Value of?");
				int ip = sc.nextInt();
				System.out.println(Fibonacci(ip));
				System.out.println("");
				x = false;
			}
			if (input == 3)
			{
				System.out.println("");
				x = true;
			}
		}
		sc.close();
	}
	
	public static long Factorial(int n)
	{
		if (n > 1)
		{
			n = n * (n - 1);
		} else
		{
			return n;
		}
		return n;
	}
	
	public static long Fibonacci(float i)
	{
		if (i <= 2)
		{
			return 1;
		} else
		{
			return Fibonacci(i - 1) + Fibonacci(i - 2);
		}
	}
}
