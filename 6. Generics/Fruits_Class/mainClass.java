package Fruits_Class;

class Fruit {
    // Member variable to store the name of the fruit
    private String name;
    
    // Optional: A constructor to initialize the fruit name
    public Fruit(String name)
    {
        this.name = name;
    }

    // Getter method for the name
    public String getName()
    {
        return name;
    }
    // Setter method for the name
    public void setName(String name)
    {
        this.name = name;
    }
}


public class mainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Fruit apple = new Fruit("Apple");
		System.out.println(apple.getName());
	}

}
