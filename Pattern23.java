import java.util.Scanner;
public class Pattern23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number of lines you want");
		int n=sc.nextInt();
		int i,j,a=1;
		for(i=n;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(1+" ");
				}
			}
			System.out.println();
		}
	}
}

