import java.util.Scanner;
import java.util.Arrays;  
public class StringAngram 
{
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the first string");
		String f=sc.next();
		System.out.println("Enter the second string");
		String s=sc.next();
		boolean b=checkAngram(f,s);
		if(b==true)
		{
			System.out.println("Angram");
		}
		else
		{
			System.out.println("Not Angram");
		}
	}

	static boolean checkAngram(String f, String s) 
	{
		if(f.length()!=s.length())
		{
			return false;
		}
		else
		{
			char a[]=f.toCharArray();
			char b[]=s.toCharArray();
			Arrays.sort(a);
			Arrays.sort(b);
			if(Arrays.equals(a,b))
			{
				return true;
			}
		}
		return false;
	}
}
