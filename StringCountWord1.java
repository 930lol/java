import java.util.Scanner;
public class StringCountWord1
{
	public static void main(String[] args) 
	{
		int wc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String want to count word: ");
		String s= sc.nextLine();
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				wc++;
			}
		}
		System.out.println("The number of word present in the sentence: "+wc);
	}
}
