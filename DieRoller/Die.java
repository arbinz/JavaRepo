import java.util.Random;

public class Die
{
	
	
	private Random generator;
	private int sides;
	public Die(int s)
	{
		sides = s;
		generator = new Random();
	}

	public int cast()
	{
		return 1 + generator.nextInt(sides);
	}

}

public class DieSimulator
{
	public static void main(String[] args)
	{
		Die d = new Die(6);
		final int TRIES = 10;
		for (int i = 1; i <= TRIES; i++)
		{
			int n = d.cast();
			System.out.print(n + " ");
		}
		System.out.println();
	}
}
