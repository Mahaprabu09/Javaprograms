package AnudipCodes;

public class ReverseNumber {
	public static void main(String[]args)
	{
		int num=5234;
		int reverse=0;
		
		while(num!=0)
		{
			int lastno=num%10;
			reverse=reverse*10+lastno;
			num/=10;
		}		
		System.out.println("Given number reverse order :"+reverse);
		
	}

}
