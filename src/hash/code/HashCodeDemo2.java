package hash.code;

public class HashCodeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog1 = new Dog("Jacky", 12, "Black");
		Dog dog2 = new Dog("Jacky", 12, "Black");
		
		System.out.println(dog1.hashCode()); //212921632
		System.out.println(dog2.hashCode()); //1956710488
		
		System.out.println(dog1.equals(dog2)); //false
		//if we want dog1 equals dog2 then we have to override equals() method in parent class

	}

}
