import java.util.Scanner;

public class StringPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  String you want to check it is Palindrome or not:");
		String s1=sc.nextLine();
		
		boolean b=isAngram(s1);
		if(b==true)
			System.out.println("String is palindrome");
		else 
			System.out.println("String is not palindrome");
	}

	static boolean isAngram(String s1) 
	{
		int i=0,j=s1.length()-1;
		while(i<j)
		{
			if(s1.charAt(i)!=s1.charAt(j))
			{
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

}
