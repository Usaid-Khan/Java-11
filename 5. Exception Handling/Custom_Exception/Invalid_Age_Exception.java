package Custom_Exception;

public class Invalid_Age_Exception
{
	public void checkEligibility(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			System.out.println("Not Eligible for casting vote");
		}
		else
		{
			System.out.println("Eligible for casting vote");
		}
	}
}