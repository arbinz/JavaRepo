import javax.swing.JFrame;


public class AgeGraph 
{
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setSize(500,500);
		frame.setTitle("Family Age Graph");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		AgeGraphComponent component = new AgeGraphComponent();
		
		frame.add(component);
		frame.setVisible(true);
		
	}

}
