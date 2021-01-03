
public class Main
{
    public static String convert(String s)
    {
        s=s.substring(0,1).toUpperCase()+s.substring(1);
        
        StringBuilder sb =new StringBuilder(s);
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)=='_')
            {
                sb.deleteCharAt(i);
                sb.replace(i,i+1,String.valueOf(Character.toUpperCase(sb.charAt(i))));
            }
        }
        return sb.toString();
    }
	public static void main(String[] args) {
	    String s="geeks_for_geeks";
		System.out.println(convert(s));
	}
}
