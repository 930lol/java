import java.util.*;
public class Pattern9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row you want:");
		int a=sc.nextInt();
		int i,j;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=a;j++)
			{
				if(i==j||i+j-1==a)
				{
					System.out.print(1+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
				
			}
			System.out.println();
		}


	}

}
