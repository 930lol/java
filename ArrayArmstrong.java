import java.util.Scanner;
public class ArrayArmstrong 
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
		sc.close();
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
	static int checkArmstrong(int a[])
	{
		int c=0;
		for(int i=0;i<a.length;i++)
			if(check(a[i])==true)
			{
				c++;
			}
		return c;
	}
	
	static boolean check(int i) 
	{
		int cd=count(i);
		int t=i,s=0;
		while(i>0)
		{
			int r=i%10;
			s=s+pow(r,cd);
			i=i/10;
		}
		if(t==s)
		{
			System.out.println("The armstorng number:"+s);
			return true;
		}
		return false;
	}
	static int pow(int r, int cd) 
	{
		int p=1;
		while(cd>0)
		{
			p=p*r;
			cd--;
		}
		return p;
	}
	static int count(int i) 
	{
		int cd=0;
		while(i>0)
		{
			cd++;
			i=i/10;
		}
		
		return cd;
	}
	public static void main(String[] args) 
	{
		System.out.println("Create the array: ");
		int a[]=readArray();
		System.out.println("The elements of the array: ");
		display(a);
		int c=checkArmstrong(a);
		System.out.println("The total number of armstrong number "+c);
		
	}
}
