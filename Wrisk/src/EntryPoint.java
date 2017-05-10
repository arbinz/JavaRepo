import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
/*
 * import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;
*/

public class EntryPoint
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame();
		
		JButton startButton = new JButton("Start");
		JButton quitButton = new JButton("Quit");
		JPanel mainPanel = new JPanel(new GridLayout(3, 1));
		mainPanel.setBounds(300, 50, 500, 850);
		
		JLabel title = new JLabel("WRISK: CONQUER THE WORLD");
		
		quitButton.addActionListener(new CloseListener());
		
		frame.setSize(1200, 900);
		frame.setTitle("Wrisk: Conquer the World!");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		MainMenu menuBackground = new MainMenu();
		menuBackground.display();
		frame.setLayout(new FlowLayout());
		frame.add(mainPanel);
		
		mainPanel.add(title);
		mainPanel.add(startButton);
		mainPanel.add(quitButton);
		
		mainPanel.setVisible(true);
		frame.setVisible(true);
	}
}

class CloseListener implements ActionListener
{
	@Override
	public void actionPerformed(ActionEvent e)
	{
		System.exit(0);
	}
}
