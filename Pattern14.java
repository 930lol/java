import java.util.*;
public class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the no. of lines you want");
				Scanner sc = new Scanner(System.in);
				int n=sc.nextInt();
				int i,j;
				for(i=1;i<=n;i++)
				{
					for(j=1;j<=i;j++)
					{
						if(i%2!=0)
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

