package basicsOfJava;

import java.util.Scanner;

public class ArrayExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x=new Scanner(System.in);
		System.out.println("Method1");
		int[] age= {12,4,5,3,7};
		for(int i=0;i<5;i++)
		{
			System.out.println(age[i]);
		}
		System.out.println("Method2");
		int[] age1=new int[5];
		for(int i=0;i<age1.length;i++)
		{
		System.out.println("Enter age");
		age1[i]=x.nextInt();
		}
		System.out.println("Array Elements are");
//		age1[1]=20;
//		age1[2]=30;
//		age1[3]=40;
//		age1[4]=50;
		for(int i=0;i<age1.length;i++)
		{
			System.out.println(age1[i]);
		}
	}

}
