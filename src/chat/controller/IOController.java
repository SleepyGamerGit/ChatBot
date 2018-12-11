package chat.controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;	
import java.io.File;
import java.io.PrintWriter;

public class IOController
{
	
	public static void saveText(ChatController app, String path, String textToSavve)
	{
		try
		{
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + Calendar.MONTH + " " + Calendar.DAY_OF_MONTH;
			filename += " chat save.txt";
			
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textSacnner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			
			textScanner.close();
			saveText.close();
		}
		catch(IOexpection error)
		{
			app.handleErrors(error);
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError);
		}
	}

}
