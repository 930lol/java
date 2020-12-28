public class Main
{
	public static void main(String[] args) {
	    String a="BIKASH HELLO";
		System.out.println(fun(a,7));
	}
	public static String fun(String a,int p)
	{
	    return a.substring(0,p)+a.substring(p+1);
	}
}
