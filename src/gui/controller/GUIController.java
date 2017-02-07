package gui.controller;

import javax.swing.JOptionPane;
import gui.model.RecursionTool;
import gui.view.GUIFrame;

public class GUIController
{
	
	private GUIFrame baseFrame;
	private RecursionTool mathTool;
	
	public GUIController()
	{
		this.mathTool = new RecursionTool();
		this.baseFrame = new GUIFrame(this);
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		return factorialResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			int test = Integer.parseInt(current);
			if(test >= 0)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(baseFrame, "Type in a valid integer");
			return false;
		}
		
	}
	
		public void start()
		{
		
		}
}
