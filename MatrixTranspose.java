import java.util.Scanner;
public class MatrixTranspose
{
	public static void main(String[] args) 
	{
		System.out.println("Read the matrix:");
		int a[][]=readMat();
		System.out.println("Display the elements of the matrix:");
		dispMat(a);
		System.out.println("Colwise reverse:");
		transpose(a);
	}
	static void transpose(int[][] a) 
	{
		int [][] t= new int[a[0].length][a.length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				t[j][i]=a[i][j];
			}
		}
		dispMat(t);
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
