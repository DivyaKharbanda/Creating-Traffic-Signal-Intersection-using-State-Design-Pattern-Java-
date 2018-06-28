package fourWayStreetLights.service;

import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Logger.DebugLevel;

public class SetCarMovingStateImpl implements StreetLightsStateI
{
//
//	SetStartStateImpl SetStartStateImplObj = new SetStartStateImpl();
//	SetCarMovingStateImpl Green = new SetCarMovingStateImpl();
//	SetCarStopStateImpl Red = new SetCarStopStateImpl();
//	SetCarGoneStateImpl All_Cars_Gone = new SetCarGoneStateImpl();
	@Override
	public void insertNewCar(String filename) {
		// TODO Auto-generated method stub
		
	}
	DebugLevel MovingState;
	/**
	 * This method will check if the light is green
	 * and according to the direction in input file
	 * , it will let 2 cars to go ahead
	 * The first parameter added is the file attribute
	 */
	@Override
	public void removeCars(String filename) {
		if(filename.contains("Green light at North"))
				{
		if(StretLightsContext.NorthCars.size()>2)
		{
			StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "North";
			String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			message = "Car"+StretLightsContext.NorthCars.get(0)+" is moving";
			Logger.writeMessage(message, MovingState);
			StretLightsContext.NorthCars.remove(0);
			
			message = "Car"+StretLightsContext.NorthCars.get(0)+" is moving";
			Logger.writeMessage(message, MovingState);
			StretLightsContext.NorthCars.remove(0);
			
			StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
			StretLightsContext.currentState = StretLightsContext.Stop;
			StretLightsContext.carDirection = "North";
			message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			message = "Car left in "+StretLightsContext.carDirection+":"+(StretLightsContext.NorthCars);
			Logger.writeMessage(message, MovingState);
		}
		else if(StretLightsContext.NorthCars.size()==2)
		{
			StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "North";
			String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			message = "Car"+StretLightsContext.NorthCars.get(0)+" is moving";
			Logger.writeMessage(message, MovingState);
			StretLightsContext.NorthCars.remove(0);
			
			message = "Car"+StretLightsContext.NorthCars.get(0)+" is moving";
			Logger.writeMessage(message, MovingState);
			StretLightsContext.NorthCars.remove(0);
		
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "North";
			message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
			StretLightsContext.currentState = StretLightsContext.Stop;
			message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
		}
		else if(StretLightsContext.NorthCars.size()==1)
		{
			StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "North";
			String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			message = "Car"+StretLightsContext.NorthCars.get(0)+" is moving";
			Logger.writeMessage(message, MovingState);
			StretLightsContext.NorthCars.remove(0);

			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "North";
			message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
			StretLightsContext.currentState = StretLightsContext.Stop;
			message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
		}
		else if(StretLightsContext.NorthCars.size()==0)
		{
			StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
			StretLightsContext.currentState = StretLightsContext.Moving;
			StretLightsContext.carDirection = "North";
			String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			StretLightsContext.currentState = StretLightsContext.Gone;
			StretLightsContext.carDirection = "North";
			message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
			
			StretLightsContext.currentState = StretLightsContext.Stop;
			message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
			Logger.writeMessage(message, MovingState);
		}			
	}
	
		if(filename.contains("Green light at South"))
		{	
			if(StretLightsContext.SouthCars.size()>2)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "South";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.SouthCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.SouthCars.remove(0);
				
				message = "Car"+StretLightsContext.SouthCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.SouthCars.remove(0);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "South";
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car left in "+StretLightsContext.carDirection+":"+(StretLightsContext.SouthCars);
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.SouthCars.size()==2)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "South";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.SouthCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.SouthCars.remove(0);
				
				message = "Car"+StretLightsContext.SouthCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.SouthCars.remove(0);
			
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "South";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.SouthCars.size()==1)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "South";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.SouthCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.SouthCars.remove(0);

				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "South";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.SouthCars.size()==0)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "South";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "South";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}		
		}
		
		if(filename.contains("Green light at West"))
		{
			if(StretLightsContext.WestCars.size()>2)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "West";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.WestCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.WestCars.remove(0);
				
				message = "Car"+StretLightsContext.WestCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.WestCars.remove(0);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				StretLightsContext.carDirection = "West";
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car left in "+StretLightsContext.carDirection+":"+(StretLightsContext.WestCars);
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.WestCars.size()==2)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "West";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.WestCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.WestCars.remove(0);
				
				message = "Car"+StretLightsContext.WestCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.WestCars.remove(0);
			
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "West";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.WestCars.size()==1)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "West";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				message = "Car"+StretLightsContext.WestCars.get(0)+" is moving";
				Logger.writeMessage(message, MovingState);
				StretLightsContext.WestCars.remove(0);

				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "West";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}
			else if(StretLightsContext.WestCars.size()==0)
			{
				StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
				StretLightsContext.currentState = StretLightsContext.Moving;
				StretLightsContext.carDirection = "West";
				String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.currentState = StretLightsContext.Gone;
				StretLightsContext.carDirection = "West";
				message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
				
				StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
				StretLightsContext.currentState = StretLightsContext.Stop;
				message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
				Logger.writeMessage(message, MovingState);
			}			
		}
		
			if(filename.contains("Green light at East"))
		{
				if(StretLightsContext.EastCars.size()>2)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
					StretLightsContext.currentState = StretLightsContext.Moving;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					message = "Car"+StretLightsContext.EastCars.get(0)+" is moving";
					Logger.writeMessage(message, MovingState);
					StretLightsContext.EastCars.remove(0);
					
					message = "Car"+StretLightsContext.EastCars.get(0)+" is moving";
					Logger.writeMessage(message, MovingState);
					StretLightsContext.EastCars.remove(0);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					StretLightsContext.carDirection = "East";
					message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					message = "Car left in "+StretLightsContext.carDirection+":"+(StretLightsContext.EastCars);
					Logger.writeMessage(message, MovingState);
				}
				else if(StretLightsContext.EastCars.size()==2)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
					StretLightsContext.currentState = StretLightsContext.Moving;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					message = "Car"+StretLightsContext.EastCars.get(0)+" is moving";
					Logger.writeMessage(message, MovingState);
					StretLightsContext.EastCars.remove(0);
					
					message = "Car"+StretLightsContext.EastCars.get(0)+" is moving";
					Logger.writeMessage(message, MovingState);
					StretLightsContext.EastCars.remove(0);
				
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "East";
					message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
				}
				else if(StretLightsContext.EastCars.size()==1)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
					StretLightsContext.currentState = StretLightsContext.Moving;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					message = "Car"+StretLightsContext.EastCars.get(0)+" is moving";
					Logger.writeMessage(message, MovingState);
					StretLightsContext.EastCars.remove(0);

					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "East";
					message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
				}
				else if(StretLightsContext.EastCars.size()==0)
				{
					StretLightsContext.setLight(StretLightsContext.getSetCarMovingStateImpl());
					StretLightsContext.currentState = StretLightsContext.Moving;
					StretLightsContext.carDirection = "East";
					String message = "Current State: "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					StretLightsContext.currentState = StretLightsContext.Gone;
					StretLightsContext.carDirection = "East";
					message = StretLightsContext.currentState+" in "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
					
					StretLightsContext.setLight(StretLightsContext.getSetCarStopStateImpl());
					StretLightsContext.currentState = StretLightsContext.Stop;
					message = "State changed to "+StretLightsContext.currentState+" at "+StretLightsContext.carDirection+" Direction";
					Logger.writeMessage(message, MovingState);
				}
		}
	}
	@Override
	public void carStopState(String filename) {
	}
}
