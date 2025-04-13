package Generics;

public class Fruit<T> {
	private T item;
	
	Fruit(T item)
	{
		this.item = item;
	}
	
	public void setName(T item)
	{
		this.item = item;
	}
	public T getItem()
	{
		return this.item;
	}
}