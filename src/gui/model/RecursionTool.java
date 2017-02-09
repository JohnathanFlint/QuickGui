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
	
	public int calculateFibIter(int currentNumber)
	{
		int number1 = 0;
		int number2 = 1;
		int number3 = 1;
		
		for(int index = 0; index < currentNumber; index++)
		{
			number1 = number2;
			
			number2 = number3;
			
			number3 = number1 + number2;
		}
		return number1;
	}
	
	
	
}
