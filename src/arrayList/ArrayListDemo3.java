package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> alist = new ArrayList<>(); //better

		alist.add(20);
		alist.add(300);
		alist.add(10);
		alist.add(500);
		alist.add(20);
		
		Collections.sort(alist);
		

	}

}
