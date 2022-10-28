package AnudipCodes;

import java.util.Scanner;

public class FindEvenOddPrime {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to Check Prime or not");
		int n=sc.nextInt();
				
		if(n>=2){
			if(n%2!=0)
			{
				System.out.println("It is prime number");
			}
			else {
				System.out.println("It is not prime number");
			}
		}
		System.out.println("Enter the number to Check Odd or Even");
		int n1=sc.nextInt();
		if(n1%2==0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
	}

}
