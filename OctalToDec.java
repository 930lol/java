import java.util.*;
public class OctalToDec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to convert:");
		int n=sc.nextInt();
		int s=octToDec(n);
		System.out.println(s);

	}
	static int octToDec(int n)
	{
		int d=0,p=1;
		do {
			int r=n%10;
			d=d+r*p;
			p=p*8;
			n=n/10;
		}while(n!=0);
		return d;
	}


	
}
