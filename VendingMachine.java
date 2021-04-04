import java.util.Scanner;

public class VendingMachine {

	Baverage pressButton()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice of drink");
		System.out.println("1-Coffee 2-Tea");
		int choice=sc.nextInt();
		sc.close();
		if(choice==1)
		{
			Coffee cf =new Coffee();
			return cf;
		}
		else
		{
			Tea t = new Tea();
			return t;
		}
	}
}
