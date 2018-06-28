package fourWayStreetLights.driver;

import fourWayStreetLights.service.StretLightsContext;
import fourWayStreetLights.util.Logger;
import fourWayStreetLights.util.Results;

public class Driver {
	
	public static void main(String[] args) 
	{
		
		if((args.length >0) && (args.length)<=3 )
		{
			String filename = args[0] ;
			String output1 = args[1] ;
			StretLightsContext StretLightsContextObj =  new StretLightsContext();
			Results rs = new Results(filename);
			rs.output(StretLightsContextObj,output1);
			String debugLevel = args[2];
			int s = Integer.parseInt(debugLevel);
			Logger lg = new Logger();
			lg.setDebugValue(s);
		}
		else
			System.out.println("Invalid number of command line arguements!! Number of arguements should be 3"); 
	}
}
