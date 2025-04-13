package Map;

import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapMain {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Map<String, Integer> lhm = new LinkedHashMap<>(); 
		
		lhm.put("Apple", 200);
		lhm.put("Mango", 200);
		lhm.put("Banana", 100);
		lhm.put("Grapes", 200);
		lhm.put("Apple", 300);
		
		System.out.println(lhm);
		System.out.println(lhm.keySet());
		System.out.println(lhm.values());
		System.out.println(lhm.get("Apple"));
		
		lhm.remove("Grapes");
		System.out.println(lhm);
		
		if(lhm.containsKey("Apple"))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		if(lhm.containsValue(300))
		{
			System.out.println("This key is included in the Map");
		}
		else
		{
			System.out.println("This key is not included in the Map");
		}
		
		lhm.clear();
		System.out.println(lhm);
	}

}
