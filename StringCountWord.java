import java.util.Scanner;

public class StringCountWord 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence you want to conut the word in it:");
		String s=sc.nextLine();
		countletter(s);
		sc.close();

	}

	static void countletter(String s) 
	{
		int word=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				word++;
				break;
			}
		}
		System.out.println("The total number of digit in the string: "+(word+1));
		
	}

}
