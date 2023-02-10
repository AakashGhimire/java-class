package interfacePkg;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MessageCheckerImpl mc = new MessageCheckerImpl();
		
		boolean gotFromServer = mc.check("fly");
		
		System.out.println(gotFromServer);
	}
}
