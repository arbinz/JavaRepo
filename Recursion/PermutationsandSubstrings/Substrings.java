import java.util.Scanner;

public class Substrings
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Computer! Tell me the substring of:");
		String str = sc.next();
		sbstr(str);
		sc.close();
	}
	
	public static void sbstr(String word)
	{
		if (word.length() == 1)
		{
			System.out.println(word);
			return;
		} else
		{
			System.out.println(word);
			sbstr(word.substring(0, word.length() - 1));
			sbstr(word.substring(1, word.length()));
		}
		
	}
	
}
