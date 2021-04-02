import java.util.*;
public class Prime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n=sc.nextInt();
		boolean rs= isPrime(n);
		if(rs==true)
		{
			System.out.println(n+" Prime number");
		}
		else
		{
			System.out.println(n+" Not a prime number");
		}
	}
	static boolean isPrime(int n)
	{
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
