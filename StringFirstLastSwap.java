import java.util.Scanner;
public class StringFirstLastSwap 
{
	public static void main(String[] args) 
	{
		int wc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String want to count word: ");
		String s= sc.nextLine();
		char ch[]=s.toCharArray();
		int f=0;
		for(int i=0;i<s.length();i++)
		{
			if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
			{
				f=i;
			}
			if(i==ch.length-1&&ch[i]!=' '||ch[i]!=' '&&ch[i+1]==' ')
			{
				char t=ch[f];
				ch[f]=ch[i];
				ch[i]=t;
			}
		}
		s=new String(ch);
		System.out.println("The string after converting first character to last character swap: "+s);
	}

}
