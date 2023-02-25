package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, String> hmap1 = new HashMap<>();
		hmap1.put("ssn001", "soojan"); //adds {key, value} = {"ssn001", "soojan"}
		hmap1.put("ssn005", "mohan");
		hmap1.put("ssn003", "ram");
		hmap1.put("ssn007", "naresh");
		System.out.println("Hmap: "+hmap1);
		
		hmap1.put("ssn007", "sunil"); //this will replace value for ssn007
		System.out.println("Hmap after overriding ssn007: "+hmap1);
		//System.out.println(hmap1[0]);
		
		System.out.println("Value for ssn001: "+hmap1.get("ssn001")); //gets the value of ssn001 key
		System.out.println("Check if ssn008 exists in keys: "+hmap1.containsKey("ssn009")); //checks if ssn009 exists in keys and returns boolean
		System.out.println("Check if soojan exists in values: "+hmap1.containsValue("soojan"));
		hmap1.remove("ssn007"); //removes this key/value pair from hmap1
		System.out.println("After removing ssn007: "+hmap1);
		System.out.println("Size of hmap: "+hmap1.size()); //prints the number of keys in hmap1
		Set<String> setOfKeys = hmap1.keySet();
		System.out.println("Set of keys: "+setOfKeys);
		
		Collection setOfValues = hmap1.values();
		System.out.println("Set of values: "+setOfValues);
		
		System.out.println("Entry Set "+hmap1.entrySet());
		
		
		

	}

}
