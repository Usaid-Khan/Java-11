package DownCasting;

public class Animal {
	public void makeSound()
	{
		System.out.println("Some sound");
	}
}

class cat extends Animal {
	public void makeSound()
	{
		System.out.println("meow");
	}
}