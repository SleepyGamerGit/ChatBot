package chat.view;

import chat.controller.ChatController;
import chat.controller.IOController;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;

public class ChatPanel extends JPanel
{
	private ChatController appController;
	private SpringLayout appLayout;

	private JButton chatButton;
	private JButton checkerButton;
	private JButton loadButton;
	private JButton saveButton;

	private JTextArea chatArea;
	private JTextField chatField;
	private JScrollPane chatPane;

	public ChatPanel(ChatController appController)
	{
		super();
		this.appController = appController;

		saveButton = new JButton("Save");
		loadButton = new JButton("Load");
		chatButton = new JButton("Chat");
		checkerButton = new JButton("Check Text");

		chatField = new JTextField("talk to the bot here", 50);
		chatArea = new JTextArea("Chat Area", 20, 50);

		chatPane = new JScrollPane();

		setupPanel();
		setupLayout();
		setupListeners();
		setupScrollPane();
	}

	private String getPath(String choice)
	{
		String path = ".";
		int result = -99;
		JFileChooser fileChooser = new JFileChooser();
		if (choice.equals("save"))
		{
			fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			result = fileChooser.showSaveDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getCurrentDirectory().getAbsolutePath();
			}
		}
		else
		{
			result = fileChooser.showOpenDialog(this);
			if(result == JFileChooser.APPROVE_OPTION)
			{
				path = fileChooser.getSelectedFile().getAbsolutePath();
			}
		}
		
		return path;
	}
	
	private void setupScrollPane()
	{
		chatArea.setEditable(false);
		chatArea.setLineWrap(true);
		chatArea.setWrapStyleWord(true);

		chatPane.setViewportView(chatArea);
		chatPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		chatPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	}

	private void setupPanel()
	{
		this.setLayout(appLayout);
		this.setPreferredSize(new Dimension(800, 600));
		this.setBackground(Color.MAGENTA);
		this.add(chatButton);
		this.add(loadButton);
		this.add(saveButton);
		this.add(checkerButton);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{

		chatButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String userText = chatField.getText();
				String response = "";
				response = appController.interactWithChatbot(userText);
				chatArea.append(response);
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
				chatField.setText("");
				chatArea.setCaretPosition(chatArea.getDocument().getLength());
			}
		});

		saveButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String chatText = chatArea.getText();
				String path = "~/Documents";
				IOController.setText("Chat Saved!");
			}
		});

		loadButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				String path = getPath("load");
				String chatText = IOController.loadFile(appController,  path);
				chatArea.setText(chatText);
			}
		});
	}
	
/*	tweetButton.addActionListoner(new Acitonslistener())
	{
		public void actionPreformed(Action tweetClick)
		{
			String textToTweet = chatField.getText().trim();
			appController.tweet(textToTweet);
		}
	);}
*/
}
