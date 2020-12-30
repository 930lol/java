public class t
{
	public static String Check(String s)
	{
	    String words[]=s.split("\\s");
	    String reverseWord="";
	    for(String w:words)
	    {
	        StringBuilder sb = new StringBuilder(w);
	        sb.reverse();
	        reverseWord+=sb.toString()+" ";
	    }
	    return reverseWord.trim();
	}
}
public class  Main
{
	public static void main(String args[])
	{
	    t d = new t();
	    
	    System.out.println(d.Check("my name"));
	    System.out.println(d.Check("I am Bikash Singh"));
	}
}