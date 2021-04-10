import java.util.Scanner;
public class StringVowelCons 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to conut vowel and consonants in the String:");
		String s=sc.next();
		countletter(s);
		sc.close();

	}

	static void countletter(String s) 
	{
		int c=0,v=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a')||(s.charAt(i)=='e')||(s.charAt(i)=='i')||(s.charAt(i)=='o')||(s.charAt(i)=='u')||
					(s.charAt(i)=='A')||(s.charAt(i)=='E')||(s.charAt(i)=='I')||(s.charAt(i)=='O')||(s.charAt(i)=='U'))
			{
				v++;
			}
			else if((s.charAt(i))>=65&&(s.charAt(i))<=91||(s.charAt(i))>=97&&(s.charAt(i))<=122)
			{
				if((s.charAt(i)!='a')||(s.charAt(i)!='e')||(s.charAt(i)!='i')||(s.charAt(i)!='o')||(s.charAt(i)!='u')||
						(s.charAt(i)!='A')||(s.charAt(i)!='E')||(s.charAt(i)!='I')||(s.charAt(i)!='O')||(s.charAt(i)!='U'))
				{
					c++;
				}
			}
		}
		System.out.println("The total number consonant in the string: "+c);
		System.out.println("The total number vowel in the string: "+v);
	}

}
