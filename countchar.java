import java.text.DecimalFormat;
public class Main
{
	static void CharPercentage(String s)
	{
	    int t=s.length();
	    int u=0;
	    int l=0;
	    int d=0;
	    int o=0;
	    for(int i=0;i<t;i++)
	    {
	        char c=s.charAt(i);
	        if(Character.isUpperCase(c))
	        {
	            u++;
	        }
	        else if(Character.isLowerCase(c))
	        {
	            l++;
	        }
	        else if(Character.isDigit(c))
	        {
	            d++;
	        }
	        else
	        {
	            o++;
	        }
	    }
	    double up=(u*100)/t;
	    double lp=(l*100)/t;
	    double dp=(d*100)/t;
	    double op=(o*100)/t;
	    DecimalFormat format =new DecimalFormat("##.##");
	    System.out.println("In " +s + " : ");
	    System.out.println("upper case: "+up+"%");
	    System.out.println("lower case: "+lp+"%");
	    System.out.println("digit case: "+dp+"%");
	    System.out.println("other case: "+op+"%");
	}
	public static void main(String args[])
	{
	    CharPercentage("India is my country 100%");
	}
}