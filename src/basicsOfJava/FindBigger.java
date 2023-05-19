package basicsOfJava;

import java.util.Scanner;

public class FindBigger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner x=new Scanner(System.in);
		System.out.println("Enter first number");
		a=x.nextInt();  //10  20  10
		System.out.println("Enter second number");
		b=x.nextInt();  //5   30  10
		if(a>=b) //10>5(t)   20>30(f)  10>=10(t)
		{
			if(a==b)
			{
				System.out.println("Both are Equal...");
			}
			else
			{
			System.out.println("First Number is greater than Second Number");
			}
			
		}
		else
		{
			System.out.println("Second Number is greater than First Number");
		}
		
	}

}
