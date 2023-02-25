package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// <> are called generics
		//<Integer> is called wrapper class
		//ArrayList alist = new ArrayList();
		List<Integer> alist = new ArrayList<>(); //better
		
		alist.add(20);
		alist.add(300);
		alist.add(10);
		alist.add(500);
		alist.add(20);
		
		System.out.println(alist); 
		System.out.println(alist.get(0)); //gets index 0 of alist
		System.out.println(alist.get(2)); //gets index 2 of alist
		System.out.println(alist.contains(300)); //gives boolean
		System.out.println(alist.contains(200)); //checks whether alist contains the value 200
		//sort
		Collections.sort(alist); //sort the list
		System.out.println(alist);
		
//		//Create list of Strings
//		List<String> alist2 = new ArrayList<>(); //better
//		
//		alist2.add("apple");
//		alist2.add("papaya");
//		alist2.add("banana");
	}
}
