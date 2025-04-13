package Generics;

public class FruitMainClass {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Fruit<String> fruit1 = new Fruit<>("Apple");
		Fruit<String> fruit2 = new Fruit<>("Orange");
		Fruit<String> fruit3 = new Fruit<>("Grapes");
		
		Fruit<Integer> types = new Fruit<>(3);
		
		System.out.println("Fruit 1: " + fruit1.getItem());
		System.out.println("Fruit 2: " + fruit2.getItem());
		System.out.println("Fruit 3: " + fruit3.getItem());
		System.out.println("Total types are " + types.getItem());
	}

}
