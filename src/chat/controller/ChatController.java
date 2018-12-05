package chat.controller;

import java.util.ArrayList;

//import ChatBot;

import javax.swing.JOptionPane;

public class ChatController
{
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	// private void simplebot()
	{

	}

	public void askName()
	{
		String answer = JOptionPane.showInputDialog(null, "whats your name");
		if (answer == null)
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
		while (!userInput.equalsIgnoreCase("quit"))
		{
			//if (answer == null)
				userInput = JOptionPane.showInputDialog(null, "type quit to exit");
		}
		this.responseList = new ArrayList<String>();
		this.spookyList = new ArrayList<String>();

		// buildTheList();
	}

	public String interactWithChatbot(String text)
	{
		// if(answer == null)
		String userInput = JOptionPane.showInputDialog(null, "");
		return userInput;
	}

	public void spookyList()
	{
		responseList.add("Whats up");
		responseList.add("Goodye");
		responseList.add("BOO");
		responseList.add("Thats to bad");
		responseList.add("?");
		responseList.add("Why?");
		responseList.add("I don't understand");
		responseList.add("No");
		responseList.add("Then do it!");
		responseList.add("Corrct");
		responseList.add("Hi");
	}

	public Boolean spookyTester(String spookyPhrase)
	{
		//spookyTester = new spookyTester();
		Boolean resualt = null;
		String magicWord = "Halloween";
		return resualt;
		
	}

	public String processText(String userText)
	{
		String output = "";

		output += "you said: " + userText;

		return output;
	}

	public String useChatbotCheckers;
	{

	}

	public Object getChatbot()
	{
		return "";
	}

	public String useChatbotCheckers(String string)
	{
		return null;
	}

}
