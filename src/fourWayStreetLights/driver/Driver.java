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
			String debugLevel = args[2];
			if((args[0].equals("input.txt")) && (args[1].equals("output.txt")) && (Integer.parseInt(debugLevel)>0 && (Integer.parseInt(debugLevel)<=5)))
			{
				StretLightsContext StretLightsContextObj =  new StretLightsContext();
				Results rs = new Results(filename);
				rs.output(StretLightsContextObj,output1);
				int s = Integer.parseInt(debugLevel);
				Logger lg = new Logger();
				lg.setDebugValue(s);
			}
			else 
			{
				System.out.println("The name of 1st arguement should be input.txt and name of 2nd arguement should be output.txt and 3rd arguement should range between 1 and 5");
			}
		}
		else
			System.out.println("Invalid number of command line arguements!! Number of arguements should be 3"); 
	}
}
