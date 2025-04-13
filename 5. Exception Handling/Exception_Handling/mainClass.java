package Exception_Handling;

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		try
		{
			int a = 2;
			int b = 0;
			int c = a/b;    // This will throw ArithmeticException
			
			int[] x = {1, 2, 3};
			x[5] = 6;        // This will throw ArrayIndexOutOfBoundsException
			
			String str = null;
	        int length = str.length(); // This will throw NullPointerException
		}
		catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException ex)
		{
			System.out.println(ex);
		}
		finally
		{
			System.out.println("This will always execute");
		}
		
		try
		{	
			int[] x = {1, 2, 3};
			x[5] = 6;        // This will throw ArrayIndexOutOfBoundsException
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
		}
	}
}
