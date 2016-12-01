import java.util.Scanner;


public class StringSwap 
{
	
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("What are the words you want reversed?");
		String firstWord = sc.nextLine();
		String revWord = "";
		int wordLength = firstWord.length();
		for (int i=0;i<wordLength; i++)
		{
			revWord += firstWord.charAt(wordLength-i-1);
		}
		System.out.println(revWord);
		sc.close();
	}
}
