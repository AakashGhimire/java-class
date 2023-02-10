package finalKeyword;

public class FlyDuck extends Duck{
	int legs = 4;
	String color = "yellow";
	
	public FlyDuck() {
		super(); //it calls default constructor by default 
	}
	
	public FlyDuck(String color, int legs) {
		super (color);
		this.legs = legs;
	}
	
	public void magic() {
		System.out.println("Duck can magic...");
		fly();
		super.fly();
	}
	
	public void fly() {
		System.out.println("FlyDuck can fly...");
	}
	
	public void currentState() {
		System.out.println("legs = "+ legs);
		System.out.println("this.legs = "+ this.legs);
		System.out.println("super.legs = "+ super.legs);
		System.out.println("color = "+ color);
		System.out.println("this.color = "+ this.color);
		System.out.println("super.color = "+ super.color);
	}
}

