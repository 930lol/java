import java.util.Scanner;
public class Strong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n=sc.nextInt();
		boolean rs= isStrong(n);
		if(rs==true)
		{
			System.out.println(n+" Strong number");
		}
		else
		{
			System.out.println(n+" Not a Strong number");
		}
	}
	static boolean isStrong(int n)
	{
		int s=0,t=n;
		while(n!=0)
		{
			int r=n%10;
			s=s+fact(r);
			n=n/10;
		}
		return s==t;
	}
	static int fact(int r)
	{
		int f=1;
		while(r>1)
		{
			f=f*r;
			r--;
		}
		return f;
	}

}
