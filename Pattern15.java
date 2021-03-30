import java.util.*;
public class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number of lines you want");
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++)
			{
				if((i+j)%2!=0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
	}
}
