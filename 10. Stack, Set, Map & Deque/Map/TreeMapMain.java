package Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<String, Integer> tm = new TreeMap<>(); 
		
		tm.put("Apple", 200);
		tm.put("Mango", 200);
		tm.put("Banana", 100);
		tm.put("Grapes", 200);
		tm.put("Apple", 300);
		
		System.out.println(tm);
		System.out.println(tm.keySet());
		System.out.println(tm.values());
		System.out.println(tm.get("Apple"));
		
		tm.remove("Grapes");
		System.out.println(tm);
		
		if(tm.containsKey("Apple"))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		if(tm.containsValue(300))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		tm.clear();
		System.out.println(tm);
	}

}
