import java.util.*;
public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row you want:");
		int a=sc.nextInt();
		int i,j;
		char c=97;
		for(i=1;i<=a;i++)
		{
			c=97;
			for(j=1;j<=a;j++)
			{
					System.out.print(c+" ");
					c++;
			}
			System.out.println();
		}

	}

}
