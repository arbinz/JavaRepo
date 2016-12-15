package RoachPopulation;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.GridLayout;

/**
   This program displays the growth of a roach population. 
*/
public class RoachPopulationViewer
{
   private static final int FRAME_WIDTH = 400;
   private static final int FRAME_HEIGHT = 250;
   

   public static void main(String[] args)
   {
      JFrame frame = new JFrame();
      

      JButton button = new JButton("Double roach population!");
      JButton butt2 = new JButton("Kill half of all Roaches!");
      JButton butt3 = new JButton("MASSIVE POPULATION BOOM!");
      JButton butt4 = new JButton("Exterminators! Help!");

      final RoachPopulation roachPopulation = new RoachPopulation(2);

      // The label for displaying the results
      final JLabel label = new JLabel("Population: "
            + roachPopulation.getPopulation(), JLabel.CENTER);

      // The panel that holds the user interface components
      JPanel panel = new JPanel();
      panel.setSize(400,250);
      panel.setLayout(new GridLayout(5,1));
      panel.add(label);
      
      panel.add(button);
      panel.add(butt2);
      panel.add(butt3);
      panel.add(butt4);
      frame.add(panel);

      class PopulationDoublerListener implements ActionListener
      {
         public void actionPerformed(ActionEvent event)
         {
            roachPopulation.doublePopulation();
            label.setText("population: " + roachPopulation.getPopulation());
         }
      }
      
      class PopulationReductionListener implements ActionListener
      {
    	  public void actionPerformed(ActionEvent event)
    	  {
    		  roachPopulation.halvePopulation();
    		  label.setText("population: " + roachPopulation.getPopulation());
    	  }
      }
      
      class PopulationBoomListener implements ActionListener
      {
    	  public void actionPerformed(ActionEvent event)
    	  {
    		  roachPopulation.reproduce();
    		  label.setText("population: " + roachPopulation.getPopulation());
    	  }
      }
      
      class EpidemicListener implements ActionListener
      {
    	  public void actionPerformed(ActionEvent event)
    	  {
    		  roachPopulation.epidemic();
    		  label.setText("population: " + roachPopulation.getPopulation());
    	  }
      }
      
      Timer timer = new Timer();
      timer.scheduleAtFixedRate(new TimerTask() {
    	  @Override
    	  public void run()
    	  {
    		  roachPopulation.timedIncrease();
    		  label.setText("Population: " + roachPopulation.getPopulation());
    	  }
      }, 2500,2500);

      ActionListener listener = new PopulationDoublerListener();
      ActionListener listener2 = new PopulationReductionListener();
      ActionListener listener3 = new PopulationBoomListener();
      ActionListener listener4 = new EpidemicListener();
      button.addActionListener(listener);
      butt2.addActionListener(listener2);
      butt3.addActionListener(listener3);
      butt4.addActionListener(listener4);

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}
