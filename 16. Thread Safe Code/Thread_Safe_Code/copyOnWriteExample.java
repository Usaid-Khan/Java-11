package Thread_Safe_Code;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.Iterator;

class CopyOnWrite{
	private CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();

	public void addElement(int element)
	{
		list.add(element);
	}
	public int getElement(int index)
	{
		return list.get(index);
	}
	public int removeElement(int index)
	{
		return list.remove(index);
	}
	
	public Iterator<Integer> getIterator()
	{
		return list.iterator();
	}
}

public class copyOnWriteExample {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		CopyOnWrite obj = new CopyOnWrite();
		
		obj.addElement(1);
        obj.addElement(2);
        obj.addElement(3);
        obj.addElement(4);
		
        Iterator<Integer> iterator = obj.getIterator();
        while(iterator.hasNext())
        {
        	Integer element = iterator.next();
        	System.out.println("Element: " + element);
        }
	}

}
