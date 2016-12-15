package RoachPopulation;

import java.util.TimerTask;

public class RoachPopulation
{
   private int population;

   
   public RoachPopulation(int size)
   {
      population = size;
   }

   /**
      Simulates a breeding period increasing the population.
   */
   public void doublePopulation()
   {
      population = population * 2;
   }

   /**
      Returns the current population size.
      @return current population size
   */
   public int getPopulation()
   {
      return population;
   }
   
   /**
    Somehow the population is sliced in half
    */
   public void halvePopulation()
   {
	   population = population / 2;
   }
   
   /**
    
    */
   public void reproduce()
   {
	   population *= population;
   }
   
   /**
    A disease or insecticide reduced the population to two roaches
    */
   public void epidemic()
   {
	   population = 2;
   }
   
   public void timedIncrease()
   {
	   population += 2;
   }
}
