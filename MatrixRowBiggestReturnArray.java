import java.util.Scanner;
public class MatrixRowBiggestReturnArray
{
	int[][] readMat()
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
	public void dispMat(int[][] a) 
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

	int[] rowWiseBiggest(int[][] a) 
	{
		int b[]=new int[a.length];
		//int b[0]=a[0][0];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i][0];
			for(int j=0;j<a[i].length;j++)
			{
				if(b[i]<a[i][j])
					b[i]=a[i][j];
			}	
		}
		return b;
	}
	
}
