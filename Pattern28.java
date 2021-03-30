import java.util.Scanner;
public class Pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of lines you want");
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			int a=1;
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				
				if(j%2==0)
					System.out.print("* ");
				else
				{
					System.out.print(a+" ");
					a++;
				}
				
			}

			System.out.println();
		}
	}
}

