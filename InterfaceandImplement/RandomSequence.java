package InterfaceandImplement;

public class RandomSequence implements Sequence
{
   public double next()
   {
      return (double) (Integer.MAX_VALUE * Math.random());
   }
}
