package abstraction;

public abstract class Animal {
	//class must be abstract if there's an abstract method.
	public void run() {
		System.out.println("animals can run faster than humans");
	}
	
	public abstract void jump();

}
