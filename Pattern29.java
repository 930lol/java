import java.util.Scanner;
public class Pattern29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of lines you want");
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				
				if(i%2==0)
					System.out.print("0 ");
				else
				{
					System.out.print("1 ");
				}
				
			}

			System.out.println();
		}
	}
}

