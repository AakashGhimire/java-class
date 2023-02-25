package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map <String, String> thmap1 = new TreeMap<>();
		thmap1.put("ssn001", "soojan"); //adds {key, value} = {"ssn001", "soojan"}
		thmap1.put("ssn005", "mohan");
		thmap1.put("ssn003", "ram");
		thmap1.put("ssn007", "naresh");
		
		for (Map.Entry<String, String> entry :thmap1.entrySet()) {
			//System.out.println("Key = "+entry.getKey() + ", Value = " + entry.getValue());
		}
		
		Map <String, String> thmap2 = new TreeMap<>(new SortByKeyDescendingComparator());
		thmap2.put("ssn001", "soojan"); //adds {key, value} = {"ssn001", "soojan"}
		thmap2.put("ssn005", "mohan");
		thmap2.put("ssn003", "ram");
		thmap2.put("ssn007", "naresh");
		
		for (Map.Entry<String, String> entry :thmap2.entrySet()) {
			System.out.println("Key = "+entry.getKey() + ", Value = " + entry.getValue());
		}

	}

}
