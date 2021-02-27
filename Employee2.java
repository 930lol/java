
public class Employee2 {
	//block 1
	Employee()
	{
		//super();
		System.out.println("Constructur");
	}
	//block 2
	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e1 = new Employee2();
		//System.out.println(e1.id+" "+e1.name);
		Employee2 e2 = new Employee2();

	}

}
