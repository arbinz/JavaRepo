import java.util.Scanner;

public class Calculator 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hello. I am the Calculator. I am alive. Please kill me.");
		Boolean c = true;
		while(c)
		{
			System.out.println("What number would you like to start with?");
			float num1 = scanner.nextFloat();

			System.out.println("What do you want the second number to do to the first number?");
                	String oper = scanner.next();

			System.out.println("Second Number please:");
			float num2 = scanner.nextFloat();

			if (oper.equals("+"))
			{
				float answer = num1 + num2;
				System.out.println("The answer is: " + answer);
			}
		
			else if (oper.equals("-"))
			{
				float answer = num1 - num2;
				System.out.println("the answer is: " + answer);
			}

			else if (oper.equals("*"))
			{
				float answer = num1 * num2;
				System.out.println("the answer is: " + answer);
			}		

			else if (oper.equals("/"))
			{
				float answer = num1 / num2;
				System.out.println("the answer is: " + answer);
			}

			else
			{
				System.out.println("thats not an operator you dum dum");
			}
			System.out.println("Would you like to calculate again you sick freak? y/n");
			String play = scanner.next();
			if (play.equals("n"))
			{
				c = false;
			}
		}
	}
}
