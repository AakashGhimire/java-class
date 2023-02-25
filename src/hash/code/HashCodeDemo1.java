package hash.code;

public class HashCodeDemo1 {
	//hasCode () is for objects, 32 bit integer no for unique identification of objects
	//if we create custom class, then we can generate equals method to override the default equals method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "soojan";
		System.out.println(s1.hashCode()); //-896692316
		
		String s2 = new String("soojan");
		System.out.println(s2.hashCode()); //-896692316: here s1 and s2's hashCode will be same
		
		String s3 = new String("soojan");
		System.out.println(s3.hashCode()); //-896692316
		
		//int x = 20;
		Integer i = new Integer(100);
		System.out.println(i.hashCode()); //100
		Integer j = new Integer(100);
		System.out.println(j.hashCode()); //100
		
		

	}

}
