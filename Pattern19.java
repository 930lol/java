import java.util.Scanner;
public class Pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number of lines you want");
		int n=sc.nextInt();
		int i,j,a=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				if(a<=8)
				{
					a++;
				}
				else
					a=1;
			}
			System.out.println();
		}
	}
}
