
import java.util.Scanner;
public class Pattern45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number of");
		Scanner sc = new Scanner(System.in);
		String n=sc.next();
		int i,j;
		for(i=1;i<=n.length();i++)
		{
			for(j=0;j<i;j++)
			{
				System.out.print(n.charAt(i-1)+" ");
			}
			System.out.println();
		}
	}
}
