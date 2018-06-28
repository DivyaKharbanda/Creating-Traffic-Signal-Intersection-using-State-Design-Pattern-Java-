package fourWayStreetLights.service;

import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Logger.DebugLevel;

public class SetCarStopStateImpl implements StreetLightsStateI {

	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}
	
	
	@Override
	public void removeCars(String filename) 
	{
		
	}
	DebugLevel StopState;
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
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "North";
				String message = "Current State: "+StretLightsContext.currentState+" at "
				+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, StopState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
				StretLightsContext.currentState = StretLightsContext.Gone;
				message = "All Cars are stopped in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, StopState);
				message = "Cars left in "+StretLightsContext.carDirection+" Direction: "+StretLightsContext.NorthCars;
				Logger.writeMessage(message, StopState);
			}
			else 
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "North";
				String message = "Current State: "+StretLightsContext.currentState+" at "
				+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, StopState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "North";
				message = StretLightsContext.currentState+" at "
				+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, StopState);
			}
					}
			if(filename.contains("Red light at South"))
			{	
				if(StretLightsContext.SouthCars.size()>0)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "South";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					message = "All Cars are stopped in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					message = "Cars left in "+StretLightsContext.carDirection+" Direction: "+StretLightsContext.SouthCars;
					Logger.writeMessage(message, StopState);
				}
				else 
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "South";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "South";
					message = StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
				}
			}
			if(filename.contains("Red light at West"))
					{
				if(StretLightsContext.WestCars.size()>0)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "West";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					message = "All Cars are stopped in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					message = "Cars left in "+StretLightsContext.carDirection+" Direction: "+StretLightsContext.WestCars;
					Logger.writeMessage(message, StopState);
				}
				else 
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "West";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "West";
					message = StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
				}}
			if(filename.contains("Red light at East"))
				if(StretLightsContext.NorthCars.size()>0)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "East";
					message = "All Cars are stopped in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					message = "Cars left in "+StretLightsContext.carDirection+" Direction: "+StretLightsContext.EastCars;
					Logger.writeMessage(message, StopState);
				}
				else 
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarGoneStateImpl());
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "East";
					message = StretLightsContext.currentState+" at "
					+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, StopState);
				}
	}
}
