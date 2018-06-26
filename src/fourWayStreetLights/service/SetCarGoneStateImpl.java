package fourWayStreetLights.service;

public class SetCarGoneStateImpl implements StreetLightsStateI
{
	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCars(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void carStopState(String filename) 
	{
		if(StretLightsContext.NorthCars.size()==0)
		{
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "North";
		}
		if(StretLightsContext.SouthCars.size()==0)
		{
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "South";
		}
		if(StretLightsContext.EastCars.size()==0)
		{
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "East";
		}
		if(StretLightsContext.WestCars.size()==0)
		{
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "West";
		}
	}

}
