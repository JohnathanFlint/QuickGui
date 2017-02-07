package gui.view;

import javax.swing.JFrame;
import gui.controller.GUIController;
import java.awt.*;

public class GUIFrame extends JFrame
{
	private GUIController baseController;
	private GUIPanel appPanel;
	
	public GUIFrame(GUIController baseController)
	{
		super();
		this.baseController = baseController;
		this.appPanel = new GUIPanel(baseController);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(appPanel);
		this.setTitle("Quick");
		this.setSize(new Dimension(500, 500));
		this.setVisible(true);
	}
}
