package superr;

public class Duck {
	final int legs = 2; //instance variable
	final String color; //instance variable
	
	
	public Duck() { //no argument constructor. its name is same as class name. no return type
		//super(); this is there by default
		color = "white";
		System.out.println("inside default constructor " +color);
	}
	
	public Duck(final String color) { //parameterized constructor
		//super();
		this.color = color;
		System.out.println("inside parameterized constructor " +color);
	}
	
	public void fly() {
		System.out.println("Duck can fly...");
	}

}

