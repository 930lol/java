public class Test1 
{
	public static void main(String[] args) 
	{
		MatrixColBiggestReturnArray m =  new MatrixColBiggestReturnArray(); 
		System.out.println("Read the matrix:");
		int a[][]=m.readMat();
		System.out.println("Display the elements of the matrix:");
		m.dispMat(a);
		System.out.println("Col wise biggest elements:");
		int[] c=m.colWiseBiggest(a);
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]);
			if(i<c.length-1)
			{
				System.out.print(",");
			}
		}
		
	}

}
