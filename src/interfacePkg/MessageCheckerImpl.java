package interfacePkg;

public class MessageCheckerImpl implements MessageChecker{

	@Override
	public boolean check(String msg) {
		// TODO Auto-generated method stub
		if (msg.equals("walk") || msg.equals("run") || msg.equals("fly")){
			return true;
		}
		return false;
	}

}
