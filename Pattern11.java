import java.util.*;
public class Pattern11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row you want:");
		int a=sc.nextInt();
		int i,j,n=a;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=n;j++)
			{
				System.out.print("* ");
				
			}
			n--;
			System.out.println();
		}

	}

}
