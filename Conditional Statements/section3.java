package question100;
import java.util.Scanner;
public class conditional_Statement3 {
	public static void main (String[]args)
	{ 
		//Grade System
		System.out.println("grade generator");
		Scanner s=new Scanner(System.in);
		/*
		System.out.println("Enter the marks :");
		int marks=s.nextInt();
		if(marks<=100 && marks>90)
			System.out.println("grade A");
		else if(marks<=90 && marks>75)
			System.out.println("grade B");
		else if(marks<=75 && marks>40)
			System.out.println("grade C");
		else
			System.out.println(" FAIL ");*/
		
		//vowels and consonants
		System.out.println("Enter the character to check :");
		char ch=s.next().charAt(0);
		char c=Character.toLowerCase(ch);
		char arr[]= {'a','e','i','o','u'};
		boolean flag=false;
		for(int i=0;i<5;i++)
		{
			if(c==arr[i])
			{
				System.out.println("Vowels");
				flag=true;
				break;
			}}
		if(!flag) {
				System.out.println("Consonants");
		}
	}
}
