import java.util.*;
public class Pattern33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of lines you want");
		int n=sc.nextInt();
		int i,j;
		int sp=n/2,st=1;
		
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(j=1;j<=st;j++)
			{
				System.out.print("* ");
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

