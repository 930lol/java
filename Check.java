public class Check {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ISwitch s= new FanImp();
		IRegulator r= new FanImp();
		s.switchOff();
		s.switchOn();
		r.reduceSpeed();
		r.increaseSpeed();
	}

}
