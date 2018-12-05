package chat.view;

import chat.controller.ChatController;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ChatPanel extends JPanel  
{
	private ChatController appController;
	private SpringLayout appLayout;
	private JButton chatButton;
	private JLabel textLabel;

	public ChatPanel(ChatController appController)
	{
		super();
		
		this.appController = appController;
		
		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners()
	{
		
	}

	private void setupScrollPane()
	{
		
	}


}
