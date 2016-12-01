import java.util.Scanner;

public class EntryPoint
{
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		
		
		//i is if x has won
		boolean i = false;
		//j is if o has won
		boolean j = false;
		
		int[] nums = {1, 2, 3};
		String[][] Board = {
				{"#", "#", "#"},
				{"#", "#", "#"},
				{"#", "#", "#"}
		};
		System.out.println(" 1   2   3");
		for (int x = 0; x < 3; x++)
		{
			System.out.printf(nums[x] + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
			System.out.println();
		}
		while (i != true && j != true)
			{
				
				
				System.out.println("What is the x coordinate of the X point?");
				int xCoord = scn.nextInt();
				System.out.println("What is the y coordinate of the X point?");
				int yCoord = scn.nextInt();
				if (Board[yCoord-1][xCoord-1].equals("#"))
				{
					Board[yCoord-1][xCoord-1] = "x";
				}
				else
				{
					System.out.println("Sorry, That box is filled already! Better luck next round!");
				}
				
				//test for a winner
				if(Board[0][0].equals("x") && Board[1][1].equals("x") && Board[2][2].equals("x") || Board[0][0].equals("x") && Board[0][1].equals("x") && Board[0][2].equals("x") || Board[1][0].equals("x") && Board[1][1].equals("x") && Board[1][2].equals("x") || Board[2][0].equals("x") && Board[2][1].equals("x") && Board[2][2].equals("x") || Board[0][0].equals("x") && Board[1][0].equals("x") && Board[2][0].equals("x") || Board[0][1].equals("x") && Board[1][1].equals("x") && Board[2][1].equals("x") || Board[0][2].equals("x") && Board[1][2].equals("x") && Board[2][2].equals("x") || Board[2][0].equals("x") && Board[1][1].equals("x") && Board[0][2].equals("x"))
				{
					System.out.println("X Wins!");
					i = true;
				}
				
				else if(Board[0][0].equals("o") && Board[1][1].equals("o") && Board[2][2].equals("o") || Board[0][0].equals("o") && Board[0][1].equals("o") && Board[0][2].equals("o") || Board[1][0].equals("o") && Board[1][1].equals("o") && Board[1][2].equals("o") || Board[2][0].equals("o") && Board[2][1].equals("o") && Board[2][2].equals("o") || Board[0][0].equals("o") && Board[1][0].equals("o") && Board[2][0].equals("o") || Board[0][1].equals("o") && Board[1][1].equals("o") && Board[2][1].equals("o") || Board[0][2].equals("o") && Board[1][2].equals("o") && Board[2][2].equals("o") || Board[2][0].equals("o") && Board[1][1].equals("o") && Board[0][2].equals("o"))
				{
					System.out.println("O Wins!");
					j = true;
				}
				else
				{
					System.out.println(" 1   2   3");
				
					for (int x = 0; x < 3; x++)
					{
							System.out.printf(nums[x] + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
							System.out.println();
					}
				}
				System.out.println("What is the x coordinate of the o point?");
				xCoord = scn.nextInt();
				System.out.println("What is the y coordinate of the o point?");
				yCoord = scn.nextInt();
				if (Board[yCoord-1][xCoord-1].equals("#"))
				{
					Board[yCoord-1][xCoord-1] = "o";
				}
				else
				{
					System.out.println("Sorry, That box is filled already! Better luck next round!");
				}
				
				//test for a winner again
				if(Board[0][0].equals("x") && Board[1][1].equals("x") && Board[2][2].equals("x") || Board[0][0].equals("x") && Board[0][1].equals("x") && Board[0][2].equals("x") || Board[1][0].equals("x") && Board[1][1].equals("x") && Board[1][2].equals("x") || Board[2][0].equals("x") && Board[2][1].equals("x") && Board[2][2].equals("x") || Board[0][0].equals("x") && Board[1][0].equals("x") && Board[2][0].equals("x") || Board[0][1].equals("x") && Board[1][1].equals("x") && Board[2][1].equals("x") || Board[0][2].equals("x") && Board[1][2].equals("x") && Board[2][2].equals("x") || Board[2][0].equals("x") && Board[1][1].equals("x") && Board[0][2].equals("x"))
				{
					System.out.println("X Wins!");
					i = true;
				}
				
				else if(Board[0][0].equals("o") && Board[1][1].equals("o") && Board[2][2].equals("o") || Board[0][0].equals("o") && Board[0][1].equals("o") && Board[0][2].equals("o") || Board[1][0].equals("o") && Board[1][1].equals("o") && Board[1][2].equals("o") || Board[2][0].equals("o") && Board[2][1].equals("o") && Board[2][2].equals("o") || Board[0][0].equals("o") && Board[1][0].equals("o") && Board[2][0].equals("o") || Board[0][1].equals("o") && Board[1][1].equals("o") && Board[2][1].equals("o") || Board[0][2].equals("o") && Board[1][2].equals("o") && Board[2][2].equals("o") || Board[2][0].equals("o") && Board[1][1].equals("o") && Board[0][2].equals("o"))
				{
					System.out.println("O Wins!");
					j = true;
				}
				else
				{
					System.out.println(" 1   2   3");
				
					for (int x = 0; x < 3; x++)
					{
							System.out.printf(nums[x] + Board[x][0] + "   " + Board[x][1] + "   " + Board[x][2]);
							System.out.println();
					}
				}
			}
		scn.close();
	}
}

