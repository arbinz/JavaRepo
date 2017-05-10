package Armies;

public class ProvinceClass
{
	
	// col 0 is the province id. col 1 is the owner id. If 0, there is no
	// owner. col 2 is the armies present
	private int[][] prplProvinces = new int[8][3];
	private int[][] ylwProvinces = new int[5][3];
	private int[][] grnProvinces = new int[9][3];
	private int[][] redProvinces = new int[6][3];
	
	public ProvinceClass()
	{
		for (int c = 1; c < 9; c++)
		{
			prplProvinces[c - 1][0] = c;
		}
		
		for (int d = 1; d < 6; d++)
		{
			ylwProvinces[d - 1][0] = d;
		}
		
		for (int e = 1; e < 10; e++)
		{
			grnProvinces[e - 1][0] = e;
		}
		
		for (int f = 1; f < 7; f++)
		{
			redProvinces[f - 1][0] = f;
		}
	}
	
	public int getProvinceOwner(int continent, int provinceNumber)
	{
		if (continent == 1)
		{
			return prplProvinces[provinceNumber][1];
		}
		else if (continent == 2)
		{
			return ylwProvinces[provinceNumber][1];
		}
		else if (continent == 3)
		{
			return grnProvinces[provinceNumber][1];
		}
		else if (continent == 4)
		{
			return redProvinces[provinceNumber][1];
		}
		else
		{
			return 0;
		}
	}
	
	public void setProvinceOwner(int continent, int playerNumber, int provinceNumber)
	{
		if (continent == 1)
		{
			prplProvinces[provinceNumber][1] = playerNumber;
		}
		else if (continent == 2)
		{
			ylwProvinces[provinceNumber][1] = playerNumber;
		}
		else if (continent == 3)
		{
			grnProvinces[provinceNumber][1] = playerNumber;
		}
		else if (continent == 4)
		{
			redProvinces[provinceNumber][1] = playerNumber;
		}
	}
	
	public int getArmiesPresent(int continent, int provinceNumber)
	{
		if (continent == 1)
		{
			return prplProvinces[provinceNumber][2];
		}
		else if (continent == 2)
		{
			return ylwProvinces[provinceNumber][2];
		}
		else if (continent == 3)
		{
			return grnProvinces[provinceNumber][2];
		}
		else if (continent == 4)
		{
			return redProvinces[provinceNumber][2];
		}
		else
		{
			return 0;
		}
	}
	
	public void setArmiesPresent(int continent, int provinceNumber, int newArmies)
	{
		if (continent == 1)
		{
			prplProvinces[provinceNumber][2] = newArmies;
		}
		else if (continent == 2)
		{
			ylwProvinces[provinceNumber][2] = newArmies;
		}
		else if (continent == 3)
		{
			grnProvinces[provinceNumber][2] = newArmies;
		}
		else if (continent == 4)
		{
			redProvinces[provinceNumber][2] = newArmies;
		}
	}
}
