package fourWayStreetLights.service;

import java.io.IOException;
import java.util.ArrayList;

import fourWayStreetLights.util.FileProcessor;
import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Logger.DebugLevel;


public class StretLightsContext {

	String filename;
	/**
	 * here I have by default taken 2 variables which will be
	 * changed according to the data in input file.
	 *
	 */
	DebugLevel ContextState = null;
	static String currentState = "Red";
	static String carDirection = "North";
	
	final static String Moving = "Green Light";
	final static String Stop = "Red Light";
	final static String Gone = "All cars are gone";
	
	SetStartStateImpl SetStartStateImplObj = new SetStartStateImpl();
	SetCarMovingStateImpl SetCarMovingStateImplObj = new SetCarMovingStateImpl();
	SetCarStopStateImpl SetCarStopStateImplObj = new SetCarStopStateImpl();
	SetCarGoneStateImpl SetCarGoneStateImplObj = new SetCarGoneStateImpl();

		public static ArrayList<String> NorthCars = new ArrayList<String>();
		public static ArrayList<String> SouthCars = new ArrayList<String>();
		public static ArrayList<String> WestCars = new ArrayList<String>();
		public static ArrayList<String> EastCars = new ArrayList<String>();
	

	public void readFile(String filename2)
	{
		FileProcessor FileProcessorObj = new FileProcessor();
		try {
			while((filename = FileProcessorObj.ReadLine(filename2))!=null)
			{
				String message = "---------------------------------------";
				Logger.writeMessage(message, ContextState);
				if((filename.contains(", North")) || (filename.contains(", South"))
						|| (filename.contains(", East")) || (filename.contains(", West")))
				{
					SetStartStateImplObj.insertNewCar(filename);
					//System.out.println("Size");
				}
				if((filename.contains("Green light at North")) || (filename.contains("Green light at West"))||
					(filename.contains("Green light at East")) || (filename.contains("Green light at South")))
				{
					SetCarMovingStateImplObj.removeCars(filename);
				}
				if((filename.contains("Red light at North")) || (filename.contains("Red light at West"))||
						(filename.contains("Red light at East")) || (filename.contains("Red light at South")))
				{
					SetCarStopStateImplObj.carStopState(filename);
				}	
				SetCarGoneStateImplObj.carStopState(filename);
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
