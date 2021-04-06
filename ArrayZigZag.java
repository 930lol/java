import java.util.Scanner;
public class ArrayZigZag 
{
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter the "+n+" elements: ");
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
	static int[] zigZag(int a[],int b[])
	{
		int c[]=new int [a.length+b.length];
		if(a.length==b.length)
		{
			int k=0,j=0;
			for(int i=0;i<a.length+b.length;i++)
			{
				if(i%2==0)
				{
					c[i]=a[j];
					j++;
				}
				else
				{
					c[i]=b[k];
					k++;
				}
			}
		}
		else if(a.length>b.length)
		{
			int k=0,j=0;
			for(int i=0;i<=a.length;i++)
			{
				if(i%2==0)
				{
					c[i]=a[k];
					k++;
				}
				else
				{
					c[i]=b[j];
					j++;
				}
			}
			//int j=a.length/2;
			for(int i=0;i<a.length-b.length;i++)
			{
				c[a.length+i+1]=a[k];
				k++;
			}
		}
		else if(a.length<b.length)
		{
			int k=0,j=0;
			for(int i=0;i<b.length;i++)
			{
				if(i%2==0)
				{
					c[i]=a[k];
					k++;
				}
				else
				{
					c[i]=b[j];
					j++;
				}
			}
			//int j=b.length/2;
			for(int i=0;i<a.length;i++)
			{
				c[b.length+i]=b[j];
				j++;
			}
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
		int z[]=zigZag(a,b);
		System.out.println("The elements after zigzag operations");
		display(z);
		
	}
}
