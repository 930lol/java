public class CPUImpl implements IMouse{
	@Override
	public void rightClick() {
		System.out.println("Display Option");
	}
	@Override
	public void click() {
		System.out.println("App resourse get selected");
		
	}

	@Override
	public void doubleClick() {

		System.out.println("App resourse get opened");
	}

}
