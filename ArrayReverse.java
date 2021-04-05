
import java.util.Scanner;
class ArrayReverse
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" elements in the array: ");
		int a[] = new int[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Entered elements in the array: ");
		int m=a.length;
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
			if(i>=1)
			{
				System.out.print(",");

			}
		}
	}

}
