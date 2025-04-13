package Map;

import java.util.Map;
import java.util.HashMap;

public class HashMapMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<String, Integer> hm = new HashMap<>(); 
		
		hm.put("Apple", 200);
		hm.put("Mango", 200);
		hm.put("Banana", 100);
		hm.put("Grapes", 200);
		hm.put("Apple", 300);
		
		System.out.println(hm);
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.get("Apple"));
		
		hm.remove("Grapes");
		System.out.println(hm);
		
		if(hm.containsKey("Apple"))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		if(hm.containsValue(300))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		hm.clear();
		System.out.println(hm);
	}

}
