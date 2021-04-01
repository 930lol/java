import java.util.*;
class Pattern42
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numnber of lines");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			int k=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+n-j;
			}
			System.out.println();
		}
	}
}