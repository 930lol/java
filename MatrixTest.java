
public class MatrixTest 
{

	public static void main(String[] args) 
	{
		MatrixRowBiggest m =  new MatrixRowBiggest(); 
		System.out.println("Read the matrix:");
		int a[][]=m.readMat();
		System.out.println("Display the elements of the matrix:");
		m.dispMat(a);
		System.out.println("The biggest elemenst row-wise is");
		m.rowWiseBiggest(a);

	}

}
