package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class FrequencyUsingHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {2, 10, 2, 7, 2, 15, 10, 30, 10, 15};
		//int input[] = {2, 10, 2, 2, 1, 1, 3, 3, 5, 0};
		Map <Integer, Integer> hmap1 = new HashMap<>();
		int frequency = 0;
		for (int i = 0; i<input.length; i++) {
			if(hmap1.containsKey(input[i])) { //contains 2? yes
				frequency = hmap1.get(input[i]); // = 1 
				hmap1.put(input[i], ++frequency); // 2, 2
			} else {
				hmap1.put(input[i], 1);
			}
		}
		for(Map.Entry<Integer, Integer> itr : hmap1.entrySet()) {
			System.out.println(itr.getKey() +  ", Frequency: " + itr.getValue());
		}
	}
}
