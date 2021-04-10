
public class Employee {
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
		Employee e1 = new Employee();
		//System.out.println(e1.id+" "+e1.name);
		Employee e2 = new Employee();

	}

}
