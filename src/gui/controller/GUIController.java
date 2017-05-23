package gui.controller;

import javax.swing.JOptionPane;
import gui.model.RecursionTool;
import gui.view.GUIFrame;
import gui.model.Timer;

public class GUIController
{
	
	private GUIFrame baseFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public GUIController()
	{
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
		this.baseFrame = new GUIFrame(this);
	}
	
	public String transferFactorial(String value)
	{
		String factorialResponse = "The factorial of " + value + " is: ";
		mathTimer.startTimer();
		if(isValid(value))
		{
			factorialResponse += mathTool.calculateFactorial(Integer.parseInt(value));
		}
		
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		mathTimer.resetTimer();
		
		mathTimer.startTimer();
		if(isValid(value))
		{
			//factorialResponse += mathTool.calculateFactIter(Integer.parseInt(currentNumber));
		}
		mathTimer.stopTimer();
		factorialResponse += "\n" + mathTimer.toString();
		
		return factorialResponse;
	}
	
	public String stransferFibonacci(String value)
	{
		String fibonacciResponse = "The Fibonacci sequence at " + value + " is:\n";
		mathTimer.resetTimer();
		mathTimer.startTimer();
		
		if(isValid(value))
		{
			fibonacciResponse += mathTool.calculateFibonacci(Integer.parseInt(value));
		}
		mathTimer.stopTimer();
		fibonacciResponse += "\n" + mathTimer.toString();
		
		return fibonacciResponse;
	}
	
	private boolean isValid(String current)
	{
		try
		{
			double test = Double.parseDouble(current);
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
