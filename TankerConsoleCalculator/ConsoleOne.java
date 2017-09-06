package TankerCalc;

import java.util.Scanner;

public class ConsoleOne
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("How old do you expect to live, in years?");
		int age = sc.nextInt();
		System.out.println("How many ounces of water do you consume per day?");
		int oz = sc.nextInt();
		
		double gal = oz / 128;
		double galPY = gal * 365;
		double galPL = galPY * age;
		double TPL = galPL / 11000;
		System.out.println("You will consume " + TPL + " Tankers in your life.");
	}
}
