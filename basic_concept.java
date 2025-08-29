package question100;
import java.util.Scanner;
public class Section1_Basics {
	public static void main (String[]args)
	{
		System.out.println("Hello World!");
		//q1
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=s.next();
		System.out.println("Enter the age:");
		int age=s.nextInt();
		System.out.println("Enter the city:");
		String city=s.next();
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("City:"+city);
		System.out.println("My name is "+name+" I am "+age+"years old"+" I come from "+city);
		//q2
		System.out.println("Arithematic operation :");
		System.out.println("value for A :");
		int a=s.nextInt();
		System.out.println("Value for B : ");
		int b=s.nextInt();
		System.out.println(" a + b = "+(a+b));//q3
		System.out.println(" a - b = "+(a-b));//q4
		System.out.println(" a * b = "+(a*b));//q5
		System.out.println(" a / b = "+(a/b));
		System.out.println(" a % b = "+(a%b));//q6
		System.out.println("Square of A : "+(a*a));
		System.out.println("Cube of A : "+Math.pow(a,3));//q7
		//Swap by 3rd value--- q8
		int temp=0;
		temp=a;
		a=b;
		b=temp;
		System.out.println(a);
		System.out.println(b);
		//Swap without third value----q9
		int c=100;
		int d=200;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);
		// ascii value of character
	
		char ch='A';
		int asval=ch;
		System.out.println("Ascii-value :"+asval);
		
	}

}
