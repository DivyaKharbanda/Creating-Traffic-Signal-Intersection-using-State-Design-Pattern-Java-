package fourWayStreetLights.service;
import java.util.ArrayList;

public class StretLightsContext implements StreetLightsStateI{



	static String currentState = "Red";
	static String carDirection = "North";
	
	static StreetLightsStateI currentState1;
	

	static SetStartStateImpl SetStartStateImplObj = new SetStartStateImpl();
	static SetCarMovingStateImpl Green = new SetCarMovingStateImpl();
	static SetCarStopStateImpl Red = new SetCarStopStateImpl();
	static SetCarGoneStateImpl All_Cars_Gone = new SetCarGoneStateImpl();
	
	public static StreetLightsStateI getSetCarMovingStateImpl()
	{
		return Green;
	}
	public static StreetLightsStateI getSetStartStateImpl()
	{
		return SetStartStateImplObj;
	}
	public static StreetLightsStateI getSetCarStopStateImpl()
	{
		return Red;
	}
	public static StreetLightsStateI getSetCarGoneStateImpl()
	{
		return All_Cars_Gone;
	}
	public static void setLight(StreetLightsStateI Red)
	{
		currentState1 = Red; 
	}
	
	final static String Moving = "Green_Light";
	final static String Stop = "Red_Light";
	final static String Gone = "There is no Car";
	

	
	
		public static ArrayList<String> NorthCars = new ArrayList<String>();
		public static ArrayList<String> SouthCars = new ArrayList<String>();
		public static ArrayList<String> WestCars = new ArrayList<String>();
		public static ArrayList<String> EastCars = new ArrayList<String>();

	@Override
	public void carStopState(String filename) 
	{
		if(filename.contains("Red"))
		{
			setLight(getSetCarStopStateImpl());
			currentState1.carStopState(filename);
		}
	}
	
	@Override
	public void insertNewCar(String filename) 
	{
		setLight(getSetStartStateImpl());
		currentState1.insertNewCar(filename);
	}
	@Override
	public void removeCars(String filename) 
	{
		if(filename.contains("Green"))
		{
			setLight(getSetCarMovingStateImpl());
			currentState1.removeCars(filename);
		}
	}
	public void goneCars(String filename)
	{
		setLight(All_Cars_Gone);
		currentState1.carStopState(filename);
	}

}
