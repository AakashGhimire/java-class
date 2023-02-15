package stringDemo;

public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Print this in reverse";
		
		for (int i =s1.length()-1; i>=0; i-- ) {
			System.out.print(s1.charAt(i));
		}

	}

}
