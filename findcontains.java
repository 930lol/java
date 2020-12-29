public class Main
{
  public static boolean check(String s1,String s2)
  {
    if(s1.length()!=s2.length())
    {
        return false;
    }
    String s3=s1+s1;
    if(s3.contains(s2))
    {
        return true;
    }
    else
    {
        return false;
    }
  }
  public static void main(String args[])
  {
      String str1="avajava";
      String str2="javaava";
      System.out.println("Check if string is rotation of another");
      if(check(str1,str2))
      {
          System.out.println("yes "+ str2+ " is rotation of "+ str1);
      }
      else 
      {
          System.out.println("no "+ str2+ " is rotation of "+ str1);
      }
  }
}
