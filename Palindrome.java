public class Main
{
	public static boolean isPalindrome(String s)
	{
	    StringBuffer sb= new StringBuffer(s);
	    sb.reverse();
	    String rev=sb.toString();
	    if(s.equals(rev))
	    {
	        return true ;
	    }
	    else 
	    {
	        return false;
	    }
	}
	public static void main(String args[])
	{
	    System.out.println(isPalindrome("nitin"));
	    System.out.println(isPalindrome("jatin"));
	}
}