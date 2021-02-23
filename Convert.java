import java.util.*;
public class Convert {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter the string :");
		String s=sc.nextLine();
		int i,val=0;
		int l=s.length();
		l--;
		int d=0;
		for(i=0;i<l;i++)
		{
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				val=(int)s.charAt(i)-48;
			}
			else if(s.charAt(i)>='a' && s.charAt(i)<='g')
			{
				val=(int)s.charAt(i)-97+10;
			}
			else if(s.charAt(i)>='A' && s.charAt(i)<='G')
			{
				val=(int)s.charAt(i)-65+10;
			}
			d=(int)(d+val*(Math.pow(17,l)));
			l--;
		}
		System.out.println(d);

	}
	

}
