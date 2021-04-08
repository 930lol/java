import java.util.Scanner;
public class ArraySearch 
{
	public static void main(String[] args) 
	{
		System.out.println("Read the array");
		int a[]=readArray();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements want to search");
		int n=sc.nextInt();
		int b=searchElement(a,n);
		System.out.println("the elements present in "+b+" position");
		
	}
	static int searchElement(int[] a, int n) 
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)
			{
				return i;
			}
		}
		return -1;	
	}
	static int[] readArray()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array:"); 
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the "+n+" elements of the array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		return a;
	}

}
