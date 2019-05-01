package chat.controller;

import java.util.ArrayList;

import chat.model.ChatBot;
import chat.model.ChatTwitter;

import javax.swing.JOptionPane;

import chat.view.ChatFrame;

public class ChatController
{
	private Chatbot simpleBot;
	private ChatFrame appFrame;
	private ChatTwitter myTwitter;
	
	private ArrayList<String> responseList;
	private ArrayList<String> spookyList;
	private void simplebot()
	{

	}
	
	public ChatController()
	{
		simpleBot = new ChatBot();
		appFrame = new ChatFrame(this);
		myTwitter = new ChatTwitter(this);
	}
	

	public void start()
	{
		
	}

	public String interactWithChatbot(String text)
	{
		String output = "";
		output += simpleBot.processText(text);
		return output;
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
	
	public void close()
	{
		System.exit(0);
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, error.getMessage());
	}
	
	public ChatFrame getAppFrame()
	{
		return appFrame;
	}

	public ChatBot getChatBot()
	{
		return simpleBot;
	}
	
	public void tweet(String text)
	{
		myTwitter.sendTweet(text);
	}


}

