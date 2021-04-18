import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
public class ListIterationDemo 
{
	public static void main(String[] args) 
	{
		List<String> l=new ArrayList<String>();
		l.add("Bikash");
		l.add("Rajat");
		l.add("Yash");
		l.add(1,"Raj");
		l.add(0,"Raj");
		l.add(null);
	//	Set<String> str=new TreeSet<String>(l);
		for(int i=0;i<l.size();i++)
		{
			String s= l.get(i);
			System.out.println(s);
		}
		System.out.println();
		for(String c:l)
		{
			System.out.println(c);
		}
		
	}
	

}
