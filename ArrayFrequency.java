import java.util.Scanner;
public class ArrayFrequency  
{
	public static void main(String[] args) 
	{
		System.out.println("Read the array");
		int a[]=readArray();
		//countFrequency(a);
		int b[]=countElement(a);
		displayElements(b);
	}
	static void displayElements(int[] b) 
	{
		System.out.println("Frequency of each elements present in the array:");
		for(int i=0;i<b.length;i++)
		{
			if(b[i]!=0)
			{
				System.out.println(i+"---->"+b[i]);
			}
		}	
	}
	static int[] countElement(int[] a)
	{
		int big=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(big<a[i])
			{
				big=a[i];
			}
		}
		int c[] = new int[big+1];
		for(int i=0;i<a.length;i++)
		{
			c[a[i]]++;
		}
		return c;
	}
	static void countFrequency(int[] a)
	{
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			int c=1;
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					c++;
					a[j]=a[n-1];
					n--;
					j--;
				}

			}
			System.out.println(a[i]+" ----> "+c);
		}
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
