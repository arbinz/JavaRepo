package TicTacToe;

import java.util.Scanner;

public class EntryPoint
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);

		// i is if there is a winner
		boolean i = false;
		// counter to ensure game does not continue after board is full
		int counter = 0;

		int[] nums =
		{ 1, 2, 3 };
		String[][] Board =
		{
				{ "#", "#", "#" },
				{ "#", "#", "#" },
				{ "#", "#", "#" } };
		System.out.println("  1   2   3");
		for (int x = 0; x < 3; x++)
		{
			System.out.printf(nums[x] + " " + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
			System.out.println();
		}
		while (i != true)
		{

			if (counter == 8)
			{
				System.out.println("Game Over! Nobody Wins!");
				i = true;
			}
			System.out.println("What is the x coordinate of the X point?");
			int xCoord = scn.nextInt();
			System.out.println("What is the y coordinate of the X point?");
			int yCoord = scn.nextInt();

			if (Board[yCoord - 1][xCoord - 1].equals("#"))
			{
				Board[yCoord - 1][xCoord - 1] = "x";
				counter++;
			}
			else
			{
				System.out.println("Sorry, That box is filled already! Better luck next round!");
			}

			// test for a winner
			if (Board[0][0].equals("x") && Board[1][1].equals("x") && Board[2][2].equals("x")
					|| Board[0][0].equals("x") && Board[0][1].equals("x") && Board[0][2].equals("x")
					|| Board[1][0].equals("x") && Board[1][1].equals("x") && Board[1][2].equals("x")
					|| Board[2][0].equals("x") && Board[2][1].equals("x") && Board[2][2].equals("x")
					|| Board[0][0].equals("x") && Board[1][0].equals("x") && Board[2][0].equals("x")
					|| Board[0][1].equals("x") && Board[1][1].equals("x") && Board[2][1].equals("x")
					|| Board[0][2].equals("x") && Board[1][2].equals("x") && Board[2][2].equals("x")
					|| Board[2][0].equals("x") && Board[1][1].equals("x") && Board[0][2].equals("x"))
			{
				System.out.println("X Wins!");
				i = true;
			}

			else if (Board[0][0].equals("o") && Board[1][1].equals("o") && Board[2][2].equals("o")
					|| Board[0][0].equals("o") && Board[0][1].equals("o") && Board[0][2].equals("o")
					|| Board[1][0].equals("o") && Board[1][1].equals("o") && Board[1][2].equals("o")
					|| Board[2][0].equals("o") && Board[2][1].equals("o") && Board[2][2].equals("o")
					|| Board[0][0].equals("o") && Board[1][0].equals("o") && Board[2][0].equals("o")
					|| Board[0][1].equals("o") && Board[1][1].equals("o") && Board[2][1].equals("o")
					|| Board[0][2].equals("o") && Board[1][2].equals("o") && Board[2][2].equals("o")
					|| Board[2][0].equals("o") && Board[1][1].equals("o") && Board[0][2].equals("o"))
			{
				System.out.println("O Wins!");
				i = true;
			}
			else if (i != true)
			{
				System.out.println("  1   2   3");

				for (int x = 0; x < 3; x++)
				{
					System.out.printf(
							nums[x] + " " + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
					System.out.println();
				}
			}

			if (counter == 8)
			{
				System.out.println("Game Over! Nobody Wins!");
				i = true;
			}

			if (i != true)
			{
				System.out.println("What is the x coordinate of the o point?");
				xCoord = scn.nextInt();
				System.out.println("What is the y coordinate of the o point?");
				yCoord = scn.nextInt();
				if (Board[yCoord - 1][xCoord - 1].equals("#"))
				{
					Board[yCoord - 1][xCoord - 1] = "o";
					counter++;
				}
				else
				{
					System.out.println("Sorry, That box is filled already! Better luck next round!");
				}

				// test for a winner again
				if (Board[0][0].equals("x") && Board[1][1].equals("x") && Board[2][2].equals("x")
						|| Board[0][0].equals("x") && Board[0][1].equals("x") && Board[0][2].equals("x")
						|| Board[1][0].equals("x") && Board[1][1].equals("x") && Board[1][2].equals("x")
						|| Board[2][0].equals("x") && Board[2][1].equals("x") && Board[2][2].equals("x")
						|| Board[0][0].equals("x") && Board[1][0].equals("x") && Board[2][0].equals("x")
						|| Board[0][1].equals("x") && Board[1][1].equals("x") && Board[2][1].equals("x")
						|| Board[0][2].equals("x") && Board[1][2].equals("x") && Board[2][2].equals("x")
						|| Board[2][0].equals("x") && Board[1][1].equals("x") && Board[0][2].equals("x"))
				{
					System.out.println("X Wins!");
					i = true;
				}

				else if (Board[0][0].equals("o") && Board[1][1].equals("o") && Board[2][2].equals("o")
						|| Board[0][0].equals("o") && Board[0][1].equals("o") && Board[0][2].equals("o")
						|| Board[1][0].equals("o") && Board[1][1].equals("o") && Board[1][2].equals("o")
						|| Board[2][0].equals("o") && Board[2][1].equals("o") && Board[2][2].equals("o")
						|| Board[0][0].equals("o") && Board[1][0].equals("o") && Board[2][0].equals("o")
						|| Board[0][1].equals("o") && Board[1][1].equals("o") && Board[2][1].equals("o")
						|| Board[0][2].equals("o") && Board[1][2].equals("o") && Board[2][2].equals("o")
						|| Board[2][0].equals("o") && Board[1][1].equals("o") && Board[0][2].equals("o"))
				{
					System.out.println("O Wins!");
					i = true;
				}
				else
				{
					System.out.println("  1   2   3");

					for (int x = 0; x < 3; x++)
					{
						System.out.printf(
								nums[x] + " " + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
						System.out.println();
					}
				}
			}
		}
		scn.close();
	}
}
