import java.util.*;
public class Main
{
	static int round(int n)
	{
	    int a=(n/10)*10;
	    int b=a+10;
	    if(n-a>b-n)
	    {
	        return b;
	    }
	     else
	     {
	         return a;
	     }
	}
	public static void main(String args[])
	{
	    int n=4772;
	    System.out.println(round(n));
	}
}