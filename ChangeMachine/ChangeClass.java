
public class ChangeClass 
{
	final private double FIVER_VALUE = 5.00;
	final private double TWO_DOLLAR_VALUE = 2.00;
	final private double DOLLAR_VALUE = 1.00;
	final private double HALF_DOLLAR_VALUE = 0.50;
	final private double QUARTER_VALUE = 0.25;
	final private double DIME_VALUE = 0.10;
	final private double NICKEL_VALUE = 0.05;
	final private double PENNY_VALUE = 0.01;
	final private double HAPENNY_VALUE = 0.005;
	
	/*public ChangeClass(double due, double paid)
	{
		double change = paid - due;
	}*/
	
	public void Fives(double due, double paid)
	{	
		double change = paid - due;
		double fivesBack = change / FIVER_VALUE;
		System.out.printf("Fives: %3.3f" , fivesBack);
	}
	
	public void Twos(double due, double paid)
	{
		double change = paid - due;
		double twosBack = change / TWO_DOLLAR_VALUE;
		System.out.printf("     Twos: %3.3f" , twosBack);
	}
	
	public void Ones(double due, double paid)
	{
		double change = paid - due;
		double onesBack = change / DOLLAR_VALUE;
		System.out.printf("     Ones: %3.3f" , onesBack);
	}
	
	public void HalfDollars(double due, double paid)
	{
		double change = paid - due;
		double halfDollBack = change / HALF_DOLLAR_VALUE;
		System.out.printf("     Half Dollars: %3.3f" , halfDollBack);
	}
	
	public void Quarters(double due, double paid)
	{
		double change = paid - due;
		double quartersBack = change / QUARTER_VALUE;
		System.out.printf("     Quarters: %3.3f" , quartersBack);
	}
	
	public void Dimes(double due, double paid)
	{
		double change = paid - due;
		double dimesBack = change / DIME_VALUE;
		System.out.printf("     Dimes: %3.3f" , dimesBack);
	}
	
	public void Nickels(double due, double paid)
	{
		double change = paid - due;
		double nickelsBack = change / NICKEL_VALUE;
		System.out.printf("     Nickels: %3.3f" , nickelsBack);
	}
	
	public void Pennies(double due, double paid)
	{
		double change = paid - due;
		double penniesBack = change / PENNY_VALUE;
		System.out.printf("     Pennies: %3.3f" , penniesBack);
	}
	
	public void Hapennies(double due, double paid)
	{
		double change = paid - due;
		double hapenniesBack = change / HAPENNY_VALUE;
		System.out.printf("     Hapennies: %3.3f" , hapenniesBack);
	}
}
