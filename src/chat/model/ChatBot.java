package chat.model;


public class ChatBot
{
	
	public ChatBot(String string) {
		
	}
	
	public ChatBot(){
		
	}
	
	//public arrayList <String> spookyList; 
	public boolean sentimentChecker(String text) 
	{
		boolean hasSentiment = false;
		
		return hasSentiment;
	}
	
	public boolean legitimacyChecker(String input)
	{
		boolean isValid = true;
		
		if(input == null)
		{
			isValid = false;
		}
		else if (input.length() < 2)
		{
			isValid = false;
		}
		else if (input.contains("dfg") || input.contains("cvb"))
		{
			isValid = false;
		}
		
		return isValid;
	}
	
	
	
	
	public void get()
	{
		
	}

	public void set()
	{
	
	}
	
}
