//import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Balloon 
{
	//initialize labels
	private JFrame frame;
	private JLabel headerlabel;
	private JLabel statuslabel;
	private JPanel controlPanel;
	float i;
	String inflate;
	double volume;
	
	//constructor
	public Balloon()
	{
		prepareGUI();
	}
	
	public static void main(String[] args)
	{
		Balloon swingBalloonCalc = new Balloon();
		swingBalloonCalc.showTextField();
	}
	
	

	private void prepareGUI()
	{
		//initialize the frame
		JFrame frame = new JFrame();
		frame.setSize(500, 500);
		frame.setVisible(true);
		frame.setTitle("BLAARGH");
		frame.setLayout(new GridLayout(3,1));
		//setup the labels
		headerlabel = new JLabel("", JLabel.CENTER);
		statuslabel = new JLabel("", JLabel.CENTER);
		statuslabel.setSize(350,100);
		
		//setup layout
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		//add the controls
		frame.add(headerlabel);
		frame.add(statuslabel);
		frame.add(controlPanel);
		frame.setVisible(true);
	}
		
		//display the controls
		private void showTextField()
		{
			headerlabel.setText("How much do you want to inflate the balloon?");
			
			JLabel inflatelabel = new JLabel("Amount to add to radius of balloon: ", JLabel.CENTER);
			final JTextField inflatetext = new JTextField(3);
			
			//button click listener
			JButton volbutton = new JButton("Calculate Volume");
			volbutton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e) 
				{
					inflate = inflatetext.getText();
					
					Float i = Float.valueOf(inflate);
					volume = i * i * i * Math.PI;
					String data = "Volume: " + inflatetext.getText();
					statuslabel.setText(data);
				}
			});
			controlPanel.add(inflatelabel);
			controlPanel.add(inflatetext);
			controlPanel.add(volbutton);
			
			frame.setVisible(true);
		}
		
		
	}


