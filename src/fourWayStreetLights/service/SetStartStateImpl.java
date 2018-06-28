package fourWayStreetLights.service;

import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Logger.DebugLevel;

/**
 * this method will add the cars in specific directions according to
 * the input file ex. north, south direction
 * The first parameter added is the file attribute
 */
public class SetStartStateImpl implements StreetLightsStateI
{
	DebugLevel StartState = null;
	@Override
	public void insertNewCar(String filename) 
	{
		if(filename.contains(", North"))
		{
			StretLightsContext.NorthCars.add(filename.split(",")[0]);
			String message = "Adding Car"+(filename.split(",")[0])+" in North Direction";
			Logger.writeMessage(message, StartState);	
		}
		if(filename.contains(", South"))
		{
			StretLightsContext.SouthCars.add(filename.split(",")[0]);
			String message = "Adding Car"+(filename.split(",")[0])+" in South Direction";
			Logger.writeMessage(message, StartState);	
		}
		if(filename.contains(", East"))
		{
			StretLightsContext.EastCars.add(filename.split(",")[0]);
			String message = "Adding Car"+(filename.split(",")[0])+" in East Direction";
			Logger.writeMessage(message, StartState);	
		}
		if(filename.contains(", West"))
		{
			StretLightsContext.WestCars.add(filename.split(",")[0]);
			String message = "Adding Car"+(filename.split(",")[0])+" in West Direction";
			Logger.writeMessage(message, StartState);	
		}
	}
	@Override
	public void carStopState(String filename) {	
	}

	@Override
	public void removeCars(String filename) {
	}
	
}
