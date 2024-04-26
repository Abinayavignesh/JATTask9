package JATTask9;

import java.util.Scanner;

public class largestNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number to compare :");
		int firstnum=sc.nextInt();
		System.out.println("Enter the second number to compare :");
		int secondnum=sc.nextInt();
		System.out.println("Enter the third number to compare :");
		int thirdnum=sc.nextInt();
		if(firstnum>secondnum && firstnum>thirdnum)
		{
			System.out.println("First number is greater :" + firstnum);
		}
		else if(secondnum>firstnum && secondnum>thirdnum)
		{
			System.out.println("Second number is greater :" + secondnum);
		}
		else
		{
			System.out.println("Third number is greater :" + thirdnum);
		}
	}

}
