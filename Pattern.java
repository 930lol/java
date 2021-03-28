import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row you want:");
		int a=sc.nextInt();
		int i,j,n=1;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=a;j++)
			{
				System.out.print(n+" ");
				if(n<=8)
				{
					n++;
				}
				else
				{
					n=1;
				}
				
			}
			System.out.println();
		}

	}

}
