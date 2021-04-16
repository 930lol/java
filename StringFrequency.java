import java.util.Scanner;

public class StringFrequency 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String want to find frequency of each and every character ");
		String s= sc.nextLine();
		int c[]= new int[128];
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			c[ch]++;
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=0)
				System.out.println((char)i+"--->"+c[i]);
		}
	}
}
