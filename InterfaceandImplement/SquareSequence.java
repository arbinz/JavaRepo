package InterfaceandImplement;

public class SquareSequence implements Sequence
{
   private double n;

   public double next()
   {
      n++;
      return n * n; 
   }
}
