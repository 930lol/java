public class Main
{
	public static String reverse(String s)
	{
	    char ch[]=s.toCharArray();
	    String a="";
	    for(int i=ch.length-1;i>=0;i--)
	    {
	        a=a+ch[i];
	    }
	    return a;
	}

    public static void main(String args[])
    {
        System.out.println(reverse("My Name Is Bikash Singh"));
    }
}