package JATTask9;

import java.util.Scanner;
//Print the given number pattern
public class numberPattern {
	public static void main(String[] args) {
		//Variable declaration
	int i,j,k=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows to be printed :");
	int n=sc.nextInt();
	//printing the rows and columns with i and j
	//Outer loop to handle number of rows
	System.out.println("Your Number pattern :");
	for(i=1;i<=n;i++)
	{
		//inner loop to handle number of columns
		for(j=1;j<i+1;j++)
		{
			
			System.out.println(k+"");
			k++;
		}
		// print new line for each row
		System.out.println();
	}
	
}
	
}
