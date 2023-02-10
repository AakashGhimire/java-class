package finalKeyword;

public class Duck {
	final int legs = 2;
	final String color;
	
	public Duck() {
		color = "white";
	}
	
	public Duck(final String color) {
		this.color = color;
	}
	public void fly() {
		System.out.println("Duck van fly...");
	}

}


