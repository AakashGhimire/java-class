package abstraction;

public class Lion extends Animal{

	public static void main(String[] args) {
		// Abstraction is a process of hiding the implementation details and showing only functionality to the user.
		// Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where you type the text and send the message.
		// You don't know the internal processing about the message delivery.
		// Abstraction lets you focus on what the object does instead of how it does it.
		
		Lion lion = new Lion();
		lion.run();
		lion.jump();
	}
	@Override
	public void jump() {
		// TODO Auto-generated method stub
		System.out.println("Lion can jump");		
	}
}
