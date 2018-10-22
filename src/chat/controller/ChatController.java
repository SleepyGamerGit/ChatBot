package chat.controller;

import java.util.ArrayList;

//import ChatBot;

import javax.swing.JOptionPane;

public class ChatController
{
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	private void simplebot()
	{
		
	}
	public void askName()
	{
		String answer = JOptionPane.showInputDialog(null, "whats your name"); 
		if(answer == null)
		{
			JOptionPane.showInputDialog(null, "Do you have a name?");
		}
		else
		{
			JOptionPane.showInputDialog(null, "Hi there" + answer + "My name is Sora");
		}
	}	
	
	public void start()
		{
		String userInput = "";
		while(!userInput.equalsIgnoreCase("quit"))
		{
			userInput = JOptionPane.showInputDialog(null, "type quit to exit");
		}
			this.responseList = new ArrayList<String>();
			this.spookyList = new ArrayList<String>();
			
			buildTheList();
		}
	
	public String interactWithChatbot(String text)
	{
		String userInput = JOptionPane.showInputDialog(null, "")
	}
	
	
	
	
	public void buildTheList() 
	{
		responseList.add("Whats up");
		responseList.add("Goodye");
		responseList.add("BOO");
	}
	public String processText(String userText)
	{
		String output = "";
		
		output += "you said: " + userText;	
		
		return output; 
	}
}
