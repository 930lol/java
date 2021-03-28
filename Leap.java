import java.util.*;
public class Leap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year you want to check:");
		int a=sc.nextInt();
		if(a%4==0)
		{
			if(a%100==0)
			{
				if(a%400==0)
				{
					System.out.println("Leap year");
				}
				else
				{
					System.out.println("Not a leap year");
				}
			}
			else
			{
				System.out.println("Leap year");
			}
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
