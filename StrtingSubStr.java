import java.util.Scanner;

public class StrtingSubStr 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the  String you want to check ");
		String s1=sc.nextLine();
		System.out.println("Enter the substring you want to check it is part of string or not");
		String s2=sc.nextLine();
		boolean b=isSubstr(s1,s2);
		if(b==true)
			System.out.println("Substring "+s2+" is part of the String "+s1);
		else 
			System.out.println("Substring "+s2+" is not part of the String "+s1);
	}

	static boolean isSubstr(String s1, String s2) 
	{
		if(s2.length()-1>s1.length()-1)
			return false;
		else
		{
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			for(int i=0;i<c1.length;i++)
			{
				int j=0,k=i;
				while(j<c2.length && k<c1.length && c1[k]==c2[j])
				{
					j++;
					k++;
				}
				if(j==c2.length)
				{
					return true;
				}
			}
			return false;
		}
	}
}
