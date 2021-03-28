import java.util.*;
public class DecimalToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to convert:");
		int n=sc.nextInt();
		String s=dectoOct(n);
		System.out.println(s);
	}
	static String dectoOct(int n)
	{
		String oct="";
		do {
			int r=n%8;
			oct=r+oct;
			n=n/8;
		}while(n!=0);
		return oct;
	}

}
