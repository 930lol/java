import java.util.Scanner;

public class StringFrequencyAlphabet 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String want to find frequency of each and every alphabet: ");
		String s= sc.nextLine();
		int c[]= new int[26];
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
			if(c[i]!=0)
				System.out.println((char)(i+65)+"--->"+c[i]);
		}
	}
}
