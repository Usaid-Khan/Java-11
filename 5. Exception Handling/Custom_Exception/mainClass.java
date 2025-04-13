package Custom_Exception;

public class mainClass {

	public static void main(String[] args)
	{
			Invalid_Age_Exception exOfAge = new Invalid_Age_Exception();
			int age =16;
			
			try
			{
				 exOfAge.checkEligibility(age);
			}
			catch (InvalidAgeException e)
			{
	            System.out.println(e.getMessage());
	        }
	}
}