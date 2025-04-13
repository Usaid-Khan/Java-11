package InputValidation;

class InputValidation {
	private final int maxSize = 100;
	public void verifyInput(String email) throws Exception
	{
		if(email==" " || !email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"))
		{
			throw new Exception("Email is invalid.");
		}
		else
		{
			System.out.println(email);
		}
	}
}

public class InputValidationExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String input = "danish123@gmail.com";
		InputValidation validationObj = new InputValidation();
		
		try
		{
			validationObj.verifyInput(input);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}