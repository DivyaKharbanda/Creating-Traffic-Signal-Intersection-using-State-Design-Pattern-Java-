package fourWayStreetLights.driver;

import fourWayStreetLights.service.StretLightsContext;

public class Driver {
	
	public static void main(String[] args) 
	{
		if((args.length >0) && (args.length)<3 )
		{
			String filename = args[0] ;
			StretLightsContext StretLightsContextObj =  new StretLightsContext();
			StretLightsContextObj.readFile(filename);
		}
		else
			System.out.println("Invalid number of command line arguements.");
		
	}
}
