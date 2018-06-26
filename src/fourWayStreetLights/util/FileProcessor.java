package fourWayStreetLights.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileProcessor {
	Scanner input;
	int i=1;
	private BufferedReader br;
	
	public String ReadLine(String file_name) throws IOException {
		String file = file_name;
		try 
		{
			br = new BufferedReader(new FileReader(file));     
			if (br.readLine() == null) 
			{
			    System.out.println("file empty");
			}								
		if (i == 1) 
		{
			input = new Scanner(new File(file));
			i++;
		}
			try 
			{
				if (input.hasNext()) 
					{
						String line;
						line = input.nextLine();
						System.out.println(line);
						return line;
					}
			}
			catch (Exception e) 
			{
				e.printStackTrace();
			}	
		}
		catch (FileNotFoundException e) 
		{
			System.out.println("There is no file present");
		}
	
		return null;
	
	}

}
