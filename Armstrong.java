import java.util.Scanner;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n=sc.nextInt();
		boolean rs= isArmstrong(n);
		if(rs==true)
		{
			System.out.println(n+" Armstrong number");
		}
		else
		{
			System.out.println(n+" Not a Armstrong number");
		}
	}
	static boolean isArmstrong(int n)
	{
		int cd=countDigit(n),t=n;
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			s=s+pow(r,cd);
			n=n/10;
		}
		return s==t;
	}
	static int countDigit(int r)
	{
		int c=0;
		while(r!=0)
		{
			c++;
			r=r/10;
		}
		return c;
	}
	static int pow(int r,int dc)
	{
		int pw=1;
		while(dc>0)
		{
			pw=pw*r;
			dc--;
		}
		return pw;
	}

}
