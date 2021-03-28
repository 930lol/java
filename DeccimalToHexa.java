import java.util.*;
public class DeccimalToHexa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you want to convert:");
		int n=sc.nextInt();
		String s=dectoHexa(n);
		System.out.println(s);

	}
	static String dectoHexa(int n)
	{
		String hx="";
		do {
			int r=n%16;
			if(r<10)
				hx=r+hx;
			else if(r==10)
				hx='A'+hx;
			else if(r==11)
				hx='B'+hx;
			else if(r==12)
				hx='C'+hx;
			else if(r==13)
				hx='D'+hx;
			else if(r==14)
				hx='E'+hx;
			else if(r==15)
				hx='F'+hx;
			n=n/16;
		}while(n!=0);
		return hx;
	}


}
