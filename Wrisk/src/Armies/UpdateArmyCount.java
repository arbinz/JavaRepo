package Armies;

public class UpdateArmyCount
{
	int oldArmies;
	int newArmies;
	
	public UpdateArmyCount(int oldArmies, int newArmies)
	{
		oldArmies = this.oldArmies;
		newArmies = this.newArmies;
	}
	
	// This adds new armies as given by the user
	public int increaseArmyCount(int oldArmies, int newArmies)
	{
		oldArmies += newArmies;
		return oldArmies;
	}
}
