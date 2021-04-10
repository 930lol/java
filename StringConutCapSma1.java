import java.util.Scanner;
public class StringConutCapSma 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to captial and small letter in the String:");
		String s=sc.next();
		countletter(s);
		sc.close();

	}

	static void countletter(String s) 
	{
		int cl=0,sl=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i))>=65&&(s.charAt(i))<=91)
			{
				cl++;
			}
			else if((s.charAt(i))>=97&&(s.charAt(i))<=122)
			{
				sl++;
			}
		}
		System.out.println("The total number of capital letter in the string: "+cl);
		System.out.println("The total number of small letter in the string: "+sl);
	}

}
