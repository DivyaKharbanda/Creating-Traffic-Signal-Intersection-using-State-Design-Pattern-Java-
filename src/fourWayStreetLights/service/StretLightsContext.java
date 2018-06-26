package fourWayStreetLights.service;

import java.io.IOException;
import java.util.ArrayList;

import fourWayStreetLights.util.FileProcessor;

public class StretLightsContext {

	String filename;
	
	static String currentState = "Red";
	static String carDirection = "North";
	
	final static String Moving = "Green Light";
	final static String Stop = "Red Light";
	final static String Gone = "All cars are gone";
	
	SetStartStateImpl SetStartStateImplObj = new SetStartStateImpl();
	SetCarMovingStateImpl SetCarMovingStateImplObj = new SetCarMovingStateImpl();
	SetCarStopStateImpl SetCarStopStateImplObj = new SetCarStopStateImpl();

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
				if((filename.contains(", North")) || (filename.contains(", South"))
						|| (filename.contains(", East")) || (filename.contains(", West")))
				{
					SetStartStateImplObj.insertNewCar(filename);
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
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
