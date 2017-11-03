package chat.controller;

import chat.view.PopupDisplay;
import chat.model.Chatbot;

public class ChatbotController 
{
	private Chatbot chatbot;
	private PopupDisplay display;
	
	public ChatbotController()
	{
		chatbot = new Chatbot("George");
		display = new PopupDisplay();
	}
	
	public void start()
	{
		String response = display.collectResponse("What do you want to talk about?");
		
		while (chatbot.lengthChecker(response) && !chatbot.quitChecker(response))
		{
			response = popupChat(response);
			response = display.collectResponse(response);
		}
	}
	
	
	private String popupChat (String chat)
	{
		
	}
}
