package IOTextSaving;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class IOTester
{
	// GUI Components
	private JFrame mainFrame;
	private JLabel headerLabel;
	private JLabel statusLabel;
	private JPanel control1;
	private JPanel control2;
	private JPanel control3;
	private String data;
	private String nameData;
	private String colourData;
	private String foodData;
	// io globals
	Properties prop = new Properties();
	OutputStream output = null;
	InputStream input = null;
	
	public static void main(String[] args)
	{
		IOTester ioTest = new IOTester();
		ioTest.controlSetup();
	}
	
	private void controlSetup()
	{
		headerLabel.setText("Welcome to the IO Tester!");
		JLabel name = new JLabel("First Name: ");
		final JTextField NAME_TEXT = new JTextField(12);
		
		JLabel favouriteColour = new JLabel("Favourite Colour: ");
		final JTextField COLOUR_TEXT = new JTextField(12);
		
		JLabel favouriteFood = new JLabel("Favourite Food: ");
		final JTextField FOOD_TEXT = new JTextField(12);
		
		JButton nameButton = new JButton("Submit!");
		nameButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				nameData = NAME_TEXT.getText();
				statusLabel.setText(nameData);
				try
				{
					input = new FileInputStream("inputText.txt");
					prop.load(input);
					mainFrame = new JFrame(prop.getProperty("name"));
				} catch (IOException ex)
				{
					ex.printStackTrace();
				} finally
				{
					
				}
			}
		});
		
		JButton colourButton = new JButton("Submit!");
		colourButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				colourData = COLOUR_TEXT.getText();
				statusLabel.setText(colourData);
				
			}
		});
		
		JButton foodButton = new JButton("Submit!");
		foodButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent e)
			{
				foodData = FOOD_TEXT.getText();
				statusLabel.setText(foodData);
			}
		});
		
		control1.add(name);
		control1.add(NAME_TEXT);
		control1.add(nameButton);
		
		control2.add(favouriteColour);
		control2.add(COLOUR_TEXT);
		control2.add(colourButton);
		
		control3.add(favouriteFood);
		control3.add(FOOD_TEXT);
		control3.add(foodButton);
		
		mainFrame.setVisible(true);
	}
	
	// Constructor
	public IOTester()
	{
		prepareGUI();
	}
	
	private void prepareGUI()
	{
		
		mainFrame = new JFrame();
		mainFrame.setTitle("");
		mainFrame.setSize(500, 500);
		mainFrame.setLayout(new GridLayout(5, 1));
		
		headerLabel = new JLabel("", JLabel.CENTER);
		statusLabel = new JLabel("", JLabel.CENTER);
		
		control1 = new JPanel();
		control1.setLayout(new FlowLayout());
		
		control2 = new JPanel();
		control2.setLayout(new FlowLayout());
		
		control3 = new JPanel();
		control3.setLayout(new FlowLayout());
		
		mainFrame.add(headerLabel);
		mainFrame.add(control1);
		mainFrame.add(control2);
		mainFrame.add(control3);
		mainFrame.add(statusLabel);
		
		mainFrame.setVisible(true);
	}
	
}
