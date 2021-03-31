import java.util.Scanner;
public class Pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of lines you want");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			int a=i;
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print(a+" ");
				if(j<i)
				{
					a--;
				}
				else
				{
					a++;
				}
			}
			System.out.println();
		}
	}
}

