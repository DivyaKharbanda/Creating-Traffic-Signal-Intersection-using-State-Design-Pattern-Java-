package fourWayStreetLights.service;

public class SetCarStopStateImpl implements StreetLightsStateI {

	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeCars(String filename) 
	{
		
	}

	/**
	 * This method will check if the light is green
	 * and according to the direction in input file
	 * , it will just stop the car. 
	 */
	@Override
	public void carStopState(String filename) {
					if(filename.contains("Red light at North"))
					{
			if(StretLightsContext.NorthCars.size()>0)
			{
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "North";
				System.out.println("Current State: "+StretLightsContext.currentState+",Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.NorthCars);
			}
			else 
			{
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "North";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.NorthCars);
			}
					}
			if(filename.contains("Red light at South"))
			{	
			if(StretLightsContext.SouthCars.size()>0)
			{
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "South";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.SouthCars);
			}
			else 
			{
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "South";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.SouthCars);
			}
			}
			if(filename.contains("Red light at West"))
					{
			if(StretLightsContext.WestCars.size()>0)
			{
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "West";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.WestCars);
			}
			else 
			{
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "West";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.WestCars);
			}}
			if(filename.contains("Red light at East"))
			{
			if(StretLightsContext.EastCars.size()>0)
			{
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "East";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.EastCars);
			}
			else 
			{
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "East";
				System.out.println("Current State: "+StretLightsContext.currentState+" ,Current Direction: "+
						StretLightsContext.carDirection);
				System.out.println(StretLightsContext.EastCars);
			}
			}	
	}
}
