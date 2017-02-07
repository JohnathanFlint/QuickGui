package gui.model;

public class RecursionTool
{
	public double calculateFactorial(double currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}
	
	public int calculateFibonacci(int currentNumber)
	{
		if(currentNumber == 0 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFibonacci(currentNumber - 1) + calculateFibonacci(currentNumber - 2);
		}
	}
	
	public double calculateFactIter(double currentNumber)
	{
		double answer = 1;
		
		for(double n = 1; n <= currentNumber; n++)
		{
			answer *= n;
		}
		
		return answer;
	}
	
	
	
}
