public class Main {  
    static int wordcount(String s)
    {
        int c=0;
        char ch[]=new char[s.length()];
        for(int i=0;i<s.length();i++)
        {
            ch[i]=s.charAt(i);
            if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))
            {
                c++;
            }
        }
        return c;
    }
   
    public static void main(String[] args) {  
        String s="India Is my country";  
        System.out.println(wordcount(s)+" words.");
    }  
}  