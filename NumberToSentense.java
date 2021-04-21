import java.util.Scanner;

public class NumberToSentense 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number you wnat to convert in the sentence:");
		int n=sc.nextInt();
		nTwo(n/10000000,"crore");
		nTwo(n/100000%100,"lakh");
		nTwo(n/1000%100,"thousand");
		nTwo(n/100%10,"hundred");
		nTwo(n%100,"");
	}
	static void nTwo(int i, String str) 
	{
		String one[]= {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven"
						,"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String two[]= {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		if(i<20)
				System.out.print(one[i]);
		else
			System.out.print(two[i/10]+one[i%10]);
		if(i!=0)
			System.out.print(str+" ");
	}
}