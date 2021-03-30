
import java.util.Scanner;
public class Pattern18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
