package DenialOfService;

class DOSProtection {
	private final int maxSize = 100;
	public void processInput(String i) throws Exception
	{
		if(i.length() > maxSize)
		{
			throw new Exception("Input size is invalid");
		}
		else
		{
			System.out.println(i);
		}
	}
}

public class DenialOfService {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		String input = "Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World Hello World";
		DOSProtection protectObj = new DOSProtection();
		try
		{
			protectObj.processInput(input);
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
}
