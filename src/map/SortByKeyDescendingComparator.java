package map;

import java.util.Comparator;

public class SortByKeyDescendingComparator  implements Comparator<String>{
	@Override
	public int compare(String s1, String s2) {
		return s2.compareTo(s1); //descending order
	}

}
