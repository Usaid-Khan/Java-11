package Interface;

interface Animal {
	int legs = 0;
	int weight = 0;
	String color = "";
	
	default void eat()
	{
		Sound();
	}
	private void Sound()
	{
		System.out.println("meow");
	}
}

class Cat implements Animal{
	
}