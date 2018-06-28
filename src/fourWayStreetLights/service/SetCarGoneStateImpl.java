package fourWayStreetLights.service;

import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Logger.DebugLevel;

public class SetCarGoneStateImpl implements StreetLightsStateI
{
	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}
	DebugLevel GoneState = null;
	@Override
	public void removeCars(String filename) {
		// TODO Auto-generated method stub
		
	}
	/**
	 * if the number of cars is equal to 0, then
	 * cars will go in Gone state
	 */
	@Override
	public void carStopState(String filename) 
	{
		if((StretLightsContext.NorthCars.size()==0) && (StretLightsContext.SouthCars.size()==0) 
				&& (StretLightsContext.EastCars.size()==0) && (StretLightsContext.WestCars.size()==0) )
		{
			String message = "---------------------------------------";
			Logger.writeMessage(message, GoneState);
			StretLightsContext.currentState = StretLightsContext.Gone;
			message = StretLightsContext.currentState+" from all the directions";
			Logger.writeMessage(message, GoneState);
		}		
	}
}
