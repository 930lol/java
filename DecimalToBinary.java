import java.util.*;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to convert:");
		int n=sc.nextInt();
		String s=dectoBin(n);
		System.out.println(s);
		
	}
	 static String dectoBin(int n)
	{
		String bin="";
		do {
			int r=n%2;
			bin=r+bin;
			n=n/2;
		}while(n!=0);
		return bin;
	}

}
