package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList alist = new ArrayList();
		List<Integer> alist = new ArrayList<>(); //better

		alist.add(20);
		alist.add(300);
		alist.add(10);
		alist.add(500);
		alist.add(20);

		//using for each loop
//		for (int element:alist) {
//			System.out.println(element);
//		}
		
		//using for loop
//		for (int i = 0; i<alist.size(); i++) {
//			System.out.println(alist.get(i));
//		}
		
		//using iterator
		Iterator<Integer> itr = alist.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
