package superr;

public class FlyDuck extends Duck{
	int legs = 4;
	int leg = 3;
	String color = "yellow";
	
	public FlyDuck() { //constructor
		super();
	}
	
	public FlyDuck (String color, int legs) { //constructor
		super(color); //super(red)
 	}
	
	public void currentState() { //method
		
		System.out.println("legs = "+ legs); //4
		System.out.println("this.legs = "+ this.legs); //4 this refers to current class
		System.out.println("super.legs = "+ super.legs); // checks legs in duck class (parent class)
		System.out.println("color = "+ color); //yellow
		System.out.println("this.color = "+ this.color); //yellow or white
		System.out.println("super.color = "+ super.color); //
	}
	

}
