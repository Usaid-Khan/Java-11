package LamdaExpression;

interface Adding {
	abstract public int add(int a, int b);
}

interface ConcatenateStrings {
	public String concatenate(String a, String b);
}

public class LamdaWithParameters {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Adding add = (c, d)-> { return c+d; };
		System.out.print(add.add(4, 5));
		
		System.out.println();
		
		ConcatenateStrings conStr = (c, d)-> { return c+d; };
		System.out.println(conStr.concatenate("App", "le"));
		
		ConcatenateStrings conStr2 = (c, d)-> c+d;
		System.out.println(conStr2.concatenate("Gra", "pes"));
			
	}
}
