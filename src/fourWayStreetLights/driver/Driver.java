package fourWayStreetLights.driver;

import java.io.IOException;

import fourWayStreetLights.util.FileProcessor;

public class Driver {
	public static void main(String[] args) 
	{
		String filename = args[0] ;
		FileProcessor fp= new FileProcessor();
		try 
		{
			fp.ReadLine(filename);
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
}
