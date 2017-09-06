package TankerCalc;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

public class TankerCalc 
{
	//controls for app
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel controlPanel;
	float expectedLongevity;
	float age;
	float fluidIntake;
	float gallonIntake;
	float annualIntake;
	float yearsLeft;
	float gallonsBeforeDeath;
	float tankersBeforeDeath;
	
	//constructor
	public TankerCalc()
	{
		prepareGUI();
	}
	
	//entry point
	public static void main(String[] args)
	{
		TankerCalc swingTankerCalc = new TankerCalc();
		swingTankerCalc.showTextField();
	}
	
	//set up gui  environment
	private void prepareGUI()
	{
		//set up app frame
		mainFrame = new JFrame("Tanker Truck Calculator");
		mainFrame.setSize(600,400);
		mainFrame.setLayout(new GridLayout(3,1));
		//setup labels
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		statusLabel.setSize(350,100);
		//setup layout
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		//add controls
		mainFrame.add(headerLabel);
		mainFrame.add(statusLabel);
		mainFrame.add(controlPanel);
		mainFrame.setVisible(true);
	}
	
	//display controls
	private void showTextField()
	{
		headerLabel.setText("Why are you here? Go home!");
		
		//set values for controls
		JLabel ageLabel = new JLabel("Expected age of death:", JLabel.RIGHT);
		JLabel ozLabel = new JLabel("Ounces per day:", JLabel.LEFT);
		final JTextField ageText = new JTextField(3);
		final JTextField ozText = new JTextField(3);
		
		JButton calcButton = new JButton("Calculate");
		//action listener for button click
		calcButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				age = Integer.parseInt(ageText.getText());
				fluidIntake = Integer.parseInt(ozText.getText());
				gallonIntake = fluidIntake / 128;
				annualIntake = gallonIntake * 365;
				gallonsBeforeDeath = annualIntake * age;
				tankersBeforeDeath = gallonsBeforeDeath / 11000;
				String data = "Age at death: " + ageText.getText();
				data += ", Ounces per day: "
						+ new String(ozText.getText()) + ", Tankers Before Death: " + tankersBeforeDeath;
				statusLabel.setText(data);
			}
		});
		//place controls on panels
		controlPanel.add(ageLabel);
		controlPanel.add(ageText);
		controlPanel.add(ozLabel);
		controlPanel.add(ozText);
		controlPanel.add(calcButton);
		
		//set visibility
		mainFrame.setVisible(true);
	}
}
