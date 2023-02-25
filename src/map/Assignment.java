package map;

import java.util.HashSet;
import java.util.Set;
//Given array (not array list) of integers, print duplicate elements using HashSet
public class Assignment {

	public static void main(String[] args) {
		int arr[] = {8, 1,2,3,4,5, 1,2, 1, 1, 4, 5, 6, 7, 8, 2, 3, 1,8};
		Set <Integer> hset = new HashSet<>();
		
		for (int i = 0; i<arr.length; i++) {
			for ( int j = i+1; j<arr.length; j++ ) {
				if (arr[i] == arr[j]) {
					hset.add(arr[j]);
				}
			}
		}
		System.out.println("Duplicate entries are: "+hset);
	}
	

}
