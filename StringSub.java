import java.util.*;
public class StringSub 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string you want to check substring:");
		String s=sc.nextLine();
		System.out.println("Enter the substring part want to checck:");
		String p=sc.nextLine();
		sc.close();
		for(int i=0;i<s.length();i++)
		{
			for(int j=0;j<i;j++)
			{
				boolean b=check(p,s.subSequence(j,i));
				if(b==true)
				{
					System.out.println(p+"="+s.subSequence(j,i));
				}
			}
		}
	}
	static boolean check(String p, CharSequence s) 
	{
		if(p.equals(s))
		{
			return true;
		}
		return false;
	}
}
