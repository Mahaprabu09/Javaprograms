package AnudipCodes;

public class PalindromeNumbercheck {
	public static void main(String[]args)
	{
		int num=4334;
		int reverse=0;
		int real=num;
		while(num!=0)
		{
			int lastno=num%10;
			reverse=reverse*10+lastno;
			num/=10;
		}
		
		if(reverse==real)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("It is not palindrome");
		}
	}

}
