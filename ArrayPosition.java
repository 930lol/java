import java.util.Scanner;
class ArrayPosition
{
	public static void main(String[] args) 
	{
		System.out.println("Read the array you want to reverse the position:");
		int a[]=readArray();
		System.out.println("Display the elements of the array:");
		display(a);
		System.out.println("The reverse elements according to the position:");
		int b[]=reversePos(a);
		System.out.println("Array after reversing the postiton:");
		display(b);
	}

	static int[] reversePos(int[] a)
	{
		int b[]=new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
			b[j]=a[i];
			j++;
		}
		return b;
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

	static int[] readArray() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Size of the array:");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the "+n +" elements in the arrray:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		return a;
	}
}