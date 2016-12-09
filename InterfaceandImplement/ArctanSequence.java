package InterfaceandImplement;

public class ArctanSequence implements Sequence
{

	private double n;
	@Override
	public double next()
	{
		return Math.atan(n);
	}
	
}
