
package Careers;

public class ExecuteOrder66
{
	public static void main(String[] args)
	{
		TaxiDriver t1 = new TaxiDriver();
		t1.doJob();
		t1.pickUpPassengers();
		t1.getPassengerAmount();
		t1.dropOffPassengers();
		
		BusDriver b1 = new BusDriver();
		b1.doJob();
		b1.pickUpPassengers();
		b1.getPassengerAmount();
		b1.dropOffPassengers();
	}
}
