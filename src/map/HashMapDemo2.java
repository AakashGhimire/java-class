package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, String> hmap1 = new HashMap<>();
		hmap1.put("ssn001", "soojan"); //adds {key, value} = {"ssn001", "soojan"}
		hmap1.put("ssn005", "mohan");
		hmap1.put("ssn003", "ram");
		hmap1.put("ssn007", "naresh");

		for(Map.Entry<String, String> entry: hmap1.entrySet()) {
			//System.out.println("Key = "+entry.getKey() + ", Value = " + entry.getValue());
		}

		for (String key: hmap1.keySet()) {
			//System.out.println("Key: " + key + " " + "value: " + hmap1.get(key));
		}
		
		Iterator<Map.Entry<String, String>> itr = hmap1.entrySet().iterator();
	    while(itr.hasNext())
	    {
	         Map.Entry<String, String> entry = itr.next();
	         System.out.println("Key = " + entry.getKey() +  ", Value = " + entry.getValue());
	    }
	}
}
