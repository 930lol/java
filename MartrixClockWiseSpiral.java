import java.util.Scanner;
public class MartrixClockWiseSpiral
{
	public static void main(String[] args) 
	{
		System.out.println("Read the matrix:");
		int a[][]=readMat();
		System.out.println("Display the elements of the matrix:");
		dispMat(a);
		System.out.println("Matrixspiral clockwise right");
		spiralclock(a);
		System.out.println();
		System.out.println("Matrixspiral anti clockwise right");
		antiSpiralclock(a);
	}
	static void antiSpiralclock(int[][] a) 
	{
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.print(a[k][i]+" ");
			for(int k=i;k<j;k++)
				System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[k][j]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[i][k]+" ");
		}
		if(a.length%2==1)
			System.out.print(a[a.length/2][a.length/2]);
	}
	static int[][] colwiseRev(int[][] a) 
	{
		for(int i=0;i<a.length/2;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				int t=a[i][j];
				a[i][j]=a[a[i].length-1-i][j];
				a[a[i].length-1-i][j]=t;
			}
		}
		dispMat(a);
		return a;
	}
	static void spiralclock(int[][] a) 
	{
		for(int i=0,j=a.length-1;i<j;i++,j--)
		{
			for(int k=i;k<j;k++)
				System.out.print(a[i][k]+" ");
			for(int k=i;k<j;k++)
				System.out.print(a[k][j]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[j][k]+" ");
			for(int k=j;k>i;k--)
				System.out.print(a[k][i]+" ");
		}
		if(a.length%2==1)
			System.out.print(a[a.length/2][a.length/2]);
	}
	static int[][] readMat()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the row of the matrix");
		int r=sc.nextInt();
		System.out.println("Enter the column of the matrix");
		int c=sc.nextInt();
		int a[][]= new int[r][c];
		System.out.println("Enter the "+r*c+" elements in the matrix:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		return a;
	}
	static void dispMat(int[][] a) 
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}
