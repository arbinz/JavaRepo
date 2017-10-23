import java.util.Scanner;

public class InterestCalc
{
     public static void main(String []args)
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BestBank!");
        System.out.println("What is the starting value of your account?");
        int startingValue = sc.nextInt();
        System.out.println("What is the interest rate, compounded monthly, of this account?");
        double interestRate = sc.nextInt();
	System.out.println("Displaying first three months with a starting balance of " + startingValue + " and an interest rate of " + interestRate + "% per month");
	
	
	//lets start the calculations!!
	double month1 = startingValue * (1 + (interestRate / 100));
	System.out.println("Month 1 New Balance = " + month1);

	double month2 = month1 * (1 + (interestRate / 100));
	System.out.println("Month 2 New Balance = " + month2);

	double month3 = month2 * (1 + (interestRate / 100));
	System.out.println("Month 3 New Balance = " + month3);
     }
}
