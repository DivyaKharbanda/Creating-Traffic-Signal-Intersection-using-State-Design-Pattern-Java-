package fourWayStreetLights.driver;

import fourWayStreetLights.service.StretLightsContext;

public class Driver {
	
	public static void main(String[] args) 
	{
		String filename = args[0] ;
		StretLightsContext StretLightsContextObj =  new StretLightsContext();
		StretLightsContextObj.readFile(filename);
		
	}
}
