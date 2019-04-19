package chat.controller;

import java.util.Calendar;
import java.util.Scanner;
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;

public class IOController
{

	public static void saveText(ChatController app, String path, String textToSave)
	{
		try
		{
			String filename = path;
			Calendar date = Calendar.getInstance();
			filename += "/" + Calendar.MONTH + " " + date.get(Calendar.DAY_OF_MONTH);
			filename += " at " + date.get(Calendar.HOUR) + "-" + date.get(Calendar.MINUTE);
			filename += " chat save.txt";
		
			File saveFile = new File(filename);
			Scanner textScanner = new Scanner(textToSave);
			PrintWriter saveText = new PrintWriter(saveFile);
			
			while(textScanner.hasNext())
			{
				String currentLine = textScanner.nextLine();
				saveText.println(currentLine);
			}
			textScanner.close();
			saveText.close();
		}
	catch(IOException error)
	{
		app.handleErrors(error);
	}
	catch(Execption generic Error)
	}
	
	public static String loadFile(ChatController app, String path)
	{
		String contents = "";

		try
		{
			File saveFile = new File(path);
			//Scanner textScanner = new Scanner();
			Scanner fileScanner;
			if (saveFile.exists())
			{
				fileScanner = new Scanner(saveFile);
				while (fileScanner.hasNext())
				{
					contents += fileScanner.nextLine() + "\n";
					// String currentLine = textScanner.nextLine();
					// saveText.println(currentLine);
				}
				fileScanner.close();
			//	textScanner.close();
			// saveText.close();
			}
		}
		catch(IOException error)
		{
			app.handleErrors(error);
		}
		catch(Exception genericError)
		{
			app.handleErrors(genericError);
		}
		
	}

	public static void setText(String string)
	{
		// TODO Auto-generated method stub
		
	}
	
	
	
}
