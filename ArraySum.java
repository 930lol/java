import java.util.Scanner;
public class ArraySum
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
		sc.close();
		System.out.println("Entered elements in the array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
		int s=0;
		for(int i=0;i<a.length;i++)
		{
			s=s+a[i];
		}
		System.out.println("The sum of elements in the array: "+s);
	}
}

