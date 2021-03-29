
public class Test {

	public static void main(String[] args) {
 
		IMouse m= new CPUImpl();
		m.click();
		m.doubleClick();
		m.rightClick();
	}

}
