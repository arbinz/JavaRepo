import java.awt.Rectangle;

public class rectangle 
{
	public static void main(String[] args)
	{
		Rectangle r = new Rectangle(5,5,5,5);
		System.out.println(r);
		Rectangle r2 = r;
		r.setSize(10, 10);
		System.out.println(r2);
	}
}
