package fourWayStreetLights.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

import fourWayStreetLights.service.StretLightsContext;
import fourWayStreetLights.util.Logger.DebugLevel;

public class Results implements FileDisplayInterface{

	String inputFile;
	String output1;
	String filename;
	DebugLevel ContextState;
	//StretLightsContext StretLightsContextObj =  new StretLightsContext();
	
	public Results(String filename) {
		inputFile = filename;
		
	}
	
	/**
	 * here I have by default taken 2 variables which will be
	 * changed according to the data in input file.
	 *
	 */
	public void readFile(String filename2, StretLightsContext stretLightsContextObj)
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
					stretLightsContextObj.insertNewCar(filename);
				}
				if((filename.contains("Green light at North")) || (filename.contains("Green light at West"))||
					(filename.contains("Green light at East")) || (filename.contains("Green light at South")))
				{
					stretLightsContextObj.removeCars(filename);
				}
				
				if((filename.contains("Red light at North")) || (filename.contains("Red light at West"))||
						(filename.contains("Red light at East")) || (filename.contains("Red light at South")))
				{
					stretLightsContextObj.carStopState(filename);
				}	
			}
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
	}

	@Override
	public void writeToFile() {
		
	}

	public void output(StretLightsContext stretLightsContextObj, String output) 
	{
		//readFile(inputFile, stretLightsContextObj);
		try {
			PrintStream console = System.out; 
			File file = new File(output);
			FileOutputStream fos = new FileOutputStream(file);
			PrintStream ps = new PrintStream(fos);
			
			System.setOut(ps);
			readFile(inputFile, stretLightsContextObj);
			
			System.setOut(console);
			readFile(inputFile, stretLightsContextObj);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		writeToFile();
	}
}
