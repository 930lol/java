import java.util.Scanner;
public class StringSumOfDigit 
{
	public static void main(String[] args) 
	{
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string want to find sum of digit");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)>=48 && s.charAt(i)<=57)
			{
				sum=sum+(int)(s.charAt(i)-48);
			}
		}
		System.out.println("Sum of digit: "+sum);
	}

}
