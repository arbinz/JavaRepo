import java.util.Scanner;

public class NumReverse 
{
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		Boolean c = true;
		while(c)
		{
			System.out.println("What number between 1,000 and 999,999 do you want to delete the commas from?");
		
			String num = sc.nextLine();
			String noCommaNum = num.replaceAll(",", "");
			System.out.println(noCommaNum);
			System.out.println("Do you want to calculate again? y/n");
			String play = sc.nextLine();
			if (play.equals("n"))
			{
				c = false;
			}

		}
		sc.close();
	}
}
