package PS1;

public class MyInteger {

	private int iValue;
	
	public MyInteger(int iValue)
	{
		this.iValue = iValue;
	}
	 
	public boolean isEven()
	{		
		return MyInteger.isEven(iValue);
	}
	
	public static boolean isEven(int iValue)
	{
		return (iValue % 2 == 0);
	}
	 
	public static boolean isEven(MyInteger myInt)
	{
		return (MyInteger.isEven(myInt.iValue));

	}
	
	public boolean isOdd()
	{
		return !isEven();
	}
	public boolean isPrime() throws Exception
	{ 
		if (iValue > 100)
			throw new Exception("iValue too large");
		
		
		boolean isPrime = true;
		for (int i = 2; i <= (iValue / 2 ); i++)
		{
			if (iValue % i == 0)
			{
				return false;
			}
		}
		return isPrime;
	}
}




