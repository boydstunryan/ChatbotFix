package chat.view;

import javax.swing.JFrame;
import chat.controller.ChatbotController;

public class ChatFrame extends JFrame
{
	private ChatbotController baseController;
//	private ChatPanel appPanel;
	public ChatFrame(ChatbotController appController)
	{
		super();
		this.baseController = appController;
	//	appPanel = new ChatPanel(appController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(500,500);
		this.setTitle("Chatbot 2017");
	//	this.setContentPane(appPanel);
		this.setResizable(false);
		this.setVisible(true);
	}
}
