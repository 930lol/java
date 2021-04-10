import java.util.Scanner;

public class StringAlphaDiditSpecial 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to conut the numbers in the String:");
		String s=sc.next();
		countletter(s);
		sc.close();

	}

	static void countletter(String s) 
	{
		int cd=0,ca=0,sd=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i))>=48&&(s.charAt(i))<=57)
			{
				cd++;
			}
			else if((s.charAt(i))>=65&&(s.charAt(i))<=90 ||(s.charAt(i))>=97&&(s.charAt(i))<=122)
			{
				ca++;
			}
			else if(s.charAt(i)>=36&&s.charAt(i)<=38||s.charAt(i)==64)
			{
				sd++;
			}
		}
		System.out.println("The total number of digit in the string: "+cd);
		System.out.println("The total number of alpha in the string: "+ca);
		System.out.println("The total number of special in the string: "+sd);
		
	}

}
