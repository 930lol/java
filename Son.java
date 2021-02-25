

public class Son extends Father{
	String name;
	int price;
	void ply()
	{
		System.out.println("HI HOW ARE YOU");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Son s = new Son();
		s.name="aa";
		s.price=455;
		s.ply();
		s.smoking();
		s.drinking();
		s.walking();
		System.out.println(s.name+" "+s.price);
		System.out.println(s.money+" "+s.girlFriend);

	}

}
