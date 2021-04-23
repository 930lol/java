import java.util.*;
import java.io.*;

class Loop1{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
           // System.out.println(a);
           int s=0;
           for(int j=0;j<n;j++)
           {
                int p=pow(2,j);
                if(j==0)
                {
                    System.out.print(s+(a+(p*b))+" ");
                    s=(s+(a+(p*b)));
                }
                else
                {
                    System.out.print((s+(p*b))+" ");
                    s=(s+(p*b));
                }
           }
           System.out.println();
            
        }
        in.close();
    }
    static int pow(int a,int i)
    {
        int r=1;
        while(i>0)
        {
            r=r*a;
            i--;
        }
        return r;
    }
}
