import java.util.Scanner;

public class StringPangram 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String check the string is pangram or not: ");
		String s= sc.nextLine();
		boolean b=isPangram(s);
		if(b==true)
		{
			System.out.println("The string is pangram");
		}
		else
		{
			System.out.println("The string is not pangram");
		}
	}

	static boolean isPangram(String s) 
	{
		if(s.length()<26)
		{
			return false;
		}
		int c[] = new int[26];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z')
			{
				c[ch-65]++;
			}
			else if(ch>='a'&&ch<='z')
			{
				c[ch-97]++;
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==0)
			{
				return false;
			}
		}
		return true;
	}
}
