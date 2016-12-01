package Careers;

public class TaxiDriver extends Driver
{
	int passengers = 0;

	public TaxiDriver()
	{
		super();
		this.vehicleModel = "stereotypical taxi";
		this.vehicleYear = 2000;
		this.passengerCapacity = 3;
	}
	
	@Override
	public void pickUpPassengers()
	{
		passengers+=2;
		
	}

	@Override
	public void doJob()
	{
		System.out.println("You are now a Taxi Driver! you drive a " + vehicleYear + " " + vehicleModel + " that can carry " + passengerCapacity + " passengers!");
		
	}

	@Override
	public void dropOffPassengers()
	{
		passengers-=2;
		
	}

	@Override
	public void getPassengerAmount()
	{
		System.out.println(passengers + " passengers currently");
		
	}
	
}
