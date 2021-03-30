import java.util.Scanner;
public class Pattern30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of lines you want");
		int n=sc.nextInt();
		int i,j,k=1;
		for(i=1;i<=n;i++)
		{
			char a=65;
			for(j=1;j<=n-i;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=2*i-1;j++)
			{
				System.out.print(a+" ");
				a++;
			}

			System.out.println();
		}
	}
}

