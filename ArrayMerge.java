import java.util.Scanner;
public class ArrayMerge 
{
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" elements of the sorted from: ");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		return a;
		
	}
	static void display(int d[])
	{
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]);
			if(i<d.length-1)
			{
				System.out.print(",");
			}
		}
		System.out.println();
	}
	static int[] merge(int a[],int b[])
	{
		int c[] = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		return c;
	}
	public static void main(String[] args) 
	{
		System.out.println("Read the first array");
		int a[]=readArray();
		System.out.println("Read the Second array");
		int b[]=readArray();
		System.out.println("Entered elements of first array: ");
		display(a);
		System.out.println("Entered elements of second array: ");
		display(b);
		int z[]=merge(a,b);
		System.out.println("The elements of both the array after merge: ");
		display(z);
	}
}

