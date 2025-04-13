package Annotations;

abstract class Animal {
	public abstract void speak();
}

class Cat extends Animal {
	@Override
	public void speak()
	{
		System.out.println("Meow");
	}
}

public class OverrideExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Cat c = new Cat();
		c.speak();
	}

}
