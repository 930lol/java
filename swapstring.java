public class Main
{
	public static void main(String[] args) {
	    String a="BIKASH";
	    String b="SINGH";
	    System.out.println("swaping before:"+"a: "+a+" "+"b: "+b);
	    a=a+b;
	    b=a.substring(0,a.length()-b.length());
	    a=a.substring(b.length());
	    System.out.println("swaping after:"+"a: "+a+" "+"b: "+b);
	}
}
