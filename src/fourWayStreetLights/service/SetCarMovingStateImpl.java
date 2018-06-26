package fourWayStreetLights.service;

public class SetCarMovingStateImpl implements StreetLightsStateI
{

	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCars(String filename) {
		if(filename.contains("Green light at North"))
				{
		if(StretLightsContext.NorthCars.size()>1)
		{
			StretLightsContext.NorthCars.remove(0);
			StretLightsContext.NorthCars.remove(0);
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "North";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.NorthCars);
			
		}
		else 
		{
			StretLightsContext.NorthCars.clear();
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "North";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.NorthCars);
		}
				}
		if(filename.contains("Green light at South"))
		{	
		if(StretLightsContext.SouthCars.size()>1)
		{
			StretLightsContext.SouthCars.remove(0);
			StretLightsContext.SouthCars.remove(0);
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "South";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.SouthCars);
		}
		else 
		{
			StretLightsContext.SouthCars.clear();
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "South";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.SouthCars);
		}
		}
		if(filename.contains("Green light at West"))
				{
		if(StretLightsContext.WestCars.size()>1)
		{
			StretLightsContext.WestCars.remove(0);
			StretLightsContext.WestCars.remove(0);
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "West";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.WestCars);
		}
		else 
		{
			StretLightsContext.WestCars.clear();
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "West";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.WestCars);
		}}
		if(filename.contains("Green light at East"))
		{
		if(StretLightsContext.EastCars.size()>1)
		{
			StretLightsContext.EastCars.remove(0);
			StretLightsContext.EastCars.remove(0);
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "East";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.EastCars);
		}
		else 
		{
			StretLightsContext.EastCars.clear();
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "East";
			System.out.println("Current State: "+StretLightsContext.currentState+" current Direction: "+
					StretLightsContext.carDirection);
			System.out.println(StretLightsContext.EastCars);
		}
		}
	}

	@Override
	public void carStopState(String filename) {
		// TODO Auto-generated method stub
		
	}


}
