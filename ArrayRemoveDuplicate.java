import java.util.Scanner;
public class ArrayRemoveDuplicate 
{
	public static void main(String[] args)
	{
		System.out.println("Read the first array");
		int a[]=readArray();
		System.out.println("Print the array elements");
		display(a);
		int b[]=removeDuplicate(a);
		System.out.println("Print the array after removing duplicate elements");
		display(b);	
	}
	static int[] removeDuplicate(int[] a) 
	{
		int b[]=new int[a.length];
		int n=0;
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			while(j<n)
			{
				if(a[i]==b[j])
					break;
				j++;
			}
			if(j==n)
			{
				b[j]=a[i];
				n++;
			}
		}
		int c[]=new int[n];
		for(int i=0;i<n;i++)
		{
			c[i]=b[i];
		}
		return c;
	}
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" elements in the array:");
		int a[] = new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;	
	}
	static void display(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
	}
}
