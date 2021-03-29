
public class FanImp implements ISwitch,IRegulator{

	@Override
	public void increaseSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Fan speed increase");
		
	}

	@Override
	public void reduceSpeed() {
		// TODO Auto-generated method stub
		System.out.println("Fan speed reduce");
		
	}

	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Fan switch on");
	}

	@Override
	public void switchOff() {
		// TODO Auto-generated method stub
		System.out.println("Fan switch off");
		
	}
	

}
