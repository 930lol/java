import java.util.Scanner;
public class StringLastCharToCapital 
{
	public static void main(String[] args) 
	{
		int wc=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String want to count word: ");
		String s= sc.nextLine();
		char ch[]=s.toCharArray();
		//System.out.println("array length "+ch.length);
		for(int i=0;i<s.length();i++)
		{
			 if(i==ch.length-1 &&ch[i-1]!=' '&&ch[i]!=' ')
			{
				if(ch[i]>='a' && ch[i]<='z')
				{
					ch[i]=(char)(ch[i]-32);
				}
			}
			else if(i>0 && ch[i-1]!=' ' && ch[i]==' ')
			{
				if(ch[i-1]>='a' && ch[i-1]<='z')
				{
					ch[i-1]=(char)(ch[i-1]-32);
				}
			}
			else 
			{
				if(ch[i]>='A' && ch[i]<='Z')
				{
					ch[i]=(char)(ch[i]+32);
				}
			}
		}
		s=new String(ch);
		System.out.println("The string after converting last character to uppercase: "+s);
	}
}
