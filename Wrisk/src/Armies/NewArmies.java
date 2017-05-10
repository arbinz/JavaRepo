package Armies;

public class NewArmies
{
	int currentProvinceTotal;
	int currentNewArmies;
	ProvinceClass p = new ProvinceClass();
	
	public NewArmies(int currentProvinceTotal)
	{
		currentProvinceTotal = this.currentProvinceTotal;
	}
	
	public int getNewArmies()
	{
		if (currentProvinceTotal >= 9)
		{
			currentProvinceTotal /= 3;
			return currentProvinceTotal;
		}
		else
		{
			currentNewArmies = 3;
			return currentNewArmies;
		}
	}
	
	public int PrplContinentNewArmies(int player)
	{
		int j = 0;
		int k = 0;
		for (int i = 0; i < 8; i++)
		{
			if (p.getProvinceOwner(1, i) == player)
			{
				k++;
			}
		}
		if (k == 8)
		{
			j = 6;
		}
		else
		{
			j = 0;
		}
		return j;
	}
	
	public int YlwContinentNewArmies(int player)
	{
		int j = 0;
		int k = 0;
		for (int i = 0; i < 8; i++)
		{
			if (p.getProvinceOwner(1, i) == player)
			{
				k++;
			}
		}
		if (k == 5)
		{
			j = 4;
		}
		else
		{
			j = 0;
		}
		return j;
	}
	
	public int GrnContinentNewArmies(int player)
	{
		int j = 0;
		int k = 0;
		for (int i = 0; i < 8; i++)
		{
			if (p.getProvinceOwner(1, i) == player)
			{
				k++;
			}
		}
		if (k == 9)
		{
			j = 7;
		}
		else
		{
			j = 0;
		}
		return j;
	}
	
	public int RedContinentNewArmies(int player)
	{
		int j = 0;
		int k = 0;
		for (int i = 0; i < 8; i++)
		{
			if (p.getProvinceOwner(1, i) == player)
			{
				k++;
			}
		}
		if (k == 6)
		{
			j = 4;
		}
		else
		{
			j = 0;
		}
		return j;
	}
	
	// Card income
	public int CardIncome(boolean usingCards, int playerNum)
	{
		// first col is prov num, second is prov owner
		int[][] prplCards = new int[8][2];
		int[][] ylwCards = new int[5][2];
		int[][] grnCards = new int[9][2];
		int[][] redCards = new int[6][2];
		
		int returner = 0;
		
		// populate the first column
		for (int i = 1; i < 9; i++)
		{
			prplCards[i - 1][0] = i;
		}
		
		for (int i = 1; i < 6; i++)
		{
			ylwCards[i - 1][0] = i;
		}
		
		for (int i = 1; i < 10; i++)
		{
			grnCards[i - 1][0] = i;
		}
		
		for (int i = 1; i < 7; i++)
		{
			redCards[i - 1][0] = i;
		}
		
		for (int continentNum = 1; continentNum <= 4; continentNum++)
		{
			// test for card sets
			if (usingCards == true && continentNum == 1)
			{
				int ticker = 0;
				
				for (int c = 0; c < 8; c++)
				{
					if (prplCards[c][1] == playerNum)
					{
						ticker++;
					}
				}
				if (ticker >= 3)
				{
					returner += 8;
				}
			}
			
			else if (usingCards == true && continentNum == 2)
			{
				int ticker = 0;
				for (int c = 0; c < 5; c++)
				{
					if (ylwCards[c][1] == playerNum)
					{
						ticker++;
					}
				}
				if (ticker >= 3)
				{
					returner += 8;
				}
			}
			
			else if (usingCards == true && continentNum == 3)
			{
				int ticker = 0;
				for (int c = 0; c < 9; c++)
				{
					if (ylwCards[c][1] == playerNum)
					{
						ticker++;
					}
				}
				if (ticker >= 3)
				{
					returner += 8;
				}
			}
			
			else if (usingCards == true && continentNum == 4)
			{
				int ticker = 0;
				for (int c = 0; c < 6; c++)
				{
					if (ylwCards[c][1] == playerNum)
					{
						ticker++;
					}
				}
				if (ticker >= 3)
				{
					returner += 8;
				}
			}
			
			else
			{
				returner += 0;
			}
		}
		return returner;
	}
}
