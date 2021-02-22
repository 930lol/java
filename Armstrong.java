import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int i,h,l;
		System.out.println("Enter the lower bound");
		l=sc.nextInt();
		System.out.println("Enter the higher bound");
		h=sc.nextInt();
		for(i=l;i<=h;i++)
		{
			int t=i,c=0;
			while(t>0)
			{
				c++;
				t=t/10;
			}
			//System.out.println(c);
			int n=i,r,s=0,f=1;
			int a=c;
			while(n>0)
			{
				r=n%10;
				while(a>0)
				{
					f=f*r;
					a--;
					//System.out.println(f);
				}
				s=s+f;
				f=1;
				n=n/10;
				a=c;
			}
			if(s==i)
			{
				System.out.println(s);
			}
			s=0;
		}
		
	}

}
