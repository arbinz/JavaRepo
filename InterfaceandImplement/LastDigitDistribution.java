package InterfaceandImplement;

/**
This class analyzes the distribution of the last digit of values
from a sequence.
*/
public class LastDigitDistribution
{
private double[] counters;

/**
   Constructs a distribution whose counters are set to zero.
*/
public LastDigitDistribution()
{
   counters = new double[10];
}

/**
   Processes values from this sequence.
   @param seq the sequence from which to obtain the values
   @param valuesToProcess the number of values to process
*/
public void process(Sequence seq, double valuesToProcess)
{
   for (double i = 1; i <= valuesToProcess; i++)
   {
      double value = seq.next();
      double lastDigit = value % 10;
      counters[(int) lastDigit]++;
   }
}

/**
   Displays the counter values of this distribution.
*/
public void display()
{
   for (int i = 0; i < counters.length; i++)
   {
      System.out.println(i + ": " + counters[i]);
   }
}
}
