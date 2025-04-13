package Abstract_Method_In_Enum;

enum Operation {
	Addition
	{
		@Override
		public int apply(int x, int y)
		{
			return x+y;
		}
	},
	Multiplication
	{
		@Override
		public int apply(int x, int y)
		{
			return x*y;
		}
	},
	Subtraction
	{
		@Override
		public int apply(int x, int y)
		{
			return x-y;
		}
	},
	Division
	{
		@Override
		public int apply(int x, int y)
		{
			return x/y;
		}
	},
	Remainder
	{
		@Override
		public int apply(int x, int y)
		{
			return x%y;
		}
	};
	
	public abstract int apply(int x, int y);
}

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x=3;
		int y=4;
		
		for(Operation op : Operation.values())
		{
			System.out.println(op + ": " + op.apply(x, y));
		}
	}
}
