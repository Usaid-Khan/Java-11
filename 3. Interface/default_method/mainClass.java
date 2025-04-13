package default_method;

//interface has no field
//interface has no constructor
//abstract methods are to be override
//default methods can be override but with public keyword
//private method cannot be override
//static function cannot be override

interface animal {
	void sound();
	default void eat()
	{
		breathe();
		System.out.println("Animal eat");
	}
	static void sleep()
	{
		System.out.println("Animal sleep");
	}
	private void breathe()
	{
		System.out.println("Animal breathe");
	}
}

class cat implements animal {
	public void sound()
	{
		System.out.println("meow");
	}
	
	/*In cat class we cannot override eat method because it is default function.
	default void eat()
	{
		System.out.println("Animal eat");
	}*/
	
	//We can only override default function with using public keyword
	public void eat()
	{
		System.out.println("Animal eat and eats");
	}
}

public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		animal a = new cat();
		a.eat();
		
//		animal a2;  
//		a2.sleep();    This will create an error because we cannot create object of interface
		
		animal.sleep();
		
//		a.sleep();        This will also creates an error because in which class static method is defined, we only call that method with that class name in which it is defined.
	}

}
