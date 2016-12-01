package Careers;

public abstract class Driver extends Jobs
{
	protected String vehicleModel;
	protected int vehicleYear;
	protected int passengerCapacity;
	
	abstract public void pickUpPassengers();
	abstract public void dropOffPassengers();
	abstract public void getPassengerAmount();
}
