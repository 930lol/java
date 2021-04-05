import java.util.Scanner;
public class ArrayPrime
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
		int e=0,o=0;
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
		System.out.println("Prime numbers");
		for(int i=0;i<a.length;i++)
		{
			if(check(a[i])==true)
			{
				System.out.print(a[i]);
				if(i<a.length-1)
				{
					System.out.print(",");
				}
			}
		}
	}
	static boolean check(int a)
	{
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				return false;
			}
		}
		return true;
	}
}

