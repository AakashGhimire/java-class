package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, String> lhmap1 = new LinkedHashMap<>();
		lhmap1.put("ssn001", "soojan"); //adds {key, value} = {"ssn001", "soojan"}
		lhmap1.put("ssn005", "mohan");
		lhmap1.put("ssn003", "ram");
		lhmap1.put("ssn007", "naresh");
		
		for (Map.Entry<String, String> entry :lhmap1.entrySet()) {
			System.out.println("Key = "+entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
