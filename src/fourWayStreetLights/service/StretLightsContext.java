package fourWayStreetLights.service;

import java.io.IOException;
import java.util.ArrayList;

import fourWayStreetLights.util.FileProcessor;

public class StretLightsContext {

	String filename;
	ArrayList<String> NorthCars = new ArrayList<String>();
	ArrayList<String> SouthCars = new ArrayList<String>();
	ArrayList<String> WestCars = new ArrayList<String>();
	ArrayList<String> EastCars = new ArrayList<String>();
	
	public void readFile(String filename2)
	{
		FileProcessor FileProcessorObj = new FileProcessor();
		try {
			while((filename = FileProcessorObj.ReadLine(filename2))!=null)
			{
				if(filename.contains(", North"))
				{
					NorthCars.add(filename.split(",")[0]);
				}
				if(filename.contains(", South"))
				{
					SouthCars.add(filename.split(",")[0]);
				}
				if(filename.contains(", East"))
				{
					EastCars.add(filename.split(",")[0]);
				}
				if(filename.contains(", West"))
				{
					WestCars.add(filename.split(",")[0]);
					System.out.println(WestCars);
				}
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
	}

}
