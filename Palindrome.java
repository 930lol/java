import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to check:");
		int n=sc.nextInt();
		boolean rs= isPalindrome(n);
		if(rs==true)
		{
			System.out.println(n+" Palindrome number");
		}
		else
		{
			System.out.println(n+" Not a Palindrome number");
		}
	}
	static boolean isPalindrome(int n)
	{
		return n==reverse(n);
	}
	static int reverse(int n)
	{
		int rev=0;
		while(n!=0)
		{
			int r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		return rev;
	}

}
