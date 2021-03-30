import java.util.*;
public class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enetr the number of lines you want");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int i,j;
		for(i=1;i<=n;i++)
		{
			for(j=i;j<=n;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
