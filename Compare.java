import java.util.*;
public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers you want to check:");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println(b+" is greater");
			}
			else
			{
				System.out.println(c+" is greater");
			}
		}

	}

}
