package customException;

class InvalidAgeException extends Exception {
	InvalidAgeException(String msg)
	{
		super(msg);
	}
}

public class mainClass {
	
	public static void vote(int age) throws InvalidAgeException
	{
		if(age < 18)
		{
			throw new InvalidAgeException("Not Eligible for casting vote");
		}
		else
		{
			System.out.println("Eligible for casting vote");
		}
	}
	
	public static void main(String[] args)
	{
		try
		{
			int age = 14;
			vote(age);
		}
		catch(InvalidAgeException ex)
		{
			System.out.println(ex);
		}
	}
}
