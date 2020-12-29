public class Main
{
    public static void referenceCheck(Object x,Object y)
    {
        if(x==y)
        {
            System.out.println("both pointing to the same reference");
        }
        else
        {
            System.out.println("both pointing to the difference reference");
        }
    }
    public static void main(String args[])
    {
        String str1="java";
        String str2="java";
        System.out.println("before modification in str1");
        referenceCheck(str1,str2);
        str1+="ava";
        System.out.println("after modification in str2");
        referenceCheck(str1,str2);
    }
}