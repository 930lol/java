import java.util.*;
public class Main
{
	static char firstRepeating(char s[])
	{
	    HashSet<Character> h = new HashSet<>();
	    for(int i=0;i<s.length-1;i++)
	    {
	        char c=s[i];
	        if(h.contains(c))
	        {
	            return c;
	        }
	        else
	        {
	            h.add(c);
	        }
	    }
	    return '\0';
	}
	public static void main(String args[])
	{
	    String str="geeksforgeeks";
	    char[] arr=str.toCharArray();
	    System.out.println(firstRepeating(arr));
	}
}