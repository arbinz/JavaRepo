import java.util.Arrays;

public class BattleClass
{
	private double attackingArmies;
	private double defendingArmies;
	private boolean attackerWins;
	
	public BattleClass()
	{
	}
	
	public double getAttackingForce(double attackingArmies)
	{
		this.attackingArmies = attackingArmies;
		return attackingArmies;
	}
	
	public double getDefendingForce(double defendingArmies)
	{
		this.defendingArmies = defendingArmies;
		return defendingArmies;
	}
	
	public boolean doBattle(double attackingArmies, double defendingArmies)
	{
		// true means defender loses
		boolean attackerWins = false;
		double[] attackingDice = new double[3];
		double[] defendingDice = new double[3];
		double remainingAttackingDice = 0;
		double remainingDefendingDice = 0;
		
		// set dice numbers
		if (attackingArmies >= 4)
		{
			for (int i = 0; i < 3; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				attackingDice[i] = j;
			}
		}
		
		else if (attackingArmies == 3)
		{
			for (int i = 0; i < 2; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				attackingDice[i] = j;
			}
			attackingDice[2] = 0;
		}
		
		else if (attackingArmies == 2)
		{
			for (int i = 0; i < 1; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				attackingDice[i] = j;
			}
			attackingDice[1] = 0;
			attackingDice[2] = 0;
		}
		
		else if (attackingArmies == 1)
		{
			return attackerWins;
		}
		
		if (defendingArmies >= 3)
		{
			for (int i = 0; i < 3; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				defendingDice[i] = j;
			}
			
		}
		
		else if (defendingArmies == 2)
		{
			for (int i = 0; i < 2; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				defendingDice[i] = j;
			}
			defendingDice[2] = 0;
		}
		
		else
		{
			for (int i = 0; i < 1; i++)
			{
				double j = Math.round(Math.random() * 6);
				
				defendingDice[i] = j;
			}
			
			defendingDice[1] = 0;
			defendingDice[2] = 0;
		}
		
		Arrays.sort(attackingDice);
		Arrays.sort(defendingDice);
		
		for (int i = 0; i < 3; i++)
		{
			if (defendingDice[i] >= attackingDice[i] && defendingDice[1] != 0 && attackingDice[i] != 0)
			{
				remainingAttackingDice--;
			}
			
			if (attackingDice[i] > defendingDice[i] && defendingDice[1] != 0 && attackingDice[i] != 0)
			{
				remainingDefendingDice--;
			}
			
			if (remainingAttackingDice >= 1 && remainingDefendingDice == 0 && defendingDice[1] != 0
					&& attackingDice[i] != 0)
			{
				attackerWins = true;
			}
			
			if (remainingAttackingDice == 1 && remainingDefendingDice > 0 && defendingDice[1] != 0
					&& attackingDice[i] != 0)
			{
				attackerWins = false;
			}
		}
		
		return attackerWins;
	}
}
