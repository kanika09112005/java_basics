package question100;
import java.util.Scanner;
public class conditional_Statement4 {
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		//simple calc
		System.out.println("enter number1 :");
		int a=s.nextInt();
		System.out.println("enter number2 :");
		int b=s.nextInt();
		System.out.println("enter the operator:");
		String choice=s.next();
		switch(choice) {
		case "+":
			System.out.println("addition: "+(a+b));
			break;
		case "-":
			System.out.println("difference: "+(a-b));
			break;
		case "*":
			System.out.println("product: "+(a*b));
			break;
		case "/":
			System.out.println("quotient: "+(a/b));
			break;
		case "%":
			System.out.println("remainder: "+(a%b));
			break;
		
	}

}}
