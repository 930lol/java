
public class Employee1 {
	//block 1
	int id;
	String name;
	{
		id=1;
		name ="ABHISHEK";
		System.out.println("Block 1");
	}
	//block 2
	{
		System.out.println("Block 2");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee1 e1 = new Employee1();
		System.out.println(e1.id+" "+e1.name);
		Employee1 e2 = new Employee1();

	}

}
