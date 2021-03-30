import java.util.Scanner;
public class Pattern20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enetr the number of lines you want");
		int n=sc.nextInt();
		int i,j;
		for(i=n;i>=1;i--)
		{
			int a=i;
			for(j=1;j<=i;j++)
			{
				System.out.print(a+" ");
				a--;
			}
			System.out.println();
		}
	}
}
