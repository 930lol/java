import java.util.*;
public class Pattern10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row you want:");
		int a=sc.nextInt();
		int i,j;
		for(i=1;i<=a;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("* ");
				
			}
			System.out.println();
		}

	}

}
