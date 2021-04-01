
import java.util.Scanner;
public class Pattern41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		int sp=n/2,st=1;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			int k=1;
			for(j=1;j<=st;j++)
			{
				System.out.print(j+" ");
				if(j<st)
				{
					System.out.print("* ");
				}
			}
			if(i<=n/2)
			{
				sp--;
				st++;
			}
			else
			{
				sp++;
				st--;
			}
			System.out.println();

	}
	}
}
