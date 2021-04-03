import java.util.ArrayList;
import java.util.Collection;
public class ColmethodsDemo {
	public static void main(String[] args) 
	{
		//collection col = new ArrayList();
		Collection<String> cscol = new ArrayList<String>();
		cscol.add("Shrama");
		cscol.add("Manisha");
		cscol.add("Srinath");
		cscol.add("Umesh");
		Collection<String> eccol = new ArrayList<String>();
		cscol.add("Swati");
		cscol.add("Kamlesh");
		cscol.add("Nagarjuna");
		cscol.add("Bikash");
		Collection<String> mechcol = new ArrayList<String>();
		cscol.add("Katrina");
		cscol.add("Aliya");
		cscol.add("Shishira");
		cscol.add("Yami");
		cscol.add("Disha");
		Collection<String> tcscol = new ArrayList<String>();
		tcscol.addAll(cscol);
		tcscol.addAll(eccol);
		tcscol.addAll(mechcol);
		System.out.println(tcscol.size());
		System.out.println(tcscol);
		tcscol.remove("Umesh");
		tcscol.removeAll(mechcol);
		System.out.println("Umesh there ?  "+tcscol.contains("Umesh"));
		System.out.println("All Ec students presents ?  "+ tcscol.containsAll(eccol));
	}

}
