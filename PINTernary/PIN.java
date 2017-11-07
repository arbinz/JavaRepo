import java.util.Scanner;

//This is P5.9 from the Big Java 5th Edition
class PIN
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int failedAttempts = 0;
		boolean Running = true;

		while (Running == true)
		{
			if(failedAttempts < 3)
			{
				System.out.println("INSERT PIN");
				int input = sc.nextInt();
				String out = input == 1234 ? "Your PIN is Correct" : "Your PIN is incorrect";
				System.out.println(out);
				if (out.equals("Your PIN is Correct"))
				{
					Running = false;
					sc.close();
				}
				failedAttempts++;
			}

			else
			{
				System.out.println("YOUR CARD HAS BEEN BLOCKED");
				Running = false;	
				sc.close();
			}
		}	
		
	}
}
