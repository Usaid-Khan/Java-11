package Polymorphism;

public class Animal {
	public void makeSound()
	{
		System.out.println("Some sound");
	}
}

class cat extends Animal {
	public void mmakeSound()
	{
		System.out.println("meow");
	}
}