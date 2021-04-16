import java.util.Scanner;

public class StringPangram1 
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
		for(char c1='A',c2='a';c1<='Z';c1++,c2++)
		{
			if(s.indexOf(c1)==-1&&s.indexOf(c2)==-1)
				return false;
		}
		return true;
	}
}
