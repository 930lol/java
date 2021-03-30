import java.util.*;
public class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
