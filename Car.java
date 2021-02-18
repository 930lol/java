
class Car {
	public static void main(String[] args)
	{
		Car c =new Car();
		c.move();
	}
	void start()
	{
		System.out.println("Start");
	}
	void changeGear()
	{
		System.out.println("change Gear");
	}
	void move()
	{
		start();
		changeGear();
		System.out.println("moving start");
	}

}
