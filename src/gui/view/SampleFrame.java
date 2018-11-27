package gui.view;

import javax.swing.JFrame;

import gui.controller.GUIController;

public class SampleFrame extends JFrame
{
	private GUIController appController;
	private SamplePanel appPanel;

	public SampleFrame(GUIController appController)
	{
		super();

		this.appController = appController;
		this.appPanel = new SamplePanel(appController);

		setupFrame();
	}

	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("My GUI App!");
		this.setSize(1000, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
}
