package Careers;

public class BusDriver extends Driver
{
	int passengers = 0;
	
	public BusDriver()
	{
		super();
		this.vehicleModel = "City Bus";
		this.vehicleYear = 1450;
		this.passengerCapacity = 500000;
	}
	
	@Override
	public void pickUpPassengers()
	{
		passengers+=10;
		
	}

	@Override
	public void doJob()
	{
		System.out.println("You are now a Bus Driver! you drive a " + vehicleYear + " " + vehicleModel + " that can carry " + passengerCapacity + " passengers!");
		
	}

	@Override
	public void dropOffPassengers()
	{
		passengers-=10;
		
	}

	@Override
	public void getPassengerAmount()
	{
		System.out.println(passengers + " passengers currently");
		
	}
	
}
