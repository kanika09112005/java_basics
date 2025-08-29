package question100;
import java.util.Scanner;
public class conditional_Statement {
	public static void main (String[]args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the number to check:");
	int number=s.nextInt();
	//odd or even
	if(number%2==0)
	{
		System.out.println("even number");
	}
	else
		System.out.println("odd number");
	
	//largest two
	System.out.println("LARGEST NUMBER OF TWO");
	System.out.println("Enter the first num :");
	int a=s.nextInt();
	System.out.println("Enter the second num :");
	int b=s.nextInt();
	if(a>b)
	{
		System.out.println(a +" is greater");
	}
	else
		System.out.println(b +" is greater");
	
	// largest three
	System.out.println("LARGEST NUMBER OF THREE");
	System.out.println("Enter the first num :");
	int num1=s.nextInt();
	System.out.println("Enter the second num :");
	int num2=s.nextInt();
	System.out.println("Enter the third num :");
	int num3=s.nextInt();
	if(num1>num2 && num1>num3)
	{
		System.out.println(num1 +" is greater");
    }
	else if(num2>num1 && num2>num3)
	{
		System.out.println(num2 +" is greater");
	}
	else
		System.out.println(num3 +" is greater");
}
}
