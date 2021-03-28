import java.util.*;
public class Pattern6 {
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
					if(i%2!=0)
					{
						if(j%2!=0)
						{
							System.out.print(1+" ");
						}
						else
						{
							System.out.print(0+" ");
						}
					}
					else
					{
						if(j%2!=0)
						{
							System.out.print(0+" ");
						}
						else
						{
							System.out.print(1+" ");
						}
					}
			}
			System.out.println();
		}

	}

}
