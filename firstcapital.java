public class Main
{
	public static String capital(String s)
	{
	    String words[]=s.split("\\s");
	    String c="";
	    for(String w:words)
	    {
	        String f=w.substring(0,1);
	        String after=w.substring(1);
	        c=c+f.toUpperCase()+after+" ";
	    }
	    return c.trim();
	}
	public static void main(String args[])
	{
	    System.out.println(capital("my name is bikash singh"));
	    System.out.println(capital("hello i love my india"));
	}
}