package basicsOfJava;

import java.util.Scanner;

public class SwitchCaseExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		int a,b,ch;
		String ch1;
		do
		{
		System.out.println("Enter any number");
		a=x.nextInt();
		System.out.println("Enter any number");
		b=x.nextInt();
		System.out.println("1. Add 2.Sub 3.Mul 4.Div Enter your choice");
		ch=x.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("The addition of 2 numbers="+(a+b));
			break;
		case 2:
			System.out.println("The substraction of 2 numbers="+(a-b));
			break;
		case 3:
			System.out.println("The multipliction of 2 numbers="+(a*b));
			break;
		case 4:
			if(b==0)
			{
				System.out.println("Number can not be divisible by Zero");
			}
			else
			{
				System.out.println("The Division of 2 numbers="+(a/b));
			}
			break;
			default:
				System.out.println("Invalid Choice entered");
			
		}
		System.out.println("Do you want to continue Y/N?");
		ch1=x.next();
	}while(ch1.toUpperCase().equals("Y"));
	}

}
