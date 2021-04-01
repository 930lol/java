
import java.util.Scanner;
public class Pattern39 {

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
				System.out.print(k+" ");
				if(j<=st/2)
				{
					k++;
				}
				else
				{
					k--;
				}
			}
			if(i<=n/2)
			{
				sp--;
				st=st+2;
			}
			else
			{
				sp++;
				st=st-2;
			}
			System.out.println();

	}
	}
}
