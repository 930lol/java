import java.util.Scanner;
public class StringFirstCharToCapital
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
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		s=new String(ch);
		System.out.println("The string after converting first character to uppercase: "+s);
	}

}
