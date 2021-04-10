import java.util.Scanner;
public class StringCountDigit 
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
		int cd=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i))>=48&&(s.charAt(i))<=57)
			{
				cd++;
			}
		}
		System.out.println("The total number of capital letter in the string: "+cd);
	}

}
