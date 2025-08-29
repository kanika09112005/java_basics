package question100;
import java.util.Scanner;
public class conditional_statement2 {
	public static void main (String[]args)
	{ 	//positive.negativeand zero
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number to check status :");
		int n=s.nextInt();
		if(n==0)
			System.out.println("zero");
		else if(n>0)
			System.out.println("positive");
		else
			System.out.println("negative");
		//leap year check
		System.out.println("Enter the year :");
		int year=s.nextInt();
		if(year%4==0 && year%100!=0)
		{
			System.out.println("leap year");
		}else
			System.out.println("normal year");
		
		//vote eligibility
		System.out.println("Enter your age :");
		int age=s.nextInt();
		if(age>=18) {
			System.out.println("Eligible to vote");}
		else
			System.out.println("Not eligible to vote");
	}

}
