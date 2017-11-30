package chat.controller;

import chat.view.PopupDisplay;
import chat.model.Chatbot;

public class ChatbotController 
{
	private Chatbot chatbot;
	private PopupDisplay display;
	private ChatFrame appFrame;
	
	public ChatbotController()
	{
		chatbot = new Chatbot("George");
		//View initialized after Model
		display = new PopupDisplay();
		appFrame = new ChatFrame(this);
	}
	
	public void start()
	{
		display.displayText("Welcome to Chatbot");
	 //	String response = display.collectResponse("What do you want to talk about?");
		
	//	while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
	//	{
	//		response = popupChat(response);
	//		response = display.collectResponse(response);
	//	}
		
	
	}
	
	public String interactWithChatbot(String input)
	{
		String chatbotSays = "";
		
		if(chatbot.quitChecker(input))
		{
			close();
		}
		
		chatbotSays += chatbot.processConversation(input);
		
		return chatbotSays;
	}
	
	private void close()
	{
		display.displayText("Goodbye");
		System.exit(0);
	}
	
	private String popupChat (String chat)
	{
		String chatbotSays= ""; //Assigns a valid value that will be returned for 
		
		chatbotSays += chatbot.processConversation(chat);
		
		return chatbotSays;
	}
	
	public String useCheckers(String text)
	{
		String response = "";
		
		if(chatbot.contentChecker(text))
		{
			response += "This text matches the special content\n";
		}
		if(chatbot.cuteAnimalMemeChecker(text))
		{
			response += "";
		}
		//continue with all checkers except length and quit checker
		
		return response;
	}
}
