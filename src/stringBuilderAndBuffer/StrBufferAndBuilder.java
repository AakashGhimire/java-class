package stringBuilderAndBuffer;

public class StrBufferAndBuilder {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder("aakash");
		
		sb1.insert(0, "hi "); //inserts hi at index 0
		System.out.println(sb1);
		sb1.append(" Ghimire");
		System.out.println(sb1);
		String s = sb1.toString();
		
		StringBuilder sb2 = new StringBuilder("java");
		StringBuilder sb3 = new StringBuilder("java");
		System.out.println(sb2.equals(sb3)); //false because equals() is not overridden so it compares address in the memory
		
		
	}

}
