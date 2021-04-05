import java.util.Scanner;
public class ArrayDouble 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements you want in the array: ");
		int n=sc.nextInt();
		System.out.println("Enter the "+n+" elements in the array: ");
		double a[] = new double[n];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextDouble();
		}
		System.out.println("Entered elements in the array: ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
			if(i<a.length-1)
			{
				System.out.print(",");
			}
		}
	}

}
