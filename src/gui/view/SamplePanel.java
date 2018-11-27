package gui.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import gui.controller.GUIController;

public class SamplePanel extends JPanel
{
	private GUIController appController;
	private JLabel textLabel;
	private JButton colorButton;

	public SamplePanel(GUIController appController)
	{
		super();

		this.appController = appController;

		this.textLabel = new JLabel("This is a color app!");
		this.colorButton = new JButton("Click here to change color");

		setupPanel();
		setupLayout();
		setupListeners();
	}

	private void setupPanel()
	{
		this.setBackground(Color.CYAN);
		this.add(textLabel);
		this.add(colorButton);
	}

	private void setupLayout()
	{

	}

	private void setupListeners()
	{
		colorButton.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent mouseClick)
			{
				//System.out.println("You clicked the button!!!!");
				changeBackgroundColor();
			}
		});
	}

	private void changeBackgroundColor()
	{
		int red = (int) (Math.random() * 256);
		int green = (int) (Math.random() * 256);
		int blue = (int) (Math.random() * 256);

		this.setBackground(new Color(red, green, blue));
		textLabel.setText("Red: " + red + " Green: " + green + " Blue: " + blue);
	}
}
