
public class CircleArea {
	public static void main(String[] agrs)
	{
		CircleArea c= new CircleArea();
		double A=c.area(3);
		System.out.println("circle area = "+A);
		
	}
	double area(int r)
	{
		double a=3.14*r*r;
		System.out.println("circle area = "+a);
		return a;
	}
	

}
