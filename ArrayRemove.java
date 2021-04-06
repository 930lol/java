import java.util.Scanner;
public class ArrayRemove
{
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array");
		int n=sc.nextInt();
		int b[] =new int[n];
		System.out.println("Enter the "+n+" elements of the array: ");
		for(int i=0;i<n;i++)
		{
			b[i]=sc.nextInt();
		}
		return b;
	}
	static void display(int a[])
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
	public static void main(String[] args) 
	{
		System.out.println("Create the array: ");
		int a[]=readArray();
		System.out.println("The elements of the array: ");
		display(a);
		int b[]=remove(a);
		System.out.println("The elements after removal of the specified index: ");
		display(b);
	}
	static int[] remove(int[] a) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index you want to delete: ");
		int i=sc.nextInt();
		sc.close();
		if(i<a.length && i>=0)
		{
			int b[] = new int[a.length-1];
			int k=0;
			for(int j=0;j<a.length;j++)
			{
				if(j!=i)
				{
					b[k]=a[j];
					k++;
				}
			}
			return b;
		}
		else
		{
			System.out.println("Not possible because the index out of bound");
			return a;
		}
	}
}
