//made by Will Mulcock, revised by Marko McDowell
public class Player
{
	/*
	 * the player class stores information about the players, like the name,
	 * army count, province count, and it will have the array that identifies
	 * what territories are owned. This will be measured in a binary-type list,
	 * with 1 for owned, and 0 for unowned by the player
	 */
	
	// initialize member variables
	private String name;
	private int armyCount;
	private boolean active;
	private int provinceCount;
	public int playerValue;
	
	// declare main player class, for first time only
	public void player(int playerValue, String name, int armyCount, int provinceCount)
	{
		this.playerValue = playerValue;
		this.name = name;
		this.armyCount = armyCount;
		this.provinceCount = provinceCount;
		active = true;
	}
	
	// army get/set
	public void setArmyCount(int change)
	{
		armyCount += change;
	}
	
	public int getArmyCount()
	{
		return armyCount;
	}
	
	// province get
	public int getProvinceCount()
	{
		return provinceCount;
	}
	
	// active get/set
	public void setActive(boolean set)
	{
		active = set;
	}
	
	public boolean getActive()
	{
		return active;
	}
	
	// get name, DO NOT MAKE A SET NAME
	public String getName()
	{
		return name;
	}
}
