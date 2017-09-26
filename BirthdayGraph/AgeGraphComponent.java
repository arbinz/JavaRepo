import javax.swing.JComponent;
import java.awt.Rectangle;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;


public class AgeGraphComponent extends JComponent
{
	public void paintComponent(Graphics g)
	{
		//initialize constant values
		Day today = new Day();
		Graphics2D g2 = (Graphics2D) g;
		
		
		//background and line initialization
		for (int i=30; i<=390; i+=30)
		{
			g2.setColor(Color.BLACK);
			g2.drawString(String.valueOf(i-30),10,i+5);
			Line2D.Double lines = new Line2D.Double(40,i,440,i);
			g2.draw(lines);
		}
		
		
		//initialize birthdays and daysFrom values
		Day markoBday = new Day(2018,2,19);
		int daysToBday = markoBday.daysFrom(today);
		Day jasmineBday = new Day(2017,12,17);
		int jdaysToBday = jasmineBday.daysFrom(today);
		Day mumBday = new Day(2018,7,12);
		int mdaysToBday = mumBday.daysFrom(today);
		Day courtneyBday = new Day(2018,3,21);
		int cdaysToBday = courtneyBday.daysFrom(today);
		Day dadBday = new Day(2017,10,8);
		int ddaysToBday = dadBday.daysFrom(today);
		
		
		
		//construct rectangles
		g2.setColor(Color.ORANGE);
		Rectangle marko = new Rectangle(40,30,75,daysToBday);
		g2.fill(marko);
		g2.setColor(Color.YELLOW);
		Rectangle courtney = new Rectangle(120,30,75,cdaysToBday);
		g2.fill(courtney);
		g2.setColor(Color.RED);
		Rectangle jasmine = new Rectangle(200,30,75,jdaysToBday);
		g2.fill(jasmine);
		g2.setColor(Color.BLUE);
		Rectangle dad = new Rectangle(280,30,75,ddaysToBday);
		g2.fill(dad);
		g2.setColor(Color.CYAN);
		Rectangle mum = new Rectangle(360,30,75,mdaysToBday);
		g2.fill(mum);
		
		//label bars
		g2.setColor(Color.BLACK);
		g2.drawString("Marko",60,25);
		g2.drawString("Courtney",130,25);
		g2.drawString("Jasmine",213,25);
		g2.drawString("Leonard",293,25);
		g2.drawString("Carla",380,25);
		g2.drawString("Mcdowell Family Days to Birthdays", 200, 450);
	}
}
